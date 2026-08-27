import java.util.ArrayList;
import java.util.Arrays;

public class union_using_twopointer {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 5, 6};
        union(arr1,arr2);
    }

    static void union(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if(ans.isEmpty() || ans.get(ans.size()-1)!=arr1[i]) {
                    ans.add(arr1[i]);
                }

                i++;
            } else if (arr1[i] > arr2[j]) {
                if(ans.isEmpty() || ans.get(ans.size()-1)!=arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            } else {
                if(ans.isEmpty() || ans.get(ans.size()-1)!=arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;

            }
        }while (i < arr1.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }

        System.out.println(ans);
    }
}
