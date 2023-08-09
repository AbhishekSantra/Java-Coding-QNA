import java.util.Arrays;
import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        int ans = findFloor(arr,target);
        System.out.println(ans);
    }

    static int findFloor(int[] arr,int target) {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];        
    }
    
}
