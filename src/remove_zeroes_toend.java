import java.util.Arrays;

public class remove_zeroes_toend {
    public static void main(String[] args) {
        int [] arr={ 0,1,4,0,4,8,6,3,0,2,9};
        replace(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void replace(int[]arr){
        int rep=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[rep]=arr[i];
                rep++;
            }


        }
        for(int j=rep;j<arr.length;j++){
            arr[j]=0;
        }
    }
}
