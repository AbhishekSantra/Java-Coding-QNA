/*Input:

n: "1210"

Output:

3

Explanation:

0th position in the input contains the number of 0 present in input, i.e. 1, in 1st position the count of number of 1s in input i.e. 2, in 2nd position the count of 2s in input i.e. 1, and in 3rd position the count of 3s i.e. 0, so the number is an autobiographical number.

Now unique numbers in the input are 0, 1, 2, so the count of unique numbers is 3. So 3 is returned. */

import java.util.Scanner;

public class Accenture32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(solve(str));
    }
    private static int solve(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=Integer.parseInt(str.charAt(i)+"");
        }
        if(sum==str.length()){
            int count=0;
            int []arr=new int[10];
            for(int i=0;i<str.length();i++){
                arr[Integer.parseInt(str.charAt(i)+"")]++;                                
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    count++;
                }
            }
            return count;
        }
        else return 0;
    }
    
}
