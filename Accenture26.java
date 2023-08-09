import java.util.Scanner;

public class Accenture26 {
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
        int z=0;int o=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                z++;
            }
            else{
                o++;
            }
        }
        if(z<o){
            return z*2;
        }
        else{
            return o*2;
        }
    }
    
}
