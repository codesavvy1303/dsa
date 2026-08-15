import java.util.Arrays;

public class positive_negative {
    public static void main(String[] args) {
        int[]arr={1,3,-5,-8,7,5,-3,-2};
        int[] result=reposition(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] reposition(int[]arr){
        int[] ans=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }
}
