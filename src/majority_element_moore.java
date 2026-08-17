import java.util.Scanner;

public class majority_element_moore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5,  14, 14,   3, 14, 1};
        moore(arr);

    }
    static int moore(int[]arr){
        int candidate=0;
        int vote=0;
        for(int i=0;i<arr.length;i++) {
            if (vote == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]){
                vote++;
            }else{
                vote--;
            }
        }
        int count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }
}
