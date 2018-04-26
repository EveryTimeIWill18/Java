import java.util.HashMap;

public class Passenger {

    public HashMap<Integer, String> passenger;

    // default constructor: used to instantiate HashMap
    public Passenger(Integer id, String name){
        passenger = new HashMap();
        passenger.put(id, name);
    }
}
