import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd


public class ques7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+" is Odd");
        }
    }    
}
