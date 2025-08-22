import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String dateProduction;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isBooked;

    public Product(String name, String dateProd, String manuf, String cntry, double prc, boolean booked) {
        this.name = name;
        this.dateProduction = dateProd;
        this.manufacturer = manuf;
        this.country = cntry;
        this.price = prc;
        this.isBooked = booked;
    }

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung S24 Ultra", "01.02.2024", "Samsung Corp.", "Korea", 6599, false);
        productsArray[2] = new Product("Samsung S23 Ultra", "01.02.2023", "Samsung Corp.", "Korea", 7799, false);
        productsArray[3] = new Product("Samsung S22 Ultra", "01.02.2022", "Samsung Corp.", "Korea", 8889, false);
        productsArray[4] = new Product("Samsung S21 Ultra", "01.02.2021", "Samsung Corp.", "Korea", 7779, false);

    }
}
