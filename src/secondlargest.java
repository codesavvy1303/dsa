import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 8, 1, 2, 3, 10, 6, 15};
        secondlargest(arr);


    }
    static void secondlargest(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[arr.length-1]!=arr[i]){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
