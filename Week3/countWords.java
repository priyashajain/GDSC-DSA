class Solution 
{ 
    int countWords(String s) 
    { 
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))==true){
                count++;
                if(Character.isWhitespace(s.charAt(i+1))==true&&i+1<s.length()){
                    while(Character.isWhitespace(s.charAt(i))&&i<s.length()){
                        i++;
                    }
                    i--;
                }
            }
        }
        if(Character.isWhitespace(s.charAt(s.length()-1))==false){
            count++;
        }
        if(Character.isWhitespace(s.charAt(0))==true){
            count--;
        }
        return count;
    }
} 