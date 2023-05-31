import java.util.Scanner;

//Java Program to Find Factorial of a Number
public class ques15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fact=1;
        for(int i = 1; i <= n; ++i)
        {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", n, fact);
    }
    
}
