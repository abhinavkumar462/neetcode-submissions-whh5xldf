class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        //int[] nums = Arrays.stream(tokens).filter(t -> t.matches("-?\\d+"))
                 //  .mapToInt(Integer::parseInt)
                 //  .toArray();

        for (String token : tokens) {
            
             
    if (token.equals("+") ) {
            int op1 =stack.pop();
                int op2= stack.pop();
                stack.push((op2) + (op1));
                continue;
        
    } 
    if(token.equals("-")){
        int op1 =stack.pop();
                int op2= stack.pop();
                stack.push((op2) - (op1));
                continue;

    }
    if(token.equals("*")){
      int op1 =stack.pop();
                int op2= stack.pop();
                stack.push((op1) *(op2));  
                continue;
    }
    if(token.equals("/")){
        int op1 =stack.pop();
                int op2= stack.pop();
                stack.push((op2)/(op1));
                continue;
    }
    
        int num = Integer.parseInt(token);
        stack.push(num);
    
}
        int p=stack.pop();
    
        
        return p;
        
    }
}
