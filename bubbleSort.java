import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={5,7,23,4,8,0};
        System.out.println("Before Sorting:-");
        System.out.println(Arrays.toString(arr));
        System.out.println("Asc or Dsc");
        String que=sc.nextLine();
        System.out.println("After Sorting:-");
        sort(arr,que);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr,String que) {
       int temp;
       boolean swap;
       for(int i=0;i<arr.length;i++){
        swap=false;
        for(int j=i+1;j<arr.length;j++){
            if(que.equalsIgnoreCase("Asc")){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }else{
                if(arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    swap=true;
                }
            }
        }  
        if(!swap){
            break;
        }  
       }
    }
    
}
