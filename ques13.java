import java.util.Scanner;

//Java Program to Check Whether a Character is Alphabet or Not
public class ques13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch=s.charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println(ch+" is a character");
        }else{
            System.out.println(ch+" is not a character");
        }
    }
    
}
