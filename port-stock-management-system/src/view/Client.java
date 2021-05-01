package view;

import model.Boat;

public class Client {
	
	public static void main(String args[]) {
		System.out.println("If any values are null, data was not specified.\n _________________\n");
		// Create the boat using the builder pattern
		// Boat1
        Boat SpiceBoat = new Boat.Builder("Mediterranean Shipping Company", "Dublin Port", "India Spice Market")
            .setStockName("Paprika")
            .setStockCount(200)
            .setTimeReceived("12:00pm")
            .setTimeSent("1:30am")
            .setStockWeight(200)
            .build();

        // Display the boats details
        SpiceBoat.display();
        
     // Boat2
        Boat SteelBoat = new Boat.Builder("Maersk", "Dublin Docklands", "McLaren Construction Group")
            .setStockName("Steel Pipes")
            .setStockCount(1500)
            .setTimeReceived("1:00pm")
            .setTimeSent("7:30am")
            .setStockHeight(9000)
            .setStockWeight(150000)
            .build();

        // Display the boats details
        SteelBoat.display();
        
     // Boat3
        Boat TechnologyBoat = new Boat.Builder("COSCO", "Dublin Port", "IBM")
            .setStockName("Laptops")
            .setStockCount(80)
            .setTimeReceived("9:00pm")
            .setTimeSent("12:30am")
            .setStockHeight(90)
            .setStockWeight(1000)
            .build();

        // Display the boats details
        TechnologyBoat.display();
	}

}
