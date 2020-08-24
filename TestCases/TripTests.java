/* Project Number 2 Trip test class
By: Monica Bacatan
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Trip;

import static org.junit.Assert.assertEquals;

public class TripTests {
    Trip test;

    @Before
    public void setUp() {
        // Create an Trip object to test
        test = new Trip("Airplane", "Hotel", "Restaurant");
    }

    @Test
    // Test Case for Trip.toString()
    public void testToString() {
        Assert.assertEquals("Airplane", test.getTransportation());
        Assert.assertEquals("Hotel", test.getLodging());
        Assert.assertEquals("Restaurant", test.getFood());
    }
}
