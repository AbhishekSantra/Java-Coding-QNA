//Java Program to Find all Roots of a Quadratic Equation
import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double a=sc.nextDouble(); 
       double b=sc.nextDouble(); 
       double c=sc.nextDouble(); 
       double root1,root2;
       double determinant= b*b - 4*a*c;
       if(determinant>0){
        root1=-b + Math.sqrt(determinant)/2*a;
        root2=-b - Math.sqrt(determinant)/2*a;
        System.out.format("Root1 is %.2f and Root2 is %.2f",root1,root2);
       }
       else if(determinant==0){
        root1=root2= -b/2*a;
        System.out.format("Root1 = Root2 = %.2f",root1);
       } else {
        double real=-b / 2*a;
        double img= Math.sqrt(- determinant);
        System.out.format("root1 = %.2f+%.2fi", real, img);
        System.out.format("\nroot2 = %.2f-%.2fi", real, img);
      }
    }

}    
