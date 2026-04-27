import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistUC8 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management System (UC8) ===");

        // Step 1: Create list of bogies (same as UC7)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury AC", 80));

        // Step 2: Apply Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("\n=== Bogies with Capacity > 60 ===");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}