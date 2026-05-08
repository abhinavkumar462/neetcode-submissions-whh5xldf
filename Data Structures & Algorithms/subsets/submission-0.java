class Solution {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> list1 = new ArrayList<>();

        addsub(nums, list1, 0);

        return list;
    }

    public void addsub(int[] nums, List<Integer> list1, int i) {

        if (i == nums.length) {
            list.add(new ArrayList<>(list1)); // copy
            return;
        }

        // include
        list1.add(nums[i]);
        addsub(nums, list1, i + 1);

        // backtrack
        list1.remove(list1.size() - 1);

        // exclude
        addsub(nums, list1, i + 1);
    }
}