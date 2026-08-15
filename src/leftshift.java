import java.util.Arrays;

public class leftshift {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        leftshift(first);
        System.out.println(Arrays.toString(first));
    }
   static void leftshift(int[]arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}
