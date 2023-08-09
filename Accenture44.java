// Next Smallest Nmber
// Input:
// 8
// 3 2 11 7 6 5 6 1
// Output:
// 2 1 7 6 5 1 1 -1 
import java.util.Scanner;

public class Accenture44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=solve(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }

    private static int[] solve(int[] arr, int n) {
        for(int i=0;i<n;i++){
            if(i==n-1) arr[i]=-1;
            else{
                int j;
                for(j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        arr[i]=arr[j];
                        break;
                    }
                }
                if(j==n) arr[i]=-1;
            }
        }
        return arr;
    }    
}
