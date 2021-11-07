class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(mat.length!=target.length){
            return false;
        }
        int count=0;
        if(isEqual(mat,target)){
            return true;
        }
        else{
        while(count<=3){
            count++;
            rotate(mat);
            if(isEqual(mat,target)){
                return true;
            }
        }
        }
        return false;
    }
    public boolean isEqual(int[][] mat,int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=t;   
            }
        }
    }
}