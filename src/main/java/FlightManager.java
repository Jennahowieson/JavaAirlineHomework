import java.util.Iterator;

public class FlightManager {

    Flight flight;
    double baggageWeightInUse;
    double baggageWeightRemaining;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

//        Each passenger bag weighs the same - 30
//        Planes reserve half of their total weight for passenger bags
//        The weight of bag per person is the weight reserved for passenger bags divided by the capacity


        public double calculateBaggageWeightToReserve() {
        double baggageWeightToReserve = ((flight.getPlane().getPlaneType().getTotalWeight())/2);
        return baggageWeightToReserve;
        }

        public double calculateBaggageWeightInUse() {
            int bagsCount = 0;
            Iterator itr=flight.getPassengerList().iterator();
            while(itr.hasNext()){
                Passenger passenger=(Passenger) itr.next();
                bagsCount+=(passenger.getBags());
            }
            return bagsCount*30;}


//        int numberOfBagsOnPlane = flight.getPassengerList().size();
//        baggageWeightInUse = calculateBaggageWeightToReserve()
//
//        }
//
//        public double calculateBaggageWeightRemaining() {
//
//        }



}
