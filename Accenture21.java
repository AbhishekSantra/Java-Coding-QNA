/*You are required to implement the following function:

char* FrequentCharacterReplaced(char*' str, char x); 

The function accepts a string 'str' and a character 'x' as its arguments. You are required to find the most frequent character in string 'str' and replace it with character 'x' across the string, and return the same.  */

import java.util.Scanner;

public class Accenture21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char x=sc.next().charAt(0);
        System.out.println(solve(str,x));
    }
    private static String solve(String str,char x){
        String ans="";
        char max=' ';
        int maxnum=-1;
        int count[]=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(maxnum<count[str.charAt(i)]){
                maxnum=count[str.charAt(i)];
                max=str.charAt(i);
            }
            
        }
        ans=str.replace(max, x);
        return ans;

    }
}
