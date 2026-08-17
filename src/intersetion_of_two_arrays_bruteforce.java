import java.util.ArrayList;

public class intersetion_of_two_arrays_bruteforce {
    public static void main(String[] args) {
        int[]arr1={1,2,2,3,4};
        int[]arr2={2,2,5,6};
        intersection(arr1,arr2);

    }
    static void intersection(int[]arr1,int[]arr2){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] visited=new boolean[arr2.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(!visited[j] && arr1[i]==arr2[j]){
                    visited[j]=true;
                    ans.add(arr2[j]);
                    System.out.println(arr2[j]);
                    break;

                }
            }
        }
    }
}
