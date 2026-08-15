import java.util.Arrays;
import java.util.Scanner;

public class replaceoccurerences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5,14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        replace(arr,14,13);
        System.out.println(Arrays.toString(arr));
    }
       static void replace(int[]arr,int target,int r){
      for(int i=0;i< arr.length;i++){
          if(arr[i]==target){
              arr[i]=r;
          }
      }
       }
    }
