class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] uniques = Arrays.stream(nums).distinct().toArray();
        long[] frequency = new long[uniques.length];
        int[] res = new int[k];

        for(int i = 0; i < uniques.length; i++) {
            int target = uniques[i];
            frequency[i] = Arrays.stream(nums).filter(n -> n == target).count();
        }

        for(int i = 0; i < frequency.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < frequency.length - 1 - i; j++) {
                if(frequency[j] < frequency[j+1]) {
                    swapped = true;
                    long tfreq = frequency[j];
                    frequency[j] = frequency[j+1];
                    frequency[j+1] = tfreq;

                    int tuniq = uniques[j];
                    uniques[j] = uniques[j+1];
                    uniques[j+1] = tuniq;
                }
            }
            if(swapped == false) {
                break;
            }
        }

        int idx = 0;
        while(k > 0) {
            res[idx] = uniques[idx];
            idx++;
            k--;
        }
        return res;
    }
}
