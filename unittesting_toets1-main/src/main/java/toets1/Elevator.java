package toets1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Elevator {
    private String badge = null;
    public Elevator(){
    }
public Elevator(String badge){
    this.badge = badge;
}
    public Integer[] activeButtons(int currentLevel) {

        List<Integer> List = new ArrayList<>();
        if(badge != null && badge.equals("S")){
            for(int i = -2; i<=10;i++){
                if(!List.contains(i)){
                List.add(i);
            }
        }
        }
        if(badge != null && !badge.equals("S")){
            List.add(0);
            List.add(10);
        }

        for(int i=0 ; i <List.size();i++){
            if(List.get(i) == currentLevel && List.size()>1){
                List.remove(i);
            }
        }
        if(!List.contains(0) && List.isEmpty()){
            List.add(0);
        }
        if(badge==null){
            for(int i = 0; i<List.size();i++){
                if(i!=0){
                   return null;
                }
            }
        }
        Integer[] activebuttons = List.toArray(new Integer[0]);
        return activebuttons;
}
}
