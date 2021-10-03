class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int idx=binarySearch(nums,target);
        int firstPos=idx;
        int lastPos=idx;
        if(idx==-1){
            int[] ans={-1,-1};
            return ans;
        }
        else{
            for(int i=idx-1;i>=0;i--){
                if(nums[i]==target){
                    firstPos=i;
                }
            }
            for(int i=idx+1;i<nums.length;i++){
                if(nums[i]==target){
                    lastPos=i;
                }
            }
            int[] ans={firstPos,lastPos};
            return ans;
        }
    }
    public int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high){
            
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        return -1;
    }
}