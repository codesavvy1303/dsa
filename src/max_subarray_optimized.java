public class max_subarray_optimized {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        optisubarray(nums);

    }
    static void optisubarray(int[]nums){
        int n=nums.length;
        int maxstart=0;
        int maxend=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>maxsum){
                    maxsum=sum;
                    maxstart=i;
                    maxend=j;

                }}



        }
        for(int k=maxstart;k<=maxend;k++){
            System.out.print(nums[k]+" ");
        }

        System.out.println();

    }
}
