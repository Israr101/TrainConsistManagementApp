import java.util.LinkedHashSet;
import java.util.Set;

public class ConsistOrderTracker {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management (UC5) ===");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine_01");
        formation.add("Sleeper_S1");
        formation.add("Sleeper_S2");
        formation.add("Cargo_C1");
        formation.add("Guard_Van");

        System.out.println("Status: Initial bogies attached.");

        String duplicate = "Sleeper_S1";
        System.out.println("Action: Attempting to add " + duplicate);

        boolean added = formation.add(duplicate);

        if (!added) {
            System.out.println("Alert: " + duplicate + " already exists. Duplicate rejected.");
        }

        System.out.println("\nFinal Formation Order:");
        for (String bogie : formation) {
            System.out.println("-> " + bogie);
        }

        System.out.println("\nTotal unique units: " + formation.size());
    }
}