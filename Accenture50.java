import java.util.Scanner;

public class Accenture50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(solve(str,n));
    }

    private static String solve(String str, int n) {
        int len=str.length();
        int k=0;
        int c=len/n;
        int r=n;
        char [][]arr=new char[r][c];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                if(k!=len){
                    arr[j][i]=str.charAt(k++);
                }
                else{
                    arr[j][i]='X';
                }
            }
        }
        String ans="";
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans+=arr[i][j];
            }
        }
        return ans;
    }    
}
