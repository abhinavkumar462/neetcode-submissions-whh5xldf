class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        backtrack(nums, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] nums, int index, List<Integer> curr) {

        // add current subset
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {

            // choose
            curr.add(nums[i]);

            // explore
            backtrack(nums, i + 1, curr);

            // unchoose (backtrack)
            curr.remove(curr.size() - 1);
        }
    }
}