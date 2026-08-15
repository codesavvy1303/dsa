import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14,  5, 14, 14,  3, 14, };
        count(arr);

    }
    static void count(int[]arr){

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println(arr[i]);
                return;
        }

        }
    }
}
