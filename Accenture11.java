/*Input:
Str: apples
ch1:a
ch2:p
Output:
paales */
import java.util.Scanner;
public class Accenture11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        System.out.println(solve(s,ch1,ch2));
    }

    private static String solve(String s, char ch1,char ch2) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch1){
                ans=ans+ch2;
            }
            else if(s.charAt(i)==ch2){
                ans=ans+ch1;
            }else{
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
}
