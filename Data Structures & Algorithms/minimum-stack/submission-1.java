class MinStack {
      int[] arr= new int[500];
      int top=-1;

    public MinStack() {
       // MinStack minStack=new MinStack();
        
    }
    
    public void push(int val) {

         arr[++top]=val;
        
    }
    
    public void pop() {
        top=top-1;
        
        
    }
    
    public int top() {
        return arr[top];
        
    }
    
    public int getMin() {
        
        
        return Arrays.stream(arr, 0, top+1).min().getAsInt();
        
    }
}
