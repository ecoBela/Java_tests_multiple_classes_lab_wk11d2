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

    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passenger.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passenger.add(passenger);
    }
}
