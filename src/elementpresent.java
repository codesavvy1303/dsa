import java.util.Scanner;

public class elementpresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        System.out.println(ispresent(arr,6));
    }
    static boolean ispresent(int []arr,int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) {
                return true;
            }
        return false;
    }
}
