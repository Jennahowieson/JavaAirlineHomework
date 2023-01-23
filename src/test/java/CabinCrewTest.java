import People.CabinCrew;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewTest {

    CabinCrew cabinCrewAttendant;

    @Before
    public void before(){
        cabinCrewAttendant = new CabinCrew("Kirsten", Rank.FLIGHT_ATTENDANT);

    }

    @Test
    public void hasName() {
        assertEquals("Kirsten", cabinCrewAttendant.getName());
    }

    @Test
    public void canSetName() {
        cabinCrewAttendant.setName("Kristen");
        assertEquals("Kristen", cabinCrewAttendant.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewAttendant.getRank());
    }

    @Test
    public void canSetRank() {
        cabinCrewAttendant.setRank(Rank.LEAD);
        assertEquals(Rank.LEAD, cabinCrewAttendant.getRank());
    }

    @Test
    public void canSpeakToPassengers() {
        assertEquals("Fasten up", cabinCrewAttendant.speakToPassengers());
    }
}