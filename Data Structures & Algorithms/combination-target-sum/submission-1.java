

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        backtrack(nums, target, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] nums, int target, int index,
                          List<Integer> curr) {

        // found valid combination
        if (target == 0) {
            //if(!(ans.contains(curr))){
            ans.add(new ArrayList<>(curr));
            return;
        }

        // invalid case
        if (target < 0 || index == nums.length) {
            return;
        }
       if(nums[index]<=target)
        // choose current number
       {
        curr.add(nums[index]);

        // stay at same index (can reuse same number)
        backtrack(nums, target - nums[index], index, curr);

        // backtrack
        curr.remove(curr.size() - 1);}


        // skip current number
        backtrack(nums, target, index + 1, curr);
    }
}