import java.util.Scanner;

public class LeetCode2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] ans=searchRange(nums,target);
        System.out.println(ans);
    }  
    public static int[] searchRange(int[] nums, int target) {
    int []ans={-1,-1};
    int start=search(nums,target,true);       
    int end=search(nums,target,false);
    ans[0]=start;
    ans[1]=end;
    return ans;        
    }
    public static int search(int[] nums,int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return ans;
    }
}
