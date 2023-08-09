import java.util.Scanner;

public class Accenture27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int []arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int []arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(solve(arr1,arr2,n1,n2,k)); 
    }

    private static int solve(int[] arr1, int[] arr2, int n1, int n2,int k) {
        int max=0;int min=0;
        for(int i=0;i<n1;i++){
            if(arr1[i]>9){
                max++;
            }
        }        
        for(int i=0;i<n2;i++){
            if(arr2[i]<9){
                min++;
            }
        }  
        return Math.max(max,min);      
    }
}
