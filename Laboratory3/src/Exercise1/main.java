package Exercise1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

//      Constraints
//           Cab = Budget >= 15000 and time <= 30
//           Bus = Budget >= 5000 and time <= 60
//           Bicycle = Budge <5000 or time >60

        Client client1 = new Client();
        client1.orderVehicle(50000, 15);
        client1.goToAirport();

        Client client2 = new Client();
        client2.orderVehicle(2400, 15);
        client2.goToAirport();

        Client client3 = new Client();
        client3.orderVehicle(10000, 45);
        client3.goToAirport();

//      Use your own values
        System.out.println("\n    Choose the values    ");
        System.out.println("--------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Budget: ");
        float budget = scanner.nextFloat();
        System.out.println("Time Limit in minutes: ");
        float time = scanner.nextFloat();
        Client client4 = new Client();
        client4.orderVehicle(budget, time);
        client4.goToAirport();

    }
}
