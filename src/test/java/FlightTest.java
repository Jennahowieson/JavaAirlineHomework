import Flight.Flight;
import People.CabinCrew;
import People.Passenger;
import People.Pilot;
import Flight.Plane;
import Flight.PlaneType;
import People.Rank;
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
    public void before() {
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
        flight = new Flight(pilot, cabinCrewList, passengerList, plane,2709, "LGW", "EDI", "20:00");
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
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canSetPlane() {
        flight.setPlane(jet);
        assertEquals(jet, flight.getPlane());
    }


    @Test
    public void canGetFlightNumber() {
        assertEquals(2709, flight.getFlightNumber());
    }

    @Test
    public void canSetFlightNumber() {
        flight.setFlightNumber(2780);
        assertEquals(2780, flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("LGW", flight.getDestination());
    }

    @Test
    public void canSetDestination() {
        flight.setDestination("LHR");
        assertEquals("LHR", flight.getDestination());
    }

    @Test
    public void canGetDepartingAirport() {
        assertEquals("EDI", flight.getDepartingAirport());
    }

    @Test
    public void canSetDepartingAirport() {
        flight.setDepartingAirport("GLA");
        assertEquals("GLA", flight.getDepartingAirport());
    }

    @Test
    public void canGetTimeOfDeparture() {
        assertEquals("20:00", flight.getTimeOfDeparture());
    }

    @Test
    public void canSetTimeOfDeparture() {
        flight.setTimeOfDeparture("20:30");
        assertEquals("20:30", flight.getTimeOfDeparture());
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