public class unit_13 {
    public static void main(String[] args) {

        int size = 5; 


        int[][] array = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) { 
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }
}
