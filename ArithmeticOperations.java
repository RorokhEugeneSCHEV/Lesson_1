public class ArithmeticOperations {
    public static String perform(int num1, int num2) {
        return "Сложение: " + (num1 + num2) +
               "\nВычитание: " + (num1 - num2) +
               "\nУмножение: " + (num1 * num2) +
               "\nДеление: " + (num2 != 0 ? (double) num1 / num2 : "Деление на ноль!");
    }
}

class ArithmeticOperationsTest {

    @Test
    void testSimpleAdditionSubtractionMultiplicationDivision() {
        String actualResult = ArithmeticOperations.perform(10, 5);
        String expectedResult = "Сложение: 15\nВычитание: 5\nУмножение: 50\nДеление: 2.0";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivisionByZero() {
        String actualResult = ArithmeticOperations.perform(10, 0);
        String expectedResult = "Сложение: 10\nВычитание: 10\nУмножение: 0\nДеление: Деление на ноль!";
        assertEquals(expectedResult, actualResult);
    }
}
