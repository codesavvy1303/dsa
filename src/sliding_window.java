import java.util.HashSet;

public class sliding_window {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6};
            slide(nums);
    }
    static void slide(int[]nums){
            int left=0;
            int maxlen=0;
        HashSet<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            maxlen=Math.max(maxlen,right-left+1);

        }
        System.out.println(maxlen);
    }
}
