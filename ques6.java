import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter Second number");
        int secondNumber=sc.nextInt();
        System.out.println("Before swaping");
        System.out.println("First number: "+firstNumber);
        System.out.println("Second number: "+secondNumber);
        int temp=0;
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("After swaping");
        System.out.println("First number: "+firstNumber);
        System.out.println("Second number: "+secondNumber);
    }    
}
