import java.util.Arrays;
import java.util.Scanner;

public class copyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        copyelements(arr);
        inbuiltcopy(arr);
    }
    static void copyelements(int[]arr){
        int[]rep=new int[arr.length];
       ;
        for(int i=0;i<arr.length;i++){
            rep[i]=arr[i];


        }

        System.out.println(Arrays.toString(rep));
    }
    static void inbuiltcopy(int[]arr){

        int[]reo= Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(reo));


    }
    }
