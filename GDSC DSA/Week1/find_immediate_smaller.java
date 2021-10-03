class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
        int[] differences= new int[n];
        for(int i=0;i<n;i++){
            differences[i]=x-arr[i];
        }
        int k=0;
        while(k<n && differences[k]<=0){
            k++;
        }
        int diff;
        int ele;
        if(k<n){
            diff=differences[k];
            ele=arr[k];
        }
        else{
            return -1;
        }
        for(int i=1;i<n;i++){
            if(diff>0 && differences[i]>0 && differences[i]<diff){
                diff=differences[i];
                ele=arr[i];
            }
        }
        if(diff>0){
            return ele;
        }
        else{
            return -1;
        }
    }
}
