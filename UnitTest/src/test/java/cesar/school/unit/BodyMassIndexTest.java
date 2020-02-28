package cesar.school.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void calculate_bmiUnder17_SeverelyUnderWeight(){
        Assertions.assertEquals("Severely underweight", BodyMassIndex.calculate(15));
    }

    @Test
    public void calculate_bmiBetween17And18Dot5_Underweight(){
        Assertions.assertEquals("Underweight", BodyMassIndex.calculate(15));
    }

    @Test
    public void calculate_bmiBetween18Dot5And25_HealthyWeight(){
        Assertions.assertEquals("Healthy weight", BodyMassIndex.calculate(20));
    }

    @Test
    public void calculate_bmiBetween25And30_Overweight(){
        Assertions.assertEquals("Overweight", BodyMassIndex.calculate(26));
    }

    @Test
    public void calculate_bmiBetween30AndOver_Obese(){
        Assertions.assertEquals("Obese", BodyMassIndex.calculate(32));
    }
}
