public class TriangleAreaCalculator {
    public static double calculate(double a, double b, double c) throws IllegalArgumentException {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Неверные размеры сторон.");
        }
        
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }
}

class TriangleAreaCalculatorTest {

    @Test
    void testValidTriangle() {
        double expectedArea = 6.0; 
        assertEquals(expectedArea, TriangleAreaCalculator.calculate(3, 4, 5), 0.001); 
    }

    @Test
    void testInvalidTriangleThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculate(1, 2, 3));
        assertTrue(exception.getMessage().contains("Неверные"));
    }

    @Test
    void testDegenerateTriangleThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculate(1, 1, 2));
        assertTrue(exception.getMessage().contains("Неверные"));
    }
}
