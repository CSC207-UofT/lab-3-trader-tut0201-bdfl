import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    Bicycle b;

    @Before
    public void setUp() throws Exception {
        b = new Bicycle(20);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(4, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(0, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, b.getPrice());
    }
}
