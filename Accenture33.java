//Sum of prime factors of a number.

import java.util.Scanner;

public class Accenture33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
               if(solve(i)){
                sum+=i;
               }
            }
        }
        System.out.println(sum);
    }
    private static boolean solve(int n){
        for(int i=2;i<=n/2;i++){
            if(n%2==0){
                return false;
            }       
            
        }
        return true;     
    }
}
