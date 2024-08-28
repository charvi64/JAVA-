package Coffee;

public class App {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new BasicCoffee(); 

        System.out.println("Welcome to the Coffee Shop!");

        System.out.print("Would you like to add milk? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.print("Would you like to add sugar? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new SugarDecorator(coffee);
        }

        System.out.print("Would you like to add a flavor syrup? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Which flavor would you like? (Vanilla, Caramel, Hazelnut): ");
            String flavor = scanner.nextLine();
            coffee = new FlavorDecorator(coffee, flavor);
        }

        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());

        scanner.close();
    }
}
