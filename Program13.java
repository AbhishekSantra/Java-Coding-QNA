import java.util.Scanner;
import java.util.Stack;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(solve(str));
    }
    private static boolean solve(String str) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                s.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                boolean  var=handleClosing(s,'(');
                if(!var){
                    return false;
                }
            }else if(str.charAt(i)=='}'){
                boolean  var=handleClosing(s,'{');
                if(!var){
                    return false;
                }
            }else if(str.charAt(i)==']'){
                boolean  var=handleClosing(s,'[');
                if(!var){
                    return false;
                }
            }
        }
        if(s.size()==0){
            return true;
        }else{
            return false;
        }
    }
    private static boolean handleClosing(Stack<Character>s,char openChar){
        if(s.size()==0){
            return false;
        }else if(s.peek()!=openChar){
            return false;
        }else{
            s.pop();
            return true;
        }
    }
}
