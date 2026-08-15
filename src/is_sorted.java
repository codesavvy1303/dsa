public class is_sorted {
    public static void main(String[] args) {
        int[]arr={1,2,6,63,95};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
              return false;
            }
        }
     return true;
    }
}
