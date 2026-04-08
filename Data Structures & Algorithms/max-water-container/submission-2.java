class Solution {
    public int maxArea(int[] heights) {
        int j=(heights.length-1);
        int i=0;
        int water=0;
        int maxArea=0;
        while(i<j){
            
          water= (j - i)*Math.min(heights[i], heights[j]);
          maxArea=Math.max(maxArea,water);
          if(heights[i]<heights[j]){
            i++;
          }else{j--;}



        }
      return maxArea;
        
    }
}
