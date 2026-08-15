public class pairsum {
    public static void main(String[] args) {
        int[]arr={1,2,9,7,5,4,8,3};
        sun(arr,9);
    }
    static  void sun(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) {
                    System.out.println(arr[i] +""+arr[j]);

                }

            }

        }

    }
}
