/*The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range. */

import java.util.Scanner;

public class Accenture1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=solve(r,unit,arr);
        System.out.println(ans);
    }

    private static int solve(int r, int unit, int[] arr) {
        int mul=r*unit;
        int sum=0;
        int count=0;
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            count++;
            if(sum>=mul){
                break;                
            }
        }
        if(sum<mul){
            return 0;
        }
        return count;
    }    
}
