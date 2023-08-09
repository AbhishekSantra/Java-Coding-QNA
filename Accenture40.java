import java.util.Scanner;

public class Accenture40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(solve(n,m));
    }
    private static int solve(int n, int m) {
        int res1=0;
        int res2=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<m-1;j++){
                if((i+j)%n==0){
                    res1=res1+i;
                }else{
                    res2=res2+i;
                }
            }
        }
        return Math.abs(res1-res2);
    }
}
