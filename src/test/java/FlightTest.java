import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void setUp(){

        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Declan", 2);
        passenger2 = new Passenger("Megan", 2);
        passenger3 = new Passenger("Andrew", 1);
        passenger4 = new Passenger("Steven", 1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(passengers, plane,56, DestinationType.TKO, DepartureType.GLA, "14:00");
        flight.addPassenger(passenger1, flight);
        flight.addPassenger(passenger2, flight);
        flight.addPassenger(passenger3, flight);
        flight.addPassenger(passenger4, flight);



    }


    @Test
    public void DoesFlightHavePassengers(){
        assertEquals(4, flight.getPassengerCount());
    }

    @Test
    public void DoesFlighHaveAPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void DoesFlightHaveFlightNumber(){
        assertEquals(56, flight.getFlightNumber());
    }

    @Test
    public void DoesFlightHaveADestination(){
        assertEquals(DestinationType.TKO, flight.getDestination());
    }

    @Test
    public void DoesFlightHaveADeparture(){
        assertEquals(DepartureType.GLA, flight.getDepartureType());
    }

    @Test
    public void DoesFlightHaveADepartureTime(){
        assertEquals("14:00", flight.getDepartureTime());
    }

    @Test
    public void CanTakePassengersAwayFromCapacity(){
        assertEquals(16, flight.RemainingNumberOfSeats());
    }

    @Test
    public void CanAddPassengerToFlight(){
        passenger5 = new Passenger("George", 1);
        flight.bookAPassenger(passenger5);
        assertEquals(5, flight.getPassengerCount());
    }

    @Test
    public void CanAddTotalBags(){
        assertEquals(6, flight.getTotalBags());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(20, flight.getPlaneCapacity());
    }

}
