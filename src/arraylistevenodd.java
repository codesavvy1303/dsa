import java.util.ArrayList;
import java.util.Scanner;

public class arraylistevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        evenodd(arr);
    }
    static void evenodd(int[]arr){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
