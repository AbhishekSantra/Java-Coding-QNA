import java.util.Scanner;

//Java Program to Check Leap Year
public class ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        boolean leap;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;
                }
                else{
                    leap=false;
                }
            }
            else{
                leap=true;
            }
        }
        else{
            leap=false;
        }
        if(leap){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }    
}
