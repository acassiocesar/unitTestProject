package cesar.school.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void leapYear_DivisibleBy4AndUnder100_True() {
        Assertions.assertEquals("It's a leap year", LeapYear.leapYearCalc(40));
    }

    @Test
    public void leapYear_DivisibleBy4And100orOver_False(){
        Assertions.assertEquals("Not a leap year", LeapYear.leapYearCalc(100));
    }

    @Test
    public void leapYear_DivisibleBy4AndBy100AndBy400_True(){
        Assertions.assertEquals("It's a leap year", LeapYear.leapYearCalc(400));
    }
}