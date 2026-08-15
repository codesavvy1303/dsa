import java.util.Scanner;

public class first_and_last_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        firstandlast(arr,14);

    }

    static void firstandlast(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("first= "+i);

               break;


            }

        }
        for (int i = arr.length-1; i>=0; i--) {
            if (target == arr[i]) {
                System.out.println("last= "+i);
                return;

            }

        }

    }
}
