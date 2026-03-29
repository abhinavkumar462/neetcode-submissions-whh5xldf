class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        int b=nums.length;
        int[] out= new int[nums.length];

      for(int i=0;i < b;i++){

         List<Integer> list = new ArrayList<>();
        for (int num : nums) {
        list.add(num);}   
      
        list.remove(i);
        int product = 1;
        for (int num : list) {
        product *= num;
        }
        out[i]=product;


            
      }
return out;

        
    }
}  
