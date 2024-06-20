//public class Repeatingelements {
//    public static void main(String[] args) {
//        int[] arr = {3,3,4,5,6,7};
//
//        for(int i = 0; i < arr.length;i++){
//            int count =0;
//            int flag = 0;
//            for(int j = i+1;j < arr.length;j++) {
//                if (arr[i] == arr[j]) {
//                    flag = 1;
//                    count++;
//                }
//            }
//                if(flag == 1)
//                    continue;
//                for (int j = 0;j <arr.length;j++){
//                    if(arr[i] == arr[j]){
//                        count++;
//                    }
//                if(count > 1){
//                    System.out.println(arr[j]);
//                }
//            }
//        }
//    }
//}
public class Repeatingelements {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2,3,4};
        int count = 1;
        int sum;
        for(int i = 0;i <= arr.length-1;i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    continue;
                }
                if(count > 1) {
                    System.out.println(arr[i]);
                }
            }


        }

        }

    }