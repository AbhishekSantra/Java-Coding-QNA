import java.util.Scanner;

public class Accenture23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    private static int solve(int n){
        int count=0;
        for(int i=5;n/i>=1;i=i*5){
            count+=n/i;
        }
        return count;
    }
}
