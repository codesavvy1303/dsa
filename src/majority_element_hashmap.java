import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majority_element_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5,  14, 14,   3, 14, 1};
        countfreq(arr);
    }

    static void countfreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>arr.length/2){
                System.out.println(entry.getKey());
                return;
            }
        }

    }
}
