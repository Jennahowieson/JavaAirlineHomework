import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Kirsten", Rank.CAPTAIN, "KJ120823");
    }

    @Test
    public void canFlyPlane() {
        assertEquals("We're in the air!", pilot.flyPlane());
    }
}