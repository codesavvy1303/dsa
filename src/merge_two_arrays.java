import java.util.Arrays;

public class merge_two_arrays {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {8, 5, 6, 9};
        merge(first,second);

    }

    static void merge(int[] f, int[] s) {
        int[] m = new int[f.length + s.length];
        for (int i = 0; i < f.length; i++) {
            m[i] = f[i];
        }
        for (int i = 0; i < s.length; i++) {
            m[i+ f.length] = s[i];
        }
        System.out.println(Arrays.toString(m));
    }
}
