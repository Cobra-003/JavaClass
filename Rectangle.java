// File Name: Rectangle.java

public class Rectangle {

    // TODO 1: ✅ Two private double attributes
    private double width;
    private double height; // Fixed typo: "heigtht" → "height"

    // TODO 2: ✅ Constructor with width and height parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // TODO 3: calculateArea() method
    public double calculateArea() {
        return width * height;
    }

    // TODO 4: calculatePerimeter() method
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        // TODO 5: Create a Rectangle object with sample values
        Rectangle rect = new Rectangle(5.0, 3.0);

        // TODO 6: Print width, height, area, and perimeter
        System.out.println("Width:     " + rect.width);
        System.out.println("Height:    " + rect.height);
        System.out.println("Area:      " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
