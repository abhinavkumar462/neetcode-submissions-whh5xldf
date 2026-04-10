class Solution {
    public int trap(int[] height) {
         int right=(height.length);
         
         int trap=0;
        for(int i=0;i<height.length;i++){
            int lmax = Arrays.stream(height, 0, i+1).max().getAsInt();
            int rmax = Arrays.stream(height, i, right).max().getAsInt();
            trap = trap +(Math.min(lmax, rmax) - height[i]);
            

        }return trap;
        
    }
}
