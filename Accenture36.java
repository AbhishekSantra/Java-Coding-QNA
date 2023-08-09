import java.util.Arrays;
import java.util.Scanner;

public class Accenture36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(solve(arr,n)));
    }

    private static int[] solve(int[] arr,int n) {
        for(int i=0;i<n;i++){
            int maxSum=0;int minSum=0;int result=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    maxSum+=arr[j];
                }else{
                    minSum+=arr[j];
                }
            }
            result=maxSum*minSum;
            arr[i]=result;            
        }
        return arr;
    }
}
