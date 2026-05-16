class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack(s, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(String s, int index,
                          List<String> curr) {

        // partition completed
        if (index == s.length()) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // try every substring
        for (int i = index; i < s.length(); i++) {

            // substring from index to i
            String part = s.substring(index, i + 1);

            // check palindrome
            if (isPalindrome(part)) {

                curr.add(part);

                backtrack(s, i + 1, curr);

                // backtrack
                curr.remove(curr.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}