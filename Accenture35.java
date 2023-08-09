import java.util.Scanner;

public class Accenture35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(solve(str));
    }
    private static String solve(String str){
        String[] word=str.split("\s");
        String ans="";
        for(int i=word.length-1;i>=0;i--){
            ans=ans+word[i]+" ";
        }
        return ans;
    }
}
