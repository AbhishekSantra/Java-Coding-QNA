import java.util.Scanner;

public class Accenture17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(i==solve(i)){
                System.out.println(i+" ");
            }
        }
    }

    private static int solve(int num) {
        int temp=num;
        int r=0;
        while(temp!=0){
            int d=num%10;
            r=(r*10)+d;
            num/=10;
        }
        return num;
    }
}
