public class sumofelementsinarray {
    public static void sum(int[] x){
        int sum = 0;
        for(int i = 0; i <= x.length-1;i++){
            sum += x[i];
        }
        System.out.println("The sum is: "+ sum);
    }

    public static void main(String[] args) {
        int[] arr = { 2,3};
        sum(arr);
    }
}

