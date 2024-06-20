//public class Frequency {
//    public static void numfrequency(int[] x, int count) {
//        int i;
//        int j;
//        int size = x.length;
//        count=0;
//        for (i = 0; i < size; i++) {
//            int sum = x[i];
//            for (j = 0; j < size; j++) {
//                if (j == x[j]) {
//                    count++;
//                }
//                System.out.println("the frequency of " + x[i] + "is" + count);
//            }
//        }
//
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 2, 3,3,5};
//        int count = 0;
//        numfrequency(arr, count);
//    }
//}
public class Frequency {
    public static void main(String[] args) {
        int num = 2;

        int[] arr = {1, 1, 2, 2, 2, 3,4};
        for (int i = 0; i <= arr.length - 1; i++) {
            int count = 0;
            int flag = 0;
            for (int j = i +1 ; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                continue;

            for(int j = 0;j <= i;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }    System.out.println("the frequency of" + arr[i] + "is" + count);



        }
    }
}