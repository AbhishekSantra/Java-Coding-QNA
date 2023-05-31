import java.util.Scanner;

// Java Program to Find Factorial of a Number Using Recursion
public class ques35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long result=fact(n);
        System.out.println("Factorial of "+n+" ="+result);
                
    }
    public static int fact(int n){
        if(n>=1){
            return n*fact(n-1);
        }
        else{
            return 1;
        }
    }
    
}
