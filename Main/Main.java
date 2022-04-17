package Main;

import java.util.Scanner;

public class Main {
    // Main method for ConcCalc.java
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What are you building?");
        System.out.println("1. Curb/Gutter");
        System.out.println("2. Sidewalk");
        System.out.println("3. Driveway");
        System.out.println("4. Patio");

        // TODO: improve readability
        int choice = scan.nextInt();
        switch (choice) {
             case 1:
                System.out.println("Enter base width in inches: ");
                int baseWidth = scan.nextInt();
                System.out.println("Enter toe height in inches: ");
                int toeHeight = scan.nextInt();
                System.out.println("Enter face height in inches: ");
                int faceHeight = scan.nextInt();
                System.out.println("Enter curb width in inches: ");
                int curbWidth = scan.nextInt();
                System.out.println("Enter total length in feet: ");
                int totalLength = scan.nextInt();
                System.out.println("You need " + ConcCalc.curb_gutter(baseWidth, toeHeight, faceHeight, curbWidth, totalLength) + " cubic yards of concrete.");
                break;
            case 2:
                System.out.println("Enter width in inches: ");
                int width = scan.nextInt();
                System.out.println("Enter thickness in inches: ");
                int thickness = scan.nextInt();
                System.out.println("Enter length in feet: ");
                int length = scan.nextInt();
                System.out.println("You need " + ConcCalc.sidewalk_patio(width, thickness, length) + " cubic yards of concrete.");
                break;
            case 3:
                System.out.println("Enter width in inches: ");
                int width2 = scan.nextInt();
                System.out.println("Enter thickness in inches: ");
                int thickness2 = scan.nextInt();
                System.out.println("Enter length in feet: ");
                int length2 = scan.nextInt();
                System.out.println("You need " + ConcCalc.sidewalk_patio(width2, thickness2, length2) + " cubic yards of concrete.");
                break;
            case 4:
                System.out.println("Enter width in inches: ");
                int width3 = scan.nextInt();
                System.out.println("Enter thickness in inches: ");
                int thickness3 = scan.nextInt();
                System.out.println("Enter length in feet: ");
                int length3 = scan.nextInt();
                System.out.println("You need " + ConcCalc.sidewalk_patio(width3, thickness3, length3) + " cubic yards of concrete.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
