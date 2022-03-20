package Test;

import java.util.Scanner;

import Main.ConcCalc;

public class Test {
    private static Scanner scanin;

    public static void main(String[] args) {
        scanin = new Scanner(System.in);
        System.out.println("Enter width, thickness, and length of sidewalk: ");
        double width = scanin.nextDouble();
        double thickness = scanin.nextDouble();
        double length = scanin.nextDouble();
        double result = ConcCalc.sidewalk_patio(width, thickness, length);
        System.out.println("You need " + result + " cubic yards of concrete for your sidewalk. Don't forget to order a little extra!");
    }
}
