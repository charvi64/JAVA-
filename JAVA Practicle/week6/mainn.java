package week6;

public class mainn {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(3);

        // Calculate and print the area of the shapes
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
