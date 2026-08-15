import java.util.Arrays;
import java.util.Scanner;

public class twopointerremovedupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 5, 14, 14, 3, 3, 3, 14, 15};
       remove(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] remove(int [] arr){
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
       return Arrays.copyOf(arr,i+1);
    }
}
