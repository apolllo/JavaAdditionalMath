import java.math.BigDecimal;

public class HarmonicSum {
    public static void main(String[] args) {
        BigDecimal harmonic = BigDecimal.ZERO;
        double harmonic1 = 0;
        for (int i = 1; i <= 50000; i++) {
            harmonic.add(BigDecimal.ONE.divide(new BigDecimal(i), 9, BigDecimal.ROUND_HALF_UP));
            harmonic1 += 1f/i;
        }
        System.out.println(harmonic.toString());
        System.out.println(harmonic1);
    }
}
