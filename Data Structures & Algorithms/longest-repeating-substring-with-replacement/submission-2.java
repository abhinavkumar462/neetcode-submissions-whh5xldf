class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];   // frequency of A–Z
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // Step 1: add current character to window
            freq[current - 'A']++;

            // Step 2: update max frequency in window
            maxFreq = Math.max(maxFreq, freq[current - 'A']);

            // Step 3: check if window is invalid
            int windowSize = right - left + 1;
            int changesNeeded = windowSize - maxFreq;

            if (changesNeeded > k) {
                // shrink window
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }

            // Step 4: update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}