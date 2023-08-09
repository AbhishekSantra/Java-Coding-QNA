/*
 * input: n=3
 * set=2
 * output: 14
 * explain: 2^n=8
 *      i<8    0=000,1=001,2=010,3=011,4=100,5=101,6=110,7=111
 *      set=2, so count 1's if it 2 then sum that numbers 
 */

import java.util.Scanner;

public class Accenture31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int set=sc.nextInt();
        System.out.println(solve(n,set));
    }
    private static int solve(int n,int set){
        int ans=0;
        for(int i=0;i<Math.pow(2,n);i++){
            int count=0;
            int x=i;
            while(x>0){
                if((x&1)!=0){
                    count++;
                }
                x=x>>1;
            }
            if(count==set){
                ans+=i;
            }
        }
        return ans;
    }
}