import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 5, 14, 14, 3, 3, 3, 14, 15};
       int[]result= removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                ans[index] = num;
                index++;

            }


        }
        return Arrays.copyOf(ans, index);
    }
}



