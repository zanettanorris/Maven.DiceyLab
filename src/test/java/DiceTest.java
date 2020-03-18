
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void tossTest() {
        Dice dice = new Dice(2);
        dice.setSeed();
        int expected = 2;
        int actual = dice.toss();
        Assert.assertEquals(actual, expected);

    }
}