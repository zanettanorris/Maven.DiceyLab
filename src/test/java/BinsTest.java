import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void getBinTest() {
     Bins testBin = new Bins (11);
     testBin.incrementBin(10);
     Integer expected = 1;
     Integer actual = testBin.getBin(10);
     Assert.assertEquals(expected, actual);

    }
}
//Test 1:
// given the number of rolls is ten,
// when the contents of the bins are added together,
// then sum of contents of all bins should be ten.



//Test 2:
// given binNumber 9 starts test empty,
// when a 9 is rolled,
// then the put method should add 1 entry in binNumber 9.
// and get method from binNumber 9 should return 1



//Test 3
//given all bins start simulation empty
//when a number 3 is rolled
//then a new bin is created with a keyValue of 3 and containing 1 entry.

