public class max_subarray_bruteforce {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        sub(nums);
    }
    static void sub(int[] nums){
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){


                  sum+=nums[j];
                   maxsum=Math.max(maxsum, sum);

            }
        }

    }
}
