class Main {
    static class MyArraySizeException extends Exception {}

    static class MyArrayDataException extends Exception {
        private final int row;
        private final int column;

        MyArrayDataException(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return "Неверные данные в ячейке (" + row + "," + column + ")";
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException(); 
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[][] inputArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        try {
            int result = sumArrayElements(inputArray);
            System.out.println("Итоговая сумма равна: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: Размер массива не соответствует требованиям.");
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }
}