// Sum of Natural Numbers Using Recursion
import java.util.Scanner;
public class ques34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=addnumber(num);
        System.out.println("Sum= "+sum);        
    }
    public static int addnumber(int num){
        if(num!=0){
            return num+addnumber(num-1);
        }
        else{
            return num;
        }
    }
    
}
