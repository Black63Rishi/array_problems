public class smalllarge {
    public void smallest(int[] x) {
        int smallest = x[0];
        for (int i = 0; i <= x.length-1; i++) {
            if (smallest > x[i]) {
                smallest = x[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);
    }

    public void greatest(int[] y) {
        int largest = y[0];
        for (int i = 0; i <= y.length-1; i++) {
            if (largest < y[i]) {
                largest = y[i];
            }
        }
        System.out.println("The largest number is: " + largest);

    }

public static void main(String[] args) {
    int[] arr = {10, 20, 34, 56};
smalllarge obj = new smalllarge();
obj.smallest(arr);
obj.greatest(arr);
}
}

