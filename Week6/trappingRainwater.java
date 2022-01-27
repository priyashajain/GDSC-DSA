class Solution {
    public int trap(int[] height) {
        int[] olm = new int[height.length];
        int[] orm = new int[height.length];
        
        olm[0] = height[0];
        for(int i=1;i<height.length;i++){
            olm[i] = Math.max(height[i],olm[i-1]);
        }
        
        orm[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            orm[i]=Math.max(height[i],orm[i+1]);
        }
        int water=0;
        for(int i=1;i<height.length-1;i++){
            water+=Math.min(olm[i],orm[i])-height[i];
        }
        return water;
    }
}