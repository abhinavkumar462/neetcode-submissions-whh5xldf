class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            // Add character
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Track max frequency in window
            maxFreq = Math.max(maxFreq, map.get(ch));

            // If replacements needed > k, shrink window
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }

            // Update answer
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}