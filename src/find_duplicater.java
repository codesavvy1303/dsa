public class find_duplicater {
    public static void main(String[] args) {
        int[]nums={1,2,2,3,4,5};
        System.out.println(finddupe(nums));

    }
    static int finddupe(int[]nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                   return(nums[i]);
                }
            }
        }
      return -1;
    }
}
