import java.util.Arrays;

public class replacement_of_negs {
    public static void main(String[] args) {
        int[]arr={3,2,6,8,-5,-2,-7,3,4};
        replacew0(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void replacew0(int[]arr){
      for(int i=0;i<arr.length;i++){
          if(arr[i]<0){
              arr[i]=0;
          }
      }
      for(int num:arr){
          if(num<0){
              num=0;
          }
      }
    }
}
