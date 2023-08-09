// Given an integer K and an array arr[] of N integers which contains the ids of the opened apps in a system where 

// arr[0] is the app currently in use
// arr[1] is the app which was most recently used and
// arr[N – 1] is the app which was least recently used.

import java.util.Arrays;
import java.util.Scanner;

public class Accenture41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Arrays.toString(solve(arr,k)));
    }

    private static int[] solve(int[] arr, int k) {
        int appIndex=k%arr.length;
        int appId=arr[appIndex];
        for(int i=appIndex;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=appId;
        return arr;
    } 
}
