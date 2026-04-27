import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistUC6 {

    public static void main(String[] args) {

        // Create a HashMap to store bogie and capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management System (UC6) ===");

        // Taking user input
        System.out.print("Enter number of bogies to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for bogie " + i + ":");

            System.out.print("Enter bogie name (e.g., Sleeper, AC Chair, First Class): ");
            String bogieName = scanner.nextLine();

            System.out.print("Enter capacity: ");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Insert into HashMap
            bogieCapacityMap.put(bogieName, capacity);
        }

        // Displaying the bogie-capacity mapping
        System.out.println("\n=== Bogie Capacity Details ===");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}
