import java.util.Scanner;

public class Accenture38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,n));
    }

    private static int solve(int[] arr, int n) {
        if(n==0) return -1;
        if(n<2) return 0;
        int buy1=arr[0];
        int sell1=arr[0];
        int buy2=arr[0];
        int sell2=arr[0];
        for(int i=0;i<n;i++){
            buy1=Math.min(buy1,arr[i]);
            sell1=Math.max(sell1,arr[i]-buy1);
            buy2=Math.min(buy2,arr[i]-sell1);
            sell2=Math.min(sell2,arr[i]-buy2);
        }
        return sell2;        
    }
}
