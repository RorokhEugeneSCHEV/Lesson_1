public class FactorialCalculator {
    public static long calculate(int number) {
        if (number < 0) throw new IllegalArgumentException("Отрицательные значения недопустимы");
        if (number == 0 || number == 1) return 1L;
        
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialCalculatorTest {

    @Test
    public void testCalculateForZero() {
        assertEquals(FactorialCalculator.calculate(0), 1L);
    }

    @Test
    public void testCalculateForOne() {
        assertEquals(FactorialCalculator.calculate(1), 1L);
    }

    @Test
    public void testCalculateForPositiveNumber() {
        assertEquals(FactorialCalculator.calculate(5), 120L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeInputThrowsException() {
        FactorialCalculator.calculate(-1);
    }
}
