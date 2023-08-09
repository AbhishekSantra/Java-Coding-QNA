import java.util.Scanner;

public class Accenture19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(arr, n);
    }

    private static void solve(int[] arr, int n) {
        int max=arr[0];int index=0;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }    
        System.out.println(max);
        System.out.println(index);
    }    
}
