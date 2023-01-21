import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightManagerTest {
    FlightManager flightManager;
    Flight flight;
    Flight privateJet;
    Pilot pilot;
    Pilot pilot2;
    ArrayList<CabinCrew> cabinCrewList;
    ArrayList<Object> passengerList;
    Plane plane;
    Plane jet;
    int flightNumber;
    String destination;
    String departingAirport;
    String timeOfDeparture;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void before(){
        pilot = new Pilot("Kirsten", Rank.CAPTAIN, "KJ120823");
        cabinCrew1 = new CabinCrew("Jenna", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Rae", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Tina", 2);
        passenger2 = new Passenger("Stewart", 1);
        passenger3 = new Passenger("Connor", 3);
        cabinCrewList = new ArrayList<CabinCrew>();
        passengerList = new ArrayList<Object>();
        plane = new Plane(PlaneType.BOEING747);
        jet = new Plane(PlaneType.PRIVATEJET);
        flight = new Flight(pilot, cabinCrewList, passengerList, plane,2709, "LGW", "EDI", "20;00");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canCalculateBaggageWeightToReserve() {
        assertEquals(600, flightManager.calculateBaggageWeightToReserve(),0.0);
    }

    @Test
    public void canCalculateBaggageWeightInUse() {
        flight.addPassengerToList(passenger1);
        flight.addPassengerToList(passenger2);
        flight.addPassengerToList(passenger3);
        assertEquals(180, flightManager.calculateBaggageWeightInUse(),0.0);
    }
}