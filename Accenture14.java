/*Input:
m : 12
n : 50
Output
90
Explanation:
The numbers divisible by both 3 and 5, between 12 and 50 both inclusive are {15, 30, 45} and their sum is 90. */

import java.util.Scanner;

public class Accenture14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
