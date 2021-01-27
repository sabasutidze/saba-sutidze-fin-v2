import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StationSquareTest {
    @Test
    public void testStationSquare() {
        Passenger lasha = new Passenger("Gio", true);
        Passenger miranda = new Passenger("Nika", false);
        Passenger akaki = new Passenger("Ana", true);

        Train train = new Train();
        assertEquals(true, train.addPassenger(gio));
        assertEquals(true, train.addPassenger(nika));
        assertEquals(false, train.addPassenger(ana));
    }
}