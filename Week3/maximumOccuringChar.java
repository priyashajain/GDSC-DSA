class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int[] freq=new int[256];
        char res=' ';
        int max=-1;
        for(int i=0;i<line.length();i++){
            int ch=line.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<256;i++){
            if(max<freq[i]){
                max=freq[i];
                res=(char)i;
            }
        }
        return res;
    }
    
}