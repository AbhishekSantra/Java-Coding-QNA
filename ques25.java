// Java Program to Check Whether a Number is Prime or Not
import java.util.Scanner;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
public class ques25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.printf("%d is a prime number.",n);
        }else{
            System.out.printf("%d is not a prime number.",n);
        }
    }
    
}
