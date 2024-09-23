package Citypopulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityPopulationTracker {

    private Map<String, Integer> cityPopulationMap;

    public CityPopulationTracker() {
        cityPopulationMap = new HashMap<>();
    }

    public void addOrUpdateCity(String city, int population) {
        cityPopulationMap.put(city, population);
        System.out.println("City " + city + " added/updated with population " + population);
    }

    public void removeCity(String city) {
        if (cityPopulationMap.remove(city) != null) {
            System.out.println("City " + city + " removed.");
        } else {
            System.out.println("City " + city + " not found.");
        }
    }

    public void getCityPopulation(String city) {
        Integer population = cityPopulationMap.get(city);
        if (population != null) {
            System.out.println("Population of " + city + " is " + population);
        } else {
            System.out.println("City " + city + " not found.");
        }
    }

    public void listAllCities() {
        if (cityPopulationMap.isEmpty()) {
            System.out.println("No cities in the tracker.");
        } else {
            System.out.println("Cities and their populations:");
            for (Map.Entry<String, Integer> entry : cityPopulationMap.entrySet()) {
                System.out.println("City: " + entry.getKey() + ", Population: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        CityPopulationTracker tracker = new CityPopulationTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add/Update City");
            System.out.println("2. Remove City");
            System.out.println("3. Get City Population");
            System.out.println("4. List All Cities");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter population: ");
                    int population = scanner.nextInt();
                    tracker.addOrUpdateCity(city, population);
                    break;
                case 2:
                    System.out.print("Enter city name: ");
                    city = scanner.nextLine();
                    tracker.removeCity(city);
                    break;
                case 3:
                    System.out.print("Enter city name: ");
                    city = scanner.nextLine();
                    tracker.getCityPopulation(city);
                    break;
                case 4:
                    tracker.listAllCities();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
