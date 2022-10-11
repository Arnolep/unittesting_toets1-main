package toets1;
import ex01_xxxxx.Example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class ElevatorTest {

@Test
void emptyBadge() {
    Elevator elevator = new Elevator(null);
    Integer[] result = elevator.activeButtons(0);
    assertArrayEquals(new Integer[]{}, result);
}
}
