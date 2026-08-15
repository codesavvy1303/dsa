import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 8, 1, 2, 3,4,4, 10, 6,2, 15};
        occurences(arr,4);

    }
    static void occurences(int[]arr,int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }

        }
        System.out.println(count);
    }
}
