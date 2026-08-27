import java.util.HashSet;

public class finddup_hashset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 5};
        System.out.println(hs(nums));
    }
    static int hs(int[]nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;


            }
            set.add(i);
        }
        return -1;
    }
}
