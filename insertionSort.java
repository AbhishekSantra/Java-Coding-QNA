import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int []arr={5,7,2,4,8,0};
        System.out.println("Before Sorting:-");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting:-");
        sort(arr);
        System.out.println(Arrays.toString(arr));     
    }

    private static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
