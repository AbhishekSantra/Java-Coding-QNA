import java.util.Scanner;

//Java Program to Check Armstrong Number
// e.g, 153= 1^3+5^3+3^3=153
// 9474= 9^4+4^4+7^4+4^4=9474
public class ques27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0,c;
        while(n>0){
           int r=n%10;
           c=r*r*r;
           sum=sum+c;
           n=n/10;
        } 
        n=temp;
        if(sum==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }       
    }
    
}
