import org.junit.*;

import static org.junit.Assert.*;


public class GoatyTest {
    Goaty g;

    @Before
    public void setUp() throws Exception {
        g = new Goaty();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Baa!", g.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        g.upgradeSpeed();
        assertEquals(4, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        g.downgradeSpeed();
        assertEquals(2, g.getMaxSpeed());
    }
}
