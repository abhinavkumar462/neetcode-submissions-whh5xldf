class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int le=0;
        int ri=(matrix.length-1);
        int mid=0;
        int l=(matrix[0].length-1);


          while(le<=ri){
             mid= (le + (ri-le)/2);
            if(matrix[mid][0]==target){return true;}
            if(target>matrix[mid][0]&&target<=matrix[mid][l]){
                int s=0;
                int e=l;
                int m=0;
                while(s<=e){
                     m=( s + (e-s)/2);
                     if(matrix[mid][m]==target){return true;}
                     if(matrix[mid][m]<target){
                        s=m+1;
                     }else{e=m-1;}
                }return false;
             //for(int i =1; i<matrix[0].length;i++){
            //if(target==matrix[mid][i]){
               // return true;
         
                
            }
            else if(target>matrix[mid][l]){le=(mid+1);}
            else if(target<matrix[mid][0]){ri=(mid-1);}

        }
        
        return false;

     
        
    }
}
