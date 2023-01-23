import Flight.Plane;
import Flight.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTypeTest {

    Plane plane;
    Plane jet;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        jet = new Plane(PlaneType.PRIVATEJET);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(20, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(1200, plane.getPlaneType().getTotalWeight(),0.0);
    }
}