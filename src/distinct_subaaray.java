import java.util.HashSet;

public class distinct_subaaray {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,4};
        distinct(nums);

    }
    static void distinct(int[]nums){
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set= new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(set.contains(nums[j])){
                    break;
                }
                set.add(nums[j]);
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        System.out.println(maxlen);
    }
}
