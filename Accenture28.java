import java.util.Scanner;

public class Accenture28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int []arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(solve(arr1,arr2));
    }

    private static int solve(int[] arr1, int[] arr2) {
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i]*arr2[(arr2.length-1)-i];
        }
        return sum;
    }
}
