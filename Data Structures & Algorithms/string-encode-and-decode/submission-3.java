class Solution {

    public String encode(List<String> strs) {

		StringBuilder encoded = new StringBuilder();

		for(String s : strs) {
			encoded.append(s.length()).append(':').append(s);
		}

		return encoded.toString();
	}

	public List<String> decode(String str) {

		int i = 0;

		List<String> result = new ArrayList<>();

		while(i < str.length()) {

			int j = str.indexOf(':', i);

			int length = Integer.parseInt(str.substring(i, j));

			j++;

			result.add(str.substring(j, j + length));

			i = j + length;
		}
		return result;
	}
}
