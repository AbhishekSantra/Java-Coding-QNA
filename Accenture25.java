import java.util.Scanner;

public class Accenture25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,n));
    }

    private static int solve(int[] arr, int n) {
        int result=0;
        for(int i=1;i<n;i++){
            result+=Math.abs(arr[i]-arr[i-1]);
        }
        return result;
    }
}
