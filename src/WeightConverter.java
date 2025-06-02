import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        double weight;
        double newWeight;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                === Weight Conversion Program ===
                Choose an option:
                1: Convert lb → kg
                2: Convert kg → lb
                3: Convert kg → g
                4: Convert oz → g
                5: Convert t  → kg
                """);

        System.out.print("Your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the weight in lb: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The weight in kg is: %.2f\n", newWeight);
            }
            case 2 -> {
                System.out.print("Enter the weight in kg: ");
                weight = scanner.nextDouble();
                newWeight = weight / 0.453592;
                System.out.printf("The weight in lb is: %.2f\n", newWeight);
            }
            case 3 -> {
                System.out.print("Enter the weight in kg: ");
                weight = scanner.nextDouble();
                newWeight = weight * 1000;
                System.out.printf("The weight in g is: %.2f\n", newWeight);
            }
            case 4 -> {
                System.out.print("Enter the weight in oz: ");
                weight = scanner.nextDouble();
                newWeight = weight * 28.3495;
                System.out.printf("The weight in g is: %.2f\n", newWeight);
            }
            case 5 -> {
                System.out.print("Enter the weight in t: ");
                weight = scanner.nextDouble();
                newWeight = weight * 1000;
                System.out.printf("The weight in kg is: %.2f\n", newWeight);
            }
            default -> System.out.println("That was not a valid choice.");
        }

        scanner.close();
    }
}

