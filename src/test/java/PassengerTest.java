import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger2;
    Flight flight;
    Plane plane;

    @Before
    public void setUp(){
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passenger = new Passenger("Declan", 5);
        passenger2 = new Passenger("Megan", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(passengers, plane,56, DestinationType.TKO, DepartureType.GLA, "14:00");
    }

    @Test
    public void doesPassengerHaveName(){
        assertEquals("Declan", passenger.getName());
    }

    @Test
    public void doesPassengerHaveBags(){
        assertEquals(5, passenger.getNumberOfBags());
    }

    @Test
    public void canHaveMoreThanTwoBags() {
        assertEquals(false, passenger.getBagAllowance());
    }

    @Test
    public void cantHaveMoreThanTwoBags() {
        assertEquals(true, passenger2.getBagAllowance());
    }

    @Test
    public void doesPassengerHaveAFlight(){
        passenger.addFlightToPassenger(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void canGetPlaneCapacity(){
        passenger.addFlightToPassenger(flight);
        assertEquals(20, passenger.getPlaneCapacity());
    }

    @Test
    public void doesPassengerHaveSeat(){
        passenger.addFlightToPassenger(flight);
        assertEquals(20, passenger.getSeatNumber());
    }
}
