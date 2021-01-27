package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Passenger> passengerList = new ArrayList<>();

    public boolean addPassenger(Passenger passenger) {
        boolean result = false;

        if (passenger.haveTicket()==true) {
            result = passengerList.add(passenger);
        }
        return result;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}