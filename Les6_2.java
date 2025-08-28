public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        List<String> nomer = phoneBook.get(surname);

        if (nomer != null) {
            nomer.add(phoneNumber);
        } else {
            List<String> newNumbers = new ArrayList<>();
            newNumbers.add(phoneNumber);
            phoneBook.put(surname, newNumbers);
        }
    }

    public List<String> findNumber(String surname) {
        List<String> numbers = phoneBook.get(surname);

        if (numbers != null && !numbers.isEmpty()) {
            return numbers;            
        } else {
            return Collections.emptyList(); 
        }
    }

    public static void main(String[] args) {
        PhoneBook myBook = new PhoneBook();

        myBook.add("Иванов", "123-45-67");
        myBook.add("Иванов", "765-43-21");
        myBook.add("Петров", "987-65-43");
        myBook.add("Сидоров", "321-65-43");
    }
}
