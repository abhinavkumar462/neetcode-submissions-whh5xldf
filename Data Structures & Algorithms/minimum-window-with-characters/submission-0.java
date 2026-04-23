class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] hash = new int[256];

        // Store frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        // Sliding window
        while (right < s.length()) {

            // If character is needed
            if (hash[s.charAt(right)] > 0) {
                count++;
            }

            // Decrease frequency
            hash[s.charAt(right)]--;

            // When all characters matched
            while (count == t.length()) {

                // Update minimum window
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                // Remove left character
                hash[s.charAt(left)]++;

                if (hash[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        // Return result
        if (startIndex == -1) return "";
        return s.substring(startIndex, startIndex + minLen);
    }
}