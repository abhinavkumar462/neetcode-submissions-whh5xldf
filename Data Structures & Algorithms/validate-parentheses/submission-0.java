class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char c : arr){
          // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                // if empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }


        if(stack.isEmpty()){
            return true;
        }else{return false;}
        


        
    }
}
