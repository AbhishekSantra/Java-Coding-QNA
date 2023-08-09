/*The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same. */

import java.util.Scanner;
public class Accenture2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next ();
        int ans=solve(s);
        System.out.println(ans);
    }

    private static int solve(String s) {
        if(s==null){
            return -1;
        }
        int res=s.charAt(0)-'0';
        for(int i=1;i<s.length();){
            char c=s.charAt(i);
            i++;
            if(c=='A'){
                res = res & (s.charAt(i)-'0');
            }
            else if(c=='B'){
                res=res | (s.charAt(i)-'0');
            }else{
                res=res ^(s.charAt(i)-'0');
            }
            i++;
        }
        return res;
    }
}
