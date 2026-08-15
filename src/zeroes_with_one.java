import java.util.Arrays;

public class zeroes_with_one{
    public static void main(String[] args) {
        int[]arr={3, 2, 6, 8, 0, 0, 0, 3, 4};
        zero_to_onr(arr);

    }
    static void zero_to_onr(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
