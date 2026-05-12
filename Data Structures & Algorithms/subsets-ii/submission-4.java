class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backtrack(nums, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] nums,int index, List<Integer> curr) {

        // add current subset
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {

            // skip duplicates
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
           }

            // choose
            curr.add(nums[i]);

            // explore
            backtrack(nums, i + 1, curr);

            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

}