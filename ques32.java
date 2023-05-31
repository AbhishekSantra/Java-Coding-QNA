import java.util.Scanner;

// Java Program to Make a Simple Calculator Using switch...case
public class ques32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        double b = sc.nextDouble();
        System.out.println("Enter an operator:");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Wrong Operator");
                break;
        }
    }

}
