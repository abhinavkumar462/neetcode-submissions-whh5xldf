class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {

        Arrays.sort(nums);

        backtrack(nums, target, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] nums, int target,
                          int index,
                          List<Integer> curr) {

        // valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // loop through choices
        for (int i = index; i < nums.length; i++) {

            // skip duplicates
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // no need to continue
            if (nums[i] > target) {
                break;
            }

            // choose
            curr.add(nums[i]);

            // move to next index
            backtrack(nums, target - nums[i], i + 1, curr);

            // backtrack
            curr.remove(curr.size() - 1);
        }
    }
}