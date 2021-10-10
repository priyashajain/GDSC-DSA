class Solution{
    
    // Function to find 
    static int segregate(int arr[], int size)
    {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                j++;
            }
        }

        return j;
    }
    static int findMissingPositive(int arr[], int size)
    {
        int i;

        
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }

        
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1; 
        

        return size + 1;
    }
    static int findMissing(int arr[], int size)
    {
       
       // Your code here
       int shift = segregate(arr, size);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }
        
        return findMissingPositive(arr2, j);
       
    }
}