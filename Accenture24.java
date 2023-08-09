import java.util.Scanner;

public class Accenture24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    private static int solve(int n){
        if(n%2==0){
            n/=2;
        }else{
            n-=1;
        }
        return n;
    }
}
