import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Flight flight){
        this.flight = flight;
        this.plane = plane;
    }

    public int baggageAllowance(){
            int passengerAllowance = (plane.getWeight() / 2); // 400 / 2 = 200
            int totalBagWeight = (plane.getBagWeight() * flight.getTotalBags()); //25 * 6 = 125

            if(totalBagWeight < passengerAllowance){
                int bagExcess = passengerAllowance -= totalBagWeight; //200 - 125
                return bagExcess;
            }
            return 0;
    }






}
