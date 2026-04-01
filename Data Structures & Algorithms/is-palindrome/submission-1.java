class Solution {
    public boolean isPalindrome(String s) {
        String cl = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = cl.toCharArray();
        int p=(cl.length()-1);
        for(int i=0;i<cl.length();i++){
            if((i==p)||(i>p)){break;}
            if(!(arr[i]==arr[p])){
                return false;
            }
            p=p-1;
        }
        return true;
        
    }
}
