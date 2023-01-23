package Flight;

import People.CabinCrew;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Object> passengerList;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departingAirport;
    private String timeOfDeparture;
    private CabinCrew cabinCrew;

    public Flight (Pilot pilot, ArrayList<CabinCrew> cabinCrewList, ArrayList<Object> passengerList, Plane plane, int flightNumber, String destination, String departingAirport, String timeOfDeparture ){
        this.pilot = pilot;
        this.cabinCrewList = cabinCrewList;
        this.passengerList = passengerList;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departingAirport = departingAirport;
        this.timeOfDeparture = timeOfDeparture;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrew> getCabinCrewList() {
        return cabinCrewList;
    }

    public void setCabinCrewList(ArrayList<CabinCrew> cabinCrewList) {
        this.cabinCrewList = cabinCrewList;
    }

    public ArrayList<Object> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Object> passengerList) {
        this.passengerList = passengerList;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartingAirport() {
        return departingAirport;
    }

    public void setDepartingAirport(String departingAirport) {
        this.departingAirport = departingAirport;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public void addToCrewList(CabinCrew cabinCrew){
        this.cabinCrewList.add(cabinCrew);
    }

    public void addPassengerToList(Passenger passenger){
        this.passengerList.add(passenger);
    }

    public int getAvailableSeats(){
        return this.plane.getPlaneType().getCapacity();
    };

    public void bookPassengerOntoFlight(Passenger passenger){
        if (getAvailableSeats() > getPassengerList().size()) {
            addPassengerToList(passenger);
        }
    }


}




