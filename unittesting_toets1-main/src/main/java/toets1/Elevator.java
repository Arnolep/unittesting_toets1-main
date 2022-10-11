package toets1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private String badge = null;
    public Elevator(){
    }
public Elevator(String badge){
    this.badge = badge;
}
    public Integer[] activeButtons(int currentLevel) {
        List<Integer> List = new ArrayList<>();
        Integer[] activebuttons = List.toArray(new Integer[0]);
        return activebuttons;
}
}
