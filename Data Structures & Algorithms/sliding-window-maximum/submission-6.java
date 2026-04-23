class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int max1=0;
        //if(nums.length==1){return nums;}
      //  if(k==1){return nums;}
       
        
        
        int[] arr= new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            set.clear();
            for(int j=i; j<k+i;j++){
                set.add(nums[j]);

            }
            
             arr[i]=Collections.max(set);
            


        }
        return arr;
    }
}
