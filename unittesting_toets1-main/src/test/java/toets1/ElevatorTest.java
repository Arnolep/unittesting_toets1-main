package toets1;
import ex01_xxxxx.Example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class ElevatorTest {

@Test
void emptyBadge() {
    Elevator elevator = new Elevator();
    Integer[] result = elevator.activeButtons(0);
    assertArrayEquals(new Integer[]{0}, result);
}
    @Test
    void notEmptyBadgeInLobby() {
        Elevator elevator = new Elevator("f");
        Integer[] result = elevator.activeButtons(0);
        assertArrayEquals(new Integer[]{10}, result);
    }
    @Test
    void notEmptyBadgeNotInLobby() {
        Elevator elevator = new Elevator("f");
        Integer[] result = elevator.activeButtons(2);
        assertArrayEquals(new Integer[]{0,10}, result);
    }

}
