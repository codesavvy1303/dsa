import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmap_intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 5, 6};
        inter(arr1,arr2);
    }
    static void inter(int[]arr1,int[]arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int j=0;j<arr2.length;j++){
            if(map.containsKey(arr2[j]) && map.get(arr2[j])>0){
                ans.add(arr2[j]);
                map.put(arr2[j], map.get(arr2[j]) - 1);

            }


        }
        System.out.println(ans);
    }
}
