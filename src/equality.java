import java.security.KeyStore;

public class equality {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {8, 5, 6, 9};
        System.out.println(equality(first, second));


    }

    static boolean equality(int[] f, int[] s) {

        if (f.length != s.length) {
            return false;
        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] != s[i]) {
                return false;
            }
        }

        return true;
    }
}
