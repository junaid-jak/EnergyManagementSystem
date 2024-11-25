package com.energy.management;

import java.util.Scanner;

public class EnergyManagementSystem {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Energy Management System");
        System.out.println("1. Create log file");
        System.out.println("2. Delete log file");
        System.out.println("3. Archive log file");
        System.out.println("4. Move log file");
        System.out.print("Please select an option (1-4): ");
        int option = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

        // Handle different options
        switch (option) {
            case 1:
                LogFileManager.createLogFile();
                break;
            case 2:
                LogFileManager.deleteLogFile();
                break;
            case 3:
                LogFileManager.archiveLogFile();
                break;
            case 4:
                LogFileManager.moveLogFile();
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
