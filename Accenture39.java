import java.util.Scanner;

public class Accenture39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(solve(n,n1,n2));
    }

    private static boolean solve(int n, int n1, int n2) {
        if(n%n1==0 && n%n2==0){
            return true;
        }else return false;
    }
}
