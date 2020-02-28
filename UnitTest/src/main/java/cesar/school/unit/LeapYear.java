package cesar.school.unit;

public class LeapYear {

    public static String leapYearCalc(int year) {
        if (year % 4 == 0)
            return "It's a leap year";
        else if (year % 100 == 0)
            return "Not a leap year";
        else if (year % 400 == 0)
            return "It's a leap year";

        return "Not a leap year";
    }
}