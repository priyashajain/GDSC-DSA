class Solution {
    public int pivotIndex(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        int n=nums.length;
        if((sum[n-1]-sum[0])==0){
            return 0;
        }
        for(int j=1;j<=n-2;j++){
            if(sum[j-1]==(sum[n-1]-sum[j])){
                return j;
            }
        }
        if(sum[n-2]==0){
            return (n-1);
        }
        return -1;
    }
}