import java.util.ArrayList;

public class Passengers {

    private ArrayList PassengerList;
    private Passenger passenger;

    // overloaded constructor
    public Passengers(){
        this.PassengerList = new ArrayList();
    }
    // add a variable number of passengers to the flight
    public void addPassengers(Passenger ... p){
        int cntr = 0;
        for(Passenger pass: p) {
            this.PassengerList.add(p);
            cntr++;
        }
        System.out.print("Added " + cntr + " passengers to the passenger list.\n");
    }
    public void getPassengerlist(){
        for(int i=0; i < this.PassengerList.size(); i++){
            System.out.println(this.PassengerList.get(i));
        }
    }

}
