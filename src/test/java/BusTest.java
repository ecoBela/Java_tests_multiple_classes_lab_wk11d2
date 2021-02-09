import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Picadilly Circus", 20);
    }

    @Test
    public void checkBusHasDestination(){
        assertEquals("Picadilly Circus", bus.getDestination());
    }



}
