import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input for gender, age, height, weight
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender (M/F): ");
        String gender = scanner.nextLine().trim();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your height (m): ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        scanner.close();

        // Calculate BMI
        double BMI = weight / (height * height);

        // Check gender and calculate BFP
        if (gender.equalsIgnoreCase("M")) {
            // BFP calculation for men
            double BFP = (1.20 * BMI) + (0.23 * age) - 16.2;
            System.out.printf("Your BFP is: %.2f%n", BFP);
        } else if (gender.equalsIgnoreCase("F")) {
            // BFP calculation for women
            double BFP = (1.20 * BMI) + (0.23 * age) - 5.4;
            System.out.printf("Your BFP is: %.2f%n", BFP);
        } else {
            // Improved error message for invalid gender input
            System.out.println("Invalid gender input. Please enter 'M' or 'F'.");
        }
    }
}
