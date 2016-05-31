import java.math.BigDecimal;

public class HarmonicSum {
    public static void main(String[] args) {
        BigDecimal harmonic = BigDecimal.ZERO;
        double harmonic1 = 0;
        for (int i = 1; i <= 50000; i++) {
            harmonic = harmonic.add(BigDecimal.ONE.divide(new BigDecimal(i), 15, BigDecimal.ROUND_HALF_UP));
            harmonic1 += 1f/i;
        }
        System.out.println(harmonic.toString());
        System.out.println(harmonic1);
    }
}
