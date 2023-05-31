//Java Program to Check Palindrome
import java.util.Scanner;
public class ques24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        
        while(n!=0){
            int r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        if(temp==reverse){
            System.out.printf("%d is a palindrome number",temp);
        }
        else{
            System.out.printf("%d is not a Palindrome number",temp);
        }
        
    }
    
}
