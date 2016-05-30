import java.math.BigDecimal;

public class ComputePI {
    public static void main(String[] args) {
        BigDecimal pi = new BigDecimal(355).divide(new BigDecimal(113), 6, BigDecimal.ROUND_FLOOR);
        System.out.println(Math.PI);
        System.out.println(pi.toString());
        System.out.println(pi.compareTo(new BigDecimal(Math.PI)));
    }
}
