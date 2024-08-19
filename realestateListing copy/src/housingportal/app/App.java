package housingportal.app;

import housingportal.entity.Listing;
import housingportal.manager.ListingManager;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListingManager listingManager = new ListingManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Housing Portal");

        while (true) {
            System.out.println("1. Add a new listing");
            System.out.println("2. View all listings");
            System.out.println("3. Search listings by price range");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // User input for a new listing
                    System.out.print("Enter listing ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter details (e.g., '3 Bedroom, 2 Bathroom'): ");
                    String details = scanner.nextLine();

                    Listing newListing = new Listing(id, location, price, details);
                    listingManager.addListing(newListing);
                    System.out.println("Listing added successfully!");
                    break;

                case 2:
                    // View all listings
                    List<Listing> allListings = listingManager.getAllListings();
                    allListings.forEach(System.out::println);
                    break;

                case 3:
                    // Search listings by price range
                    System.out.print("Enter minimum price: ");
                    double minCost = scanner.nextDouble();
                    System.out.print("Enter maximum price: ");
                    double maxCost = scanner.nextDouble();
                    List<Listing> searchResults = listingManager.findListingsByPriceRange(minCost, maxCost);
                    searchResults.forEach(System.out::println);
                    break;

                case 4:
                    // Exit the application
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

