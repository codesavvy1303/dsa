public class missing_sumapproach {
    public static void main(String[] args) {
        int[]num={0,3,1};
        System.out.println(sum(num));

    }
    static int sum(int[]num){
        int n= num.length;;
        int count=0;
                for(int x:num){
                    count+=x;
                }

         int expected =  n*((n+1))/2;
                return expected-count;
    }
}
