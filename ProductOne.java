
// ЗАДАНИЕ 1


public class ProductOne {
    private String name;
    private int dateProduction;
    private String manufacturer;
    private String country;
    private double price;
    private String statusBooking;
    
    public ProductOne (String n, int d, String m, String c, double p, String s) {
        this.name = n;
        this.dateProduction = d;
        this.manufacturer = m;
        this.country = c;
        this.price = p;
        this.statusBooking = s;
    }
    
    public void printProductOne() {
        System.out.println("Название: " + this.name +
                           ", дата производства: " + this.dateProduction +
                           ", производитель: " + this.manufacturer +
                           ", страна происхождения: " + this.country +
                           ", цена: " + this.price +
                           ", состояние бронирования покупателем: " + this.statusBooking);
    }
    public static void main(String[] args) {
        ProductOne p1 = new ProductOne("Corn", 2025, "Grek", "Russia", 15000, "Loading");
        
     p1.printProductOne ();
    }
}