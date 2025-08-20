
interface Figura {
    double calculateArea();
    String getFillColor();
    String getBorderColor();
    
    default double calculatePerimeter() {
        return 0.0;
    }

    default void printInfo() {
        System.out.println("S: " + calculateArea());
        System.out.println("P: " + calculatePerimeter());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
        System.out.println("");
    }
}
class Circle implements Figura {
    private double radius;
    private String fillColor;
    private String borderColor;
    
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String getFillColor() {
        return fillColor;
    }
    
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
class Rectangle implements Figura {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;
    
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    
    @Override
    public String getFillColor() {
        return fillColor;
    }
    
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
class Triangle implements Figura {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;
    
    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    
    @Override
    public String getFillColor() {
        return fillColor;
    }
    
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
public class FigurGeometry {
    public static void main(String[] args) {
        System.out.println(" ФИГУРЫ ");

        Figura circle = new Circle(5.0, "СИНИЙ", "ЧЕРНЫЙ");
        Figura rectangle = new Rectangle(4.0, 6.0, "ЗЕЛЕНЫЙ", "КРАСНЫЙ");
        Figura triangle = new Triangle(3.0, 4.0, 5.0, "БЕЛЫЙ", "ЧЕРНЫЙ");

        System.out.println("КРУГ:");
        circle.printInfo();
    
        System.out.println("ПРЯМОУГОЛЬНИК:");
        rectangle.printInfo();
        
        System.out.println("ТРЕУГОЛЬНИК:");
        triangle.printInfo();
        
    }
}