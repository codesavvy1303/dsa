import java.util.Scanner;

public class smallest_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 8, 1, 2, 3, 10, 6, 15};
        smallest_three(arr);
    }
    static void smallest_three(int[]arr){
        if (arr.length < 3) {
            System.out.println(-1);
            return;
        }
        int l=Integer.MAX_VALUE;
        int sl=Integer.MAX_VALUE;
        int tl=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<l){
                tl=sl;
                sl=l;
                l=arr[i];


            }
            else if(arr[i]<sl && arr[i]>l){

                tl=sl;
                sl=arr[i];

            } else if (arr[i]>sl && arr[i]<tl) {
                tl=arr[i];

            }

        }
        if(l==Integer.MAX_VALUE ||sl==Integer.MAX_VALUE || tl==Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(l);
            System.out.println(sl);
            System.out.println(tl);
        }

    }
}
