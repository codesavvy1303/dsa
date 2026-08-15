public class pos_neg {

    public static void main(String[] args) {

        int[] arr = {1, 3, -5, -8, 7, 5, -3, -2};

        posneg(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void posneg(int[] arr) {

        for (int i = 0; i < arr.length; i++) {


            if (i % 2 == 0) {

                if (arr[i] > 0)
                    continue;


                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[j] > 0) {

                        int temp = arr[j];


                        for (int k = j; k > i; k--) {
                            arr[k] = arr[k - 1];
                        }

                        arr[i] = temp;
                        break;
                    }
                }

            }


            else {

                if (arr[i] < 0)
                    continue;


                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[j] < 0) {

                        int temp = arr[j];

                        for (int k = j; k > i; k--) {
                            arr[k] = arr[k - 1];
                        }

                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
    }
}