//Java Program to Display Prime Numbers Between Two Intervals
import java.util.Scanner;
public class ques26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a<b){
            boolean flag=false;
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    flag=true;
                    break;
                }
            }
            if(!flag&&a!=0&&a!=1){
                System.out.print(a+" ");
            }
            ++a;

        }
    }
    
}