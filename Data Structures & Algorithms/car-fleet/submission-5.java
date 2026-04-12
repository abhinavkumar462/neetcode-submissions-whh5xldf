class Solution {
    public int carFleet(int target, int[] pos, int[] sp) {
        //Set<Integer> set= new HashSet<>();
        int fleet=0;
        double  pre=0.0;
        int[][] pair = new int[pos.length][2];
        for (int i = 0; i < pos.length; i++) {
            pair[i][0] = pos[i];
            pair[i][1] = sp[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        for(int i=0;i<sp.length;i++){
         //int d = (int) Math.floor((double)(target - pos[i]) / sp[i]);
         double d =(double) (target - pair[i][0]) / pair[i][1];
          if(pre<d){  fleet++;
          pre=d;

          }
             
        }
        return fleet;
        
    }
}
