import java.util.Scanner;

public class bettersecondlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 8, 1, 2, 3, 10, 6, 15};
        second(arr);
    }
    static void second(int[]arr){
        if (arr.length < 2) {
            System.out.println(-1);
            return;
        }
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){

                sl=l;
                l=arr[i];


            }
             else if(arr[i]>sl && arr[i]<l){
                sl=arr[i];

            }

        }
        if(sl==Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(sl);
        }

    }
}
