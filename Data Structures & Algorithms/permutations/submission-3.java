class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

//List<List<Integer>> ans = new ArrayList<>();

     // Arrays.sort(nums);

        backtrack(nums, 0);

        return ans;
    }

    public void swap(int[] nums, int i, int j) {

    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    return;
}

    public void backtrack(int[] nums, int index) {

        // add current subset
        if(index==nums.length){
        //ans.add(new ArrayList<>(curr));
        List<Integer> temp = new ArrayList<>();

for (int num : nums) {
    temp.add(num);
}

ans.add(temp);
        return ;}

        for (int i = index; i < nums.length; i++) {

            // choose
            //curr.add(nums[i]);
            //int[] copy = nums.clone();
            swap(nums, i, index);
            // explore
            backtrack(nums, index + 1);

            // unchoose (backtrack)
            swap(nums, i, index);
            
        }
    }
}
        
    
