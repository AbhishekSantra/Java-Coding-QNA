import java.util.Scanner;

//Java Program to Find the Largest Among Three Numbers
public class ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println(n1+" is the Largest Number");
        }
        else if(n2>n1&&n2>n3){
            System.out.println(n2+" is the Largest Number");            
        }
        else{
            System.out.println(n3+" is the Largest Number");
        }
    }
    
}
