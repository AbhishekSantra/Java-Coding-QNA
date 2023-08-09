import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }

    private static void solve(int n) {
        int[]arr=new int[n];
        int a=0;int b=1;
        for(int i=0;i<n;i++){
            arr[i]=a;
            int c=a+b;
            a=b;
            b=c;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
