package Main;
// Program for calculating volume of concrete needed to fill certain demensions for curb-gutter, driveway,
// patio, sidewalk_patio, and steps.
// Author: Andy Z.

public class ConcCalc {

    // inches to feet
    public static double inToFt(double in) {
        return in / 12;
    }

    // volume in cubic feet to cubic yards
    public static double volToYard(double vol) {
        return vol / 27;
    }

    // check if whole number, if not round to nearest quarter
    // use in output method
    public static double roundUp(double num) {
        if (num % 1 == 0) {
            return num;
        } else {
            return (int) (num * 4 + 1) / 4.0;
        }
    }


    // sidewalk_patio method
    public static double sidewalk_patio(double width, double thickness, double length) {

        double thicknessFt = inToFt(thickness);
        double volInFt = (width * thicknessFt * length);
        double result = volToYard(volInFt);
        return roundUp(result);

    }
}