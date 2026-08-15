public class Largest_smallest_optimized {
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
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(largest-smallest);
    }
}
