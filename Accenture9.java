/*Input:
Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront */
import java.util.Scanner;
public class Accenture9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(solve(s));
    }

    private static String solve(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                res=s.charAt(i)+res;
            }else{
                res=res+s.charAt(i);
            }
        }
        return res;
    }
}
