import java.lang.Math;

public class Passenger {

    private String name;
    private int numberOfBags;
    private int seatNumber;
    private Flight flight;


    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = 0;

    }

    public int getSeatNumber(){
        return this.seatNumber;
    }


    public String  getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public boolean getBagAllowance(){
        return !(numberOfBags > 2);

    }

    public void addFlightToPassenger(Flight flight){
        this.flight = flight;
        this.seatNumber = randomSeatNumber();
    }

    public Flight getFlight(){
        return this.flight;
    }

    public int getPlaneCapacity(){
        return flight.getPlaneCapacity();
    }

    public int randomSeatNumber(){
        int max = getPlaneCapacity();
        int min = 1;
        int range = max - min + 1;
        int rand = 0;
        for (int i = 0; i < max; i++){
            rand = (int)(Math.random() * range) + min;
        }
        return rand;
    }

}

