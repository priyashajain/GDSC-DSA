class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }
    static void reverseArray(int arr[],int l,int r){
        while(l<r){
		    int temp=arr[l];
		    arr[l]=arr[r];
		    arr[r]=temp;
		    l++;
		    r--;
		}
    }
}