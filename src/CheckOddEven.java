public class CheckOddEven {
    public static void main(String[] args) {
        int number = -156787652;
        printIntOddOrEven(number);
    }

    public static void printIntOddOrEven(int number) {
        if (number % 2 != 0) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
    }
}
