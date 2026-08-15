import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 5, 14, 14, 2, 3, 14, 4, 10, 6, 2, 15};
        count(arr,0,0);
    }
    static void count(int []arr,int odd,int even){
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
