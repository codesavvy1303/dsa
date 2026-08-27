import java.util.ArrayList;
import java.util.Arrays;

public class intersection_two_pointer {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 5, 6};
        intersect(arr1,arr2);
    }
    static void intersect(int[]arr1,int[]arr2){
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;

            }
        }
        System.out.println(ans);
    }
}
