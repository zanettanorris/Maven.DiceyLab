import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void printStarsTest() {
        Integer numberOfStars = 4;
        String actual = "****";
        String expected = Simulation.printStars(numberOfStars);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calcPercentTest(){
        Integer inc = 2;
        Integer numberOfRolls = 10;
        Float expected = 20.00f;
        Float actual = Simulation.calcPercent(inc,numberOfRolls);
        Assert.assertEquals(expected,actual);

    }
}
