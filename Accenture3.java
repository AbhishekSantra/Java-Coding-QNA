/*You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number */

import java.util.Scanner;

public class Accenture3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(solve(str));
        
    }

    private static int solve(String str) {
        int n=str.length();
        int num=0;int chr=0;
        if(n<4) return 0;
        if(str.charAt(0)>='0' && str.charAt(0)<='9') return 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ' || str.charAt(i)=='/') return 0;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') chr++;
            if(str.charAt(i)>='0' && str.charAt(i)<='9') num++;
        }
        if(chr>0 && num>0) return 1;
        else return 0;
    }
    
}
