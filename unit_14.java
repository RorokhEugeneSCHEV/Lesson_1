public class unit_14 {
    public static void main(String[] args) {
        String lenString = "len";        
        int initialValue = 5;          
        int arrayLength = lenString.length();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = initialValue;        
        }
    }

}
