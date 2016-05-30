import java.util.HashMap;
import java.util.Map;

public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 0;
        printNumberAsAWord1(number);
    }

    public static void printNumberAsAWord(int number) {
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void printNumberAsAWord1 (int number) {
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        dictionary.put(1, "ONE");
        dictionary.put(2, "TWO");
        dictionary.put(3, "THREE");
        dictionary.put(4, "FOUR");
        dictionary.put(5, "FIVE");
        dictionary.put(6, "SIX");
        dictionary.put(7, "SEVEN");
        dictionary.put(8, "EIGHT");
        dictionary.put(9, "NINE");

        String word = dictionary.containsKey(number) ? dictionary.get(number) : "OTHER";
        System.out.println(word);
    }
}
