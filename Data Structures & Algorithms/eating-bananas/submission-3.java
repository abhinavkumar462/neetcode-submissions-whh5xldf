class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         
         double sum=h+1;
        int min=1;
        // int maxsum=0;
        // int max1 = Arrays.stream(piles).max().getAsInt();

       while(sum>h){
            sum=0;
         for(int j=0;j<piles.length;j++){
            //sum=0;
            sum = sum + (piles[j] + min - 1) / min;
            
         }
         min=min+1;
         //maxsum =Math.max(maxsum, sum);
         

        }

        return (min-1);
        
    }
}
