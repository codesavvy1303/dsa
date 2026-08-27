public class kadanesalgo_for_maxsubarray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        kadanes(nums);
    }
    static void kadanes(int[]nums){
        int n=nums.length;
        int maxstart=0;
        int maxend=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int tempstart=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
           if(sum>maxsum){
               maxsum=sum;
               maxstart=tempstart;
               maxend=i;
           }
            if(sum<0){
                sum=0;
                tempstart=i+1;

            }

        }
        System.out.println("Maxsum"+" "+maxsum);

        for(int k=maxstart;k<=maxend;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
