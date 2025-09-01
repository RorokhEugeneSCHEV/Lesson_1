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

class FactorialCalculatorTest {

    @Test
    void testCalculateForZero() {
        assertEquals(1, FactorialCalculator.calculate(0));
    }

    @Test
    void testCalculateForOne() {
        assertEquals(1, FactorialCalculator.calculate(1));
    }

    @Test
    void testCalculateForPositiveNumber() {
        assertEquals(120, FactorialCalculator.calculate(5)); 
    }

    @Test
    void testNegativeInputThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculate(-1));
        assertTrue(exception.getMessage().contains("Отрицательные"));
    }
}