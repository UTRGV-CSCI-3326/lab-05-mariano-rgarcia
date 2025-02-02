import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Collect user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read text input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read integer input

        System.out.print("Enter your weight (in lbs): ");
        double weight = scanner.nextDouble(); // Read double input

        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = scanner.nextBoolean(); // Read boolean input
        
        // Display collected information back to the user
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Smoker: " + isSmoker);
        
        // Close the scanner
        scanner.close();
        
    }
}
