/*Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range */

import java.util.Arrays;
import java.util.Scanner;

public class Accenture7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,n,sum));
    }

    private static int solve(int[] arr,int n,int sum) {
        if(n<2) return -1;
        Arrays.sort(arr);
        int check=arr[0]+arr[1];
        return check<=sum?arr[0]*arr[1]:0;
    }
}
