// Dublicate bracket
// input:
// ((a+b)-(c+d))
// output: false
// input:
// (a+b)-((c+d))
// output: true

import java.util.Scanner;
import java.util.Stack;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(solve(str));
    }

    private static boolean solve(String str) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                if(s.peek()=='('){
                    return true;
                }else{
                    while(s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                }
            }else{
                s.push(str.charAt(i));
            }
        }
        return false;

    }
}
