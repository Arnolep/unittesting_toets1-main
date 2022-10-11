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
        Integer[] result = elevator.activeButtons(10);
        assertArrayEquals(new Integer[]{0}, result);
    }
    @Test
    void Staff() {
        Elevator elevator = new Elevator("S");
        Integer[] result = elevator.activeButtons(2);
        assertArrayEquals(new Integer[]{-2,-1,0,1,3,4,5,6,7,8,9,10}, result);
    }
    @Test
    void StaffPara() {
        Elevator elevator = new Elevator("S");
        Integer[] result = elevator.activeButtons(10);
        assertArrayEquals(new Integer[]{-2,-1,0,1,2,3,4,5,6,7,8,9}, result);
    }
    @Test
    void WrongfloorNoBadge(){
        Elevator elevator = new Elevator();
        Integer[] result = elevator.activeButtons(7);
        assertEquals(null, result);
    }
}
