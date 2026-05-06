class Solution {
    public void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int[] temp = new int[end - start + 1];
        int idx = 0;

        while(i <= mid && j <= end) {
            if(arr[i] > arr[j]) {
                temp[idx] = arr[j];
                j++;
                idx++;
            }
            else{
                temp[idx] = arr[i];
                i++;
                idx++;
            }
        }

        while(i <= mid) {
            temp[idx] = arr[i];
            i++;
            idx++;
        }

        while(j <= end) {
            temp[idx] = arr[j];
            j++;
            idx++;
        }

        for(int x = 0; x < idx; x++) {
            arr[x + start] = temp[x];
        }
    }

    public void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        mergeSort(nums, start, end);
        return nums;    
    }
}