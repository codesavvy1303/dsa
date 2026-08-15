public class sum_odd_even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        sum(arr);
    }
    static void sum(int[]arr){
        int odd=0;
        int even=0;
        for(int num:arr){
            if(num%2==0){
                even+=num;
            }else{
                odd+=num;
            }
        }
        System.out.println("even= "+even);
        System.out.println("odd= "+odd);
    }
    }
