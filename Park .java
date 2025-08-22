import java.util.ArrayList;
import java.util.List;

// ЗАДАНИЕ 3

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
    }

    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    public static void main(String[] args) {
        Park disneyland = new Park("Disneyland");
        Park starland = new Park("Starland");

        disneyland.addAttraction("Колесо обозрения", "09:00–22:00", 500);
        disneyland.addAttraction("Американские горки", "10:00–21:00", 800);
        disneyland.addAttraction("Дом с привидениями", "12:00–23:00", 650);

        starland.addAttraction("Млечный путь", "08:00–16:00", 300);
        starland.addAttraction("Космические горки", "08:00–22:00", 80);
        starland.addAttraction("Полет StarTrek", "15:00–20:00", 500);
    }
}
