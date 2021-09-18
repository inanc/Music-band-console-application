package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConsoleBandApp bandApp = new ConsoleBandApp();

        int option;
        do {
            System.out.println("Menu:\n1. List all the bands with their members and the properties of their instruments");
            System.out.println("2. Play one night");
            System.out.println("3. Exit");
            System.out.print("Please enter a option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    bandApp.listBands();
                    break;
                case 2:
                    bandApp.playOneNight();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        } while (option != 3);

        System.out.println("Exited");
    }
}
