import java.util.Scanner;

public class Accenture16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mul=1;int sum=0;
        System.out.println("Expected results are: ");
        for(int i=1;i<=10;i++){
            mul=num*i;
            System.out.print(mul+" ");
            sum+=mul;
        }
        System.out.println("\n"+sum);
    }
}
