public class NumberComparator {
    public static String compare(int firstNum, int secondNum) {
        if (firstNum > secondNum) return firstNum + " больше " + secondNum;
        else if (firstNum < secondNum) return firstNum + " меньше " + secondNum;
        else return firstNum + " равно " + secondNum;
    }
}

class NumberComparatorTest {

    @Test
    void testFirstGreaterThanSecond() {
        assertEquals("10 больше 5", NumberComparator.compare(10, 5));
    }

    @Test
    void testFirstLessThanSecond() {
        assertEquals("5 меньше 10", NumberComparator.compare(5, 10));
    }

    @Test
    void testEqualNumbers() {
        assertEquals("10 равно 10", NumberComparator.compare(10, 10));
    }
}
