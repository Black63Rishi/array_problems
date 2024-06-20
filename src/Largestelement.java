import java.util.Scanner;

public class Largestelement{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
            int[] arr = new int[6] ;
            for(int i = 0; i <= 5 ;i++){
                System.out.println("Enter the numbers: "+ i  );
                arr[i] = obj.nextInt();
            }
            int largest = arr[0];
            for(int i=0;i<= 5;i++){
                if(arr[i] < largest){
                    largest = arr[i];
                }
            }
        System.out.println("The smaller number is:  " + largest);

    }
}