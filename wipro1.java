public class wipro1 {
    public static void main(String[] args) {
        int [] arr={12,23,34,21};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println(max);
    }    
}
