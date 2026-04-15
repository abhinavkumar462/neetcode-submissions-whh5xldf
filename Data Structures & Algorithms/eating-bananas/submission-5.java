class Solution {
    public int calculateSum(int[] piles, int min) {
    int sum = 0;

    for (int j = 0; j < piles.length; j++) {
        sum += (piles[j] + min - 1) / min;
    }

    return sum;
}
    public int minEatingSpeed(int[] piles, int h) {
         
        
        int m=1;
        int l=1;
        int max1 = Arrays.stream(piles).max().getAsInt();
        
        

       while(l<=max1){
           
         int min= (l+(max1-l)/2);
         m=calculateSum(piles,min);
         if(m<=h){
            max1=min-1;
         }else{l=min+1;}
         
         

        }

        return (l);
        
    }
}
