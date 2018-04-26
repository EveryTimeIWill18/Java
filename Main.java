public class Main {

    public static void main(String[] args) {

        // test out the Flight class

        Flight defaultFlight = new Flight(); // calls default constructor
        defaultFlight.printFlightInformation();
        System.out.print("\n");
        // test flight
        Flight flight1 = new Flight(150, 0, "Jet Blue");
        flight1.printFlightInformation();

        Passenger p = new Passenger(001, "William");
        flight1.PassengerList.addPassengers(new Passenger(001, "William"),
                new Passenger(002, "Klamps"),new Passenger(003, "James"));

    }
}
