import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight;
    Flight privateJet;
     Pilot pilot;
     Pilot pilot2;
     ArrayList<CabinCrew> cabinCrewList;
     ArrayList<Passenger> passengerList;
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
    public void before() {
        pilot = new Pilot("Kirsten", Rank.CAPTAIN, "KJ120823");
        cabinCrew1 = new CabinCrew("Jenna", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Rae", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Tina", 2);
        passenger2 = new Passenger("Stewart", 1);
        passenger3 = new Passenger("Connor", 3);
        cabinCrewList = new ArrayList<CabinCrew>();
        passengerList = new ArrayList<Passenger>();
        plane = new Plane(PlaneType.BOEING747);
        jet = new Plane(PlaneType.PRIVATEJET);
        flight = new Flight(pilot, cabinCrewList, passengerList, plane,2709, "LGW", "EDI", "20;00");
    }

    @Test
    public void canGetPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canSetPilot() {
        flight.setPilot(pilot2);
        assertEquals(pilot2, flight.getPilot());
    }

    @Test
    public void canAddToCabinCrewList() {
        flight.addToCrewList(cabinCrew1);
        flight.addToCrewList(cabinCrew2);
        assertEquals(2, flight.getCabinCrewList().size());
    }

    @Test
    public void canAddToPassengerList() {
        flight.addPassengerToList(passenger1);
        flight.addPassengerToList(passenger2);
        assertEquals(2, flight.getPassengerList().size());
    }

    @Test
    public void canGetPlane() {
    }

    @Test
    public void canSetPlane() {
    }

    @Test
    public void canGetFlightNumber() {
    }

    @Test
    public void canSetFlightNumber() {
    }

    @Test
    public void canGetDestination() {
    }

    @Test
    public void canSetDestination() {
    }

    @Test
    public void canGetDepartingAirport() {
    }

    @Test
    public void canSetDepartingAirport() {
    }

    @Test
    public void canGetTimeOfDeparture() {
    }

    @Test
    public void canSetTimeOfDeparture() {
    }

    @Test
    public void canCheckSeatCapacity(){
        privateJet = new Flight(pilot, cabinCrewList, passengerList, jet,2709, "LGW", "EDI", "20;00");
        assertEquals(2, privateJet.getAvailableSeats());
    }

    @Test
    public void  canBookPassengerOntoFlightIfCapacity(){
        privateJet = new Flight(pilot, cabinCrewList, passengerList, jet,2709, "LGW", "EDI", "20;00");
        privateJet.bookPassengerOntoFlight(passenger1);
        privateJet.bookPassengerOntoFlight(passenger2);
        assertEquals(2, privateJet.getPassengerList().size());
    }

    @Test
    public void  cantBookPassengerOntoFlightIfFull(){
        privateJet = new Flight(pilot, cabinCrewList, passengerList, jet,2709, "LGW", "EDI", "20;00");
        privateJet.bookPassengerOntoFlight(passenger1);
        privateJet.bookPassengerOntoFlight(passenger2);
        privateJet.bookPassengerOntoFlight(passenger3);
        assertEquals(2, privateJet.getPassengerList().size());
    }
}