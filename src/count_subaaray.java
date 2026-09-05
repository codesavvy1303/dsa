import java.util.HashMap;

public class count_subaaray {
    public static void main(String[] args) {
        int[]nums={1,1,2,1};
        int k=3;
        count(nums,3);

    }
    static void count(int[]nums,int k){
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){

            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        System.out.println(count);
    }
}
