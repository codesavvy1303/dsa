public class xor_missingnumber {
    public static void main(String[] args) {
        int[] num = {0, 3, 1};
        System.out.println(xor(num));
    }
    static int xor(int[]num) {
        int xor = 0;
        for (int i = 0; i < num.length; i++) {
            xor ^= i;
            xor ^= num[i];
        }
        xor ^= num.length;
        return xor;
    }
}
