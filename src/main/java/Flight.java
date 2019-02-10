
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private DestinationType destination;
    private DepartureType departure;
    private String departureTime;

    public Flight(ArrayList<Passenger> passengers, Plane plane, int flightNumber, DestinationType destination, DepartureType departure, String departureTime){
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int getFlightNumber(){
        return this.flightNumber;
    }

    public DestinationType getDestination(){
        return this.destination;
    }

    public DepartureType getDepartureType(){
        return this.departure;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public int RemainingNumberOfSeats(){
        int seats = this.plane.getCapacity();
        seats -= getPassengerCount();
        return seats;
//        return this.plane.getCapacity() -= getPassengerCount();
    }

    public ArrayList<Passenger> bookAPassenger(Passenger passenger){
            if (getPassengerCount() < RemainingNumberOfSeats()){
                this.passengers.add(passenger);
            }
            return this.passengers;
    }

    public int getTotalBags(){
        int bagTotal = 0;
        for(Passenger passenger : this.passengers){
            bagTotal += passenger.getNumberOfBags();
        }
        return bagTotal;
    }

    public void addPassenger(Passenger passenger, Flight flight){
        passengers.add(passenger);
        passenger.addFlightToPassenger(flight);
    }

    public int getPlaneCapacity(){
        return plane.getCapacity();
    }

}


