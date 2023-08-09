import java.util.Scanner;

public class Accenture30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(solve(str));
    }
    private static int solve(String str){
        if(str.length()<4){
            return 0;
        }
        if(str.charAt(0)>='0'&& str.charAt(0)<='9'){
            return 0;
        }
        int num=0,chr=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '||str.charAt(i)=='/') return 0;
            if(str.charAt(i)>='0' && str.charAt(i)<='9') num++;
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z') return chr++;
        }
        if(num>0&&chr>0){
            return 1;
        }
        else return 0;
    }
}
