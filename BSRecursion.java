public class BSRecursion {
    public static void main(String[] args) {
        int[] arr={2,5,8,10,24,56,78};
        int target=24;
        int ans=search(arr, target,0,6);   
        System.out.println(ans);  
    }   
    public static int search(int arr[],int target,int s,int e){
        if(s>e) return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]>target) return search(arr,target,s,mid-1);
        return search(arr, target, mid+1, e);              
    } 
}
