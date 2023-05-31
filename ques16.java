import java.util.Scanner;

//Java Program to Generate Multiplication Table
public class ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",n,i,n*i);
        }    
    }
    
}
