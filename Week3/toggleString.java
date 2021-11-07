class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();   
        String str="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)('A'+ch-'a');
                
            }
            else if(ch>='A' && ch<='Z'){
                ch=(char)('a'+ch-'A');
                
            }
            str+=ch;
            
        }
        System.out.println(str);
    }