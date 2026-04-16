class Solution {
    public int findMin(int[] nums) {
          
    //int r=0;
    int low = 0;
    int mor=nums[0];
    //int l=0;
    //int ri=nums.length - 1;
    int high = nums.length - 1;
    int mid = 0;
    while (low <= high) {
        //int a=mid;
        mid = low + (high - low) / 2;  // avoids overflow
        //r=mid;
         mor=Math.min(mor,nums[mid]);
         mor=Math.min(mor,nums[low]);
         if (nums[mid] >=nums[low]) {
            low = mid + 1;  // search right half
        } 
        else {
            high = mid - 1; // search left half
        }
        
    }
    //if((mid+1)>ri){
        //return nums[l];
    //}

    

       
    return mor;
        
        
    }
}
