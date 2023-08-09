import java.util.Scanner;

public class LeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[]letters=new char[n];
        for(int i=0;i<n;i++){

           letters[i] = sc.next().charAt(0);
        }
        char target=sc.next().charAt(0);
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
