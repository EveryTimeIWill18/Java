import java.util.HashMap;

public class Flight {

    private int seats;
    private int passengers;
    private int seats_remaining;
    private String flight;
    private boolean flightDelayed;
    private String seat_number = null;
    private String passenger_name = null;
    public Passengers PassengerList;

    // default constructor ----------------------------//
    public Flight(){
        this.flight = "No Airline given\n";
        this.seats = -1;
        this.seats_remaining = -1;
        this.passengers = 0;
        this.flightDelayed = false;
    }
    //overloaded constructor ----------------------------//
    public Flight(int seats, int passengers, String flight){
        this.flight = flight;
        this.seats = seats;
        this.seats_remaining = this.seats;
        this.passengers = passengers;
        this.flightDelayed = false;
        this.PassengerList = new Passengers();
    }
    // setters ----------------------------//
    public void setFlight(String fl){
       this.flight = fl;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    // getters ----------------------------//
    public String getFlight(){
        return this.flight;
    }
    public int getPassengers() {
        return passengers;
    }
    public int getSeats() {
        return seats;
    }
    // flight is delayed ----------------------------//
    public void setDelayStatus(boolean flightDelayed){
        this.flightDelayed = flightDelayed;
    }
    // get flight status ----------------------------//
    private void isFlightDelayed() {
        if(this.flightDelayed == true){
            System.out.print("Flight Delayed\n");
        }
        else{
            System.out.print("Flight on Schedule\n");
        }
    }
    // print method ----------------------------//
    public void printFlightInformation(){
        System.out.print("Flight: " + this.flight.toString()+ "\n");
        System.out.print("Seats: " + this.seats + "\n");
        System.out.print("Passengers: " + this.passengers + "\n");
        System.out.print("Status: ");
        isFlightDelayed();
    }


}
