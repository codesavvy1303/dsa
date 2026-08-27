import java.util.HashMap;
import java.util.Scanner;

public class countelemnts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 5, 14, 14, 3,  14, 15};
        countfreq(arr);
    }
    static void countfreq(int[]arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
