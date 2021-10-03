class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> leadersArray=new ArrayList<>();
        Stack<Integer> nums=new Stack<>();
        Stack<Integer> ans=new Stack<>();
        nums.push(arr[n-1]);
        ans.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(nums.size()>0 && nums.peek()<=arr[i]){
                nums.pop();
            }
            if(nums.size()==0){
                ans.push(arr[i]);
            }
            nums.push(arr[i]);
        }
        while(ans.size()>0){
            int lead=ans.pop();
            leadersArray.add(lead);
        }
        return leadersArray;
    }
}
