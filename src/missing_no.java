public class missing_no {
    public static void main(String[] args) {
        int[]num={0,3,1};
        System.out.println(missing(num));

    }
    static int missing(int[]num){
        for(int i=0;i<=num.length;i++){
            boolean found=false;

            for(int j=0;j<num.length;j++){
                if(num[j]==i){
                    found=true;
                    break;
                }



            }
            if(!found){
                return i;
            }
        }
      return -1;
    }
}
