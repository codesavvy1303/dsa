import java.util.Arrays;
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 8, 1, 2, 3, 10, 6, 15};
        maxmin(arr,arr[0],arr[0]);
    }
    static void maxmin(int[]arr, int max,int min){
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    }




