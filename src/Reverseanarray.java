public class Reverseanarray {
    public static void reverse(int[] arr){
        int sum = 0;
        int i;
        for( i = arr.length-1; i >= 0;i--) {
            System.out.print("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        reverse(arr);
    }
}
