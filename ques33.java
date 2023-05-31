import java.util.Scanner;

// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
public class ques33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=num/2;i++){
            if(prime(i)){
                if(prime(num-i)){
                    System.out.printf("%d=%d+%d\n",num,i,num-i);
                    flag=true;
                }
            }
        }
        if(!flag){
            System.out.println(num+" cannot be expressed as the sum of two prime numbers. ");

        }
        
    }
    static boolean prime(int num){
        boolean check=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                check=false;
                break;
            }

        }
        return check;

    }
    
}
