class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int[] sum=new int[n];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        
        int[] freq=new int[max-min+1];
        for(int i=0;i<n;i++){
            freq[arr[i]-min]++;
        }
        for(int i=0;i<n;i++){
            if(freq[arr[i]-min]>1){
                return i+1;
            }
        }
        return -1;

    }
}
