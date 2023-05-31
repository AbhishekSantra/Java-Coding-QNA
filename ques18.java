import java.util.Scanner;

// Java Program to Find GCD of two Numbers
public class ques18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp1=n1;
        int temp2=n2;
        while(n1!=n2){
            if(n1>n2){
                n1-=n2;
            }
            else{
                n2-=n1;
            }
        }
        System.out.format("The GCD of %d and %d is %d",temp1,temp2,n1);
    }
    
}
