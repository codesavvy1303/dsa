import java.util.HashSet;

public class missing_hashset {
    public static void main(String[] args) {
        int[] num = {0, 3, 1};
        System.out.println( missied(num));
    }
    static int missied(int[]num){
        HashSet<Integer> set=new HashSet<>();
        for(int all:num){
            set.add(all);
        }
        for(int i=0;i<=num.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }


}
