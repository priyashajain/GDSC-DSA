class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<2){
            //System.out.println(0);
            return n;
        }
        //int i=0;
        int idx=1;
        for(int i=1;i<n;i++){
             if(nums[i]!=nums[i-1]){
                    nums[idx]=nums[i];
                    idx++;
            }
        }
        return idx;
        
        
        
    }
}