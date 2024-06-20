import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i = arr.length-1 ; i >= 0 ; i--){
            System.out.println(arr[i]);
        }
    }
}

