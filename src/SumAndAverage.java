public class SumAndAverage {
    public static void main(String[] args) {
        int end = 100; int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/end);
    }
}
