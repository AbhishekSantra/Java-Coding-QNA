import java.util.Scanner;

public class Accenture29 {
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
        int max=arr[n-1];
        int sum=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                sum+=arr[i];
            }
        }
        return sum;
    }
}
