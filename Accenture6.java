/*def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’ */

import java.util.*;

public class Accenture6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,n));
    }

    private static int solve(int[] arr,int n) {
        if(n<=3) return 0;
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        even.add(arr[0]);
        for(int i=1;i<n;i++){
            if(i%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int large=even.get(even.size()-2);
        int small=odd.get(odd.size()-2);
        return large+small;
    }
}
