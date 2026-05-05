class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        
        int [] ans=new int[2*a];
        //ans=nums;
        for(int i=0;i<(a);i++)
        {
            ans[i]=nums[i];
            ans[i+a]=nums[i];
        }
        
        return ans;

        
    }
}