/* Project Number 2 Amount test class
By: Monica 
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Amount;

import static org.junit.Assert.assertEquals;

public class AmountTests {
    Amount test;

    @Before
    public void setUp() {
        // Create an Amount object to test
        test = new Amount(40, 30, 20, 10);
    }

    @Test
    // Test Case for Amount.getTotalAmt()
    public void testGetTotalAmt() {
        test.getTotalAmt();
        Assert.assertEquals(100, test.getTotalAmt(), 100);
    }

    @Test
    // Test Case for Amount.toString()
    public void testToString() {
        Assert.assertEquals(40, test.getTransportationAmt(), 40);
        Assert.assertEquals(30, test.getLodgingAmt(), 30);
        Assert.assertEquals(20, test.getFoodAmt(), 20);
        Assert.assertEquals(10, test.getMiscellaneousAmt(), 10);
    }

}
