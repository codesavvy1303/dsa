import java.util.Arrays;
import java.util.Scanner;

public class arrevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        arrays(arr);

    }
    static void arrays(int[] arr){
        int evenidex=0;
        int oddindex=0;
        int[]even=new int[arr.length];
        int[]odd=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               even[evenidex]= arr[i];
                evenidex++;
            }else{
                 odd[oddindex]=arr[i];
                 oddindex++;
            }

        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}
