// Java Program to Display Prime Numbers Between Intervals Using Function
import java.util.Scanner;
public class ques29 {
    public static boolean checkPrimeNumber(int num) {
        boolean flag=true;
        for(int i=2;i<num/2;++i){
            if(num%i==0){
                flag=false;
                break;
            }             
        }
        return flag;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while (a<b) {
            if(checkPrimeNumber(a)){
                System.out.print(a+" ");
            }
            ++a;
        }
    }
    
}
