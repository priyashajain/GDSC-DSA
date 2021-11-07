class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=n-1;
        int fill=1;
        int limit=n*n;
        while(fill<=limit){
            
            for(int j=minCol;j<=maxCol;j++){
                arr[minRow][j]=fill;
                fill++;
            }
            minRow++;
            for(int i=minRow;i<=maxRow;i++){
                arr[i][maxCol]=fill;
                fill++;
            }
            maxCol--;
            for(int j=maxCol;j>=minCol;j--){
                arr[maxRow][j]=fill;
                fill++;
            }
            maxRow--;
            for(int i=maxRow;i>=minRow;i--){
                arr[i][minCol]=fill;
                fill++;
            }
            minCol++;
               
        }
        
        return arr;
    }
}