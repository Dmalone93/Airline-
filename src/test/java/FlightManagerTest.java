import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {




    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Plane plane;
    Flight flight;
    FlightManager flightManager;

    @Before
    public void setUp(){

        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Declan", 2);
        passenger2 = new Passenger("Megan", 2);
        passenger3 = new Passenger("Andrew", 1);
        passenger4 = new Passenger("Steven", 1);
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(passengers, plane,56, DestinationType.TKO, DepartureType.GLA, "14:00");
        flightManager = new FlightManager(plane, flight);
    }

    @Test
    public void howMuchWeightIsLeftForBags(){
        assertEquals(50, flightManager.baggageAllowance());
    }


}
