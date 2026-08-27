import java.util.Arrays;
import java.util.HashSet;

public class union_of_array {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={4,5,6};
        int[] ans = union(arr1, arr2);

        System.out.println(Arrays.toString(ans));

    }
    static int[] union(int[]arr1,int[]arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr1){
            set.add(num);
        }
        for(int num: arr2){
            set.add(num);
        }
        int[]result=new int[set.size()];
        int index=0;
        for(int num:set){
            result[index]=num;
            index++;
        }
        return result;
    }
}
