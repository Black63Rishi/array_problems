public class SecondSmallestElement {
    public void second(int[] x) {
        int smallest = x[0];
        int count = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            if (smallest > x[i]) {
                smallest = x[i];
            }
        }
        System.out.println("The smallest element is :" + smallest);
        int element = Integer.MAX_VALUE;
        for(int i = 0; i<= x.length-1;i++) {
            if (smallest != x[i] && x[i] < element) {
                element = x[i];
            }
        }   System.out.println("The second smallest element is: " + element);
    }


    public static void main(String[] args) {
      int[] x = {2,3,4,5,6,7};
      SecondSmallestElement obj = new SecondSmallestElement();
      obj.second(x);
    }
}
