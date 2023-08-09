import java.util.Scanner;

public class Accenture20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(solve(num,m));
        System.out.println((float)5/2);
    }

    private static int solve(int num,int m) {
        int max=0;int min=0;
        for(int i=1;i<m;i++){
            if((num+i) %m==0){
                max=num+i;
            }
            if((num-i) %m==0){
                min=num-i;
            }
        }
        int maxdiff=max-num;
        int mindiff=num-min;
        if(maxdiff>mindiff) return min;
        else return max;
    }
}
