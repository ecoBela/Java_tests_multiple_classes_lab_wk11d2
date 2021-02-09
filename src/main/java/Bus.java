import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passenger;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passenger = new ArrayList<Passenger>();

    }

    public String getDestination() {
        return this.destination;
    }
}
