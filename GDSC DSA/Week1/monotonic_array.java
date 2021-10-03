class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag_inc=0;
        int flag_dec=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                flag_inc=1;
                break;
            }
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                flag_dec=1;
                break;
            }
        }
        if(flag_inc==0 || flag_dec==0){
            return true;
        }
        if(flag_inc==1 && flag_dec==1){
            return false;
        }
        return false;
    }
}