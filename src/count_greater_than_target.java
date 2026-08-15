import java.util.Scanner;

public class count_greater_than_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 8, 1, 2, 3, 10, 6, 15};
        System.out.println( count(arr,5));

    }
    static int count(int[]arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                count++;

            }
        }
        return count;
    }
}
