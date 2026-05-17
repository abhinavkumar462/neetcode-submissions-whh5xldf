class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        backtrack(digits, 0, "", map);

        return ans;
    }

    public void backtrack(String digits,
                          int index,
                          String curr,
                          String[] map) {

        // completed one combination
        if (index == digits.length()) {
            ans.add(curr);
            return;
        }

        // current digit
        int digit = digits.charAt(index) - '0';

        String letters = map[digit];

        // try every letter
        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            backtrack(digits,
                      index + 1,
                      curr + ch,
                      map);
        }
    }
}