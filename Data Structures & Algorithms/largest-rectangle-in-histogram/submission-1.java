class Solution {
    public int largestRectangleArea(int[] he) {
       int area=0;
       int t =he.length;
       //Arrays.sort(he);
        for(int i=0;i<t;i++){
              int left = i;
            while (left >= 0 && he[left] >= he[i]) {
                left--;
            }

            // expand right
            int right = i;
            while (right < t && he[right] >= he[i]) {
                right++;
            }

            int width = right - left - 1; // important
            int currArea = he[i] * width;

            area = Math.max(area, currArea);
        }

        return area;
    }
}
