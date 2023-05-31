import java.util.Scanner;

// Java Program to Display Fibonacci Series
public class ques17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1;
        for(int i=0;i<n;i++){
            System.out.print(f1+",");
            int next=f1+f2;
            f1=f2;
            f2=next;            
        }
        
    }
    
}
