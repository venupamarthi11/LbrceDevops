package Le11LbrceDevops;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class signin {

    // A simple in-memory user store
    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Signup System!");
            System.out.println("1. Sign Up");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
           
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    signUp(scanner);
                    break;
                case 2:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void signUp(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists. Please try a different username.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // In a real application, you should hash the password before storing it
        userDatabase.put(username, password);

        System.out.println("Sign up successful!");
    }
}
