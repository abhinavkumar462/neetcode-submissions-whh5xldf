class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] out=new int[temp.length];
        

        for(int i=0;i<temp.length-1;i++){
            //int count=1;
            for(int j=i+1;j<temp.length;j++){
                
                if(temp[i]<temp[j]){
                out[i]=j-i;
                break;
                 
                }
            }
            
        }
        return out;
        
    }
}
