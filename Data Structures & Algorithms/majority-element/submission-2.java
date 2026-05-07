class Solution {
    public int majorityElement(int[] nums) {

        //
        int el=nums[0];
        int co =0;
        for(int i=0;i<nums.length;i++){
            if(co==0){el=nums[i];
            co=1;}
            else if(el==nums[i]){co++;}
            else{co--;}

            
        }
        int co1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){co1++;}

        }
        if(co1>(nums.length)/2){return el;}
        return -1;
        
    }
}