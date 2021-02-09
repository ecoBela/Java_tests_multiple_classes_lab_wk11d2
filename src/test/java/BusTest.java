import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Picadilly Circus", 2);
    }

    @Test
    public void checkBusHasDestination(){
        assertEquals("Picadilly Circus", bus.getDestination());
    }

    @Test
    public void checkBusHasCapacity(){
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void checkBusIsEmptyOfPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkCanAddPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkCannotAddPassengerIfBusFull(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void checkCanRemovePassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }


}
