class Solution{
    static long factorial(int N){
        if(N==0||N==1){
           return 1;
       }
       return N*factorial(N-1);
    }
}