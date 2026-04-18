class Solution {
    public int lengthOfLongestSubstring(String s) {
       int count=0;
       int max1=0;
       
  int j=0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
           
               
            while(set.contains(arr[i])){
                set.remove(arr[j]);
                j++;
                count--;
                } set.add(arr[i]);
                count++;
                max1=Math.max(max1,count);
        }
      return max1;
        
    }
}
