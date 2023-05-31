import java.util.Scanner;

// Java Program to Compute Quotient and Remainder
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }    
}
