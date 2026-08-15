public class difference_LS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        diff(arr);
    }
    static void diff(int[]arr){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];


            }
        }
        System.out.println("largest "+largest);

        for(int j=0;j<arr.length;j++){
            if(arr[j]<smallest){
                smallest=arr[j];


            }
        }
        System.out.println("smallest "+smallest);
        System.out.println(largest-smallest);
    }
}
