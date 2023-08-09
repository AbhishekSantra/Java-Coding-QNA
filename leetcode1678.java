//Goal Parser Interpretation......
class leetcode1678 {
    public String interpret(String command) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<command.length();i++){
            char c=command.charAt(i);
            if(c=='G'){
                s.append(c);
            }
            else if(c=='(' && command.charAt(i+1)==')'){
                s.append('o');
                i+=1;
            }
            else{
                s.append('a').append('l');
                i+=3;
            }
        }
        return s.toString();
    }
}