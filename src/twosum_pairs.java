import java.sql.SQLOutput;
import java.util.*;
import java.util.HashSet;
public class twosum_pairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 7, 5, 4, 8, 3};
       twosum(arr,9);

    }
    static void twosum(int[]arr,int target){
        HashSet<Integer> set=new HashSet<>();
        for(int num :arr){
             int needed =target-num;
             if(set.contains(needed)){
                 System.out.println(needed + " " + num);
             }
             set.add(num);
        }

    }
}
