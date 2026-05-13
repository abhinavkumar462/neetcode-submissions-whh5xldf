class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
      

    
        backtrack("",n,0,0);

        return ans;
    }

    public void backtrack( String curr,int n,int o,int c){

        // add current subset
       if(curr.length()==2*n){
        ans.add(curr);return; }

        //for (int i = index; i <n; i++) {
          //if(o==n){return ;}
            // skip duplicates
            
            if(o<n){
            backtrack( curr+"(", n,o+1,c);}
            
            // backtrack
            if(c<o){
            
            backtrack( curr+")", n,o,c+1);
            }
        //}
    }

}
        
 