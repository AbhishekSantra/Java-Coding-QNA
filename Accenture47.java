/*Reverse String
 * input: a^bk$c
 * output: c^kb$a
 */
public class Accenture47 {
    public static void main(String[] args) {
        solve("a^bk$c");
        // System.out.println(solve("a^bk$c"));
    }

    private static void solve(String str) {
        char[]ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                ch[i]=str.charAt(i);                         
            }
        }
        for(int i=ch.length-1;i>0;i++){
            ch[i]=ch[ch[i]];           
        }
        System.out.println(ch);
        
        
    }    
}
