package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger lasha = new Passenger("Gio", true);
        Passenger miranda = new Passenger("Nika", false);
        Passenger akaki = new Passenger("Ana", true);

        Train train = new Train();

        train.addPassenger(gio);
        train.addPassenger(nika);
        train.addPassenger(ana);

        for (Passenger passenger: train.getPassengerList())
            System.out.println(passenger.getName());
    }
}