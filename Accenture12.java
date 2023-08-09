/*( a+ b ) , if c=1
( a – b ) , if c=2
( a * b ) ,  if c=3
(a / b) ,  if c =4 */
import java.util.Scanner;

public class Accenture12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solve(c,a,b));
    }

    private static int solve(int c, int a, int b) {
        if(c==1) return a+b;
        if(c==2) return a-b;
        if(c==3) return a*b;
        if(c==4) return a/b;
        return 0;
    }
}
