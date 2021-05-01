package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import model.Boat;
import model.CoolDecorator;

public class Client extends JFrame implements ActionListener{
	// Boat1
    static Boat SpiceBoat = new Boat.Builder("Mediterranean Shipping Company", "Dublin Port", "India Spice Market")
        .setStockName("Paprika")
        .setStockCount(200)
        .setTimeReceived("12:00pm")
        .setTimeSent("1:30am")
        .setStockWeight(200)
        .build();
    
 // Boat2
    static Boat SteelBoat = new Boat.Builder("Maersk", "Dublin Docklands", "McLaren Construction Group")
        .setStockName("Steel Pipes")
        .setStockCount(1500)
        .setTimeReceived("1:00pm")
        .setTimeSent("7:30am")
        .setStockHeight(9000)
        .setStockWeight(150000)
        .build();
    
 // Boat3
    static Boat TechnologyBoat = new Boat.Builder("COSCO", "Dublin Port", "IBM")
        .setStockName("Laptops")
        .setStockCount(80)
        .setTimeReceived("9:00pm")
        .setTimeSent("12:30am")
        .setStockHeight(90)
        .setStockWeight(1000)
        .build();
    
 //JLabels, JButtons
    JLabel DisplayGeneralInfo, DisplayGeneralInfoThirdBoat, SignOff;
	private JButton DisplayGeneralFirst, DisplayGeneralSecond, DisplayGeneralThird, Quit, firstBoatSignOff, secondBoatSignOff, thirdBoatSignOff;

	JPanel app = new JPanel();
    JPanel UI = new JPanel();
    JPanel firstBoat = new JPanel();
    JPanel secondBoat = new JPanel();
    JPanel thirdBoat = new JPanel();
    
	public Client(){
        super ("Port-Stock-Manager");
        
        app.setBackground(Color.LIGHT_GRAY);
        UI.setBackground(Color.MAGENTA);
        firstBoat.setBackground(Color.RED);
        secondBoat.setBackground(Color.RED);
        thirdBoat.setBackground(Color.RED);

        getContentPane().add(app);
        //contentpane
        
        //app
        JLabel Welcome = new JLabel("Welcome to our Order Management System. Orders that are not signed off appear red. Follow buttons to complete order checks.");
        Welcome.setFont(new Font("Verdana", Font.PLAIN, 22));
        UI.add(Welcome);
        UI.add(Quit = new JButton("Exit the program"), BorderLayout.NORTH);
        app.add(UI);
        
        //boat 1 
        JLabel firstBoatLabel = new JLabel("First Delivery");
        firstBoatLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        firstBoat.add(firstBoatLabel);
        firstBoat.add(DisplayGeneralFirst = new JButton("Display General Information"));
        firstBoat.add( new CoolDecorator(firstBoatSignOff = new JButton("Click to Sign Off")));
        app.add(firstBoat);
        
        //boat 2
        JLabel secondBoatLabel = new JLabel("Second Delivery");
        secondBoatLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        secondBoat.add(secondBoatLabel);
        secondBoat.add(DisplayGeneralSecond = new JButton("Display General Information"));
        secondBoat.add( new CoolDecorator(secondBoatSignOff = new JButton("Click to Sign Off")));
        app.add(secondBoat);
        
        //boat 2
        JLabel thirdBoatLabel = new JLabel("Third Delivery");
        thirdBoatLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        thirdBoat.add(thirdBoatLabel);
        thirdBoat.add(DisplayGeneralThird = new JButton("Display General Information"));
        thirdBoat.add( new CoolDecorator(thirdBoatSignOff = new JButton("Click to Sign Off")));
        app.add(thirdBoat);
        
        app.add(SignOff = new JLabel(""));
        app.add(DisplayGeneralInfo = new JLabel(""));
        DisplayGeneralFirst.addActionListener(this);
        DisplayGeneralSecond.addActionListener(this);
        DisplayGeneralThird.addActionListener(this);
        firstBoatSignOff.addActionListener(this);
        secondBoatSignOff.addActionListener(this);
        thirdBoatSignOff.addActionListener(this);
        Quit.addActionListener(this);
        setSize(new Dimension(200,100));
        
        setVisible(true);
        setSize(1650,550);
        Quit.requestFocus();
    }
	public void actionPerformed(ActionEvent e){
        if(e.getSource() == DisplayGeneralFirst){
        	DisplayGeneralInfo.setText(SpiceBoat.toString());
        }
        if(e.getSource() == firstBoatSignOff) {
        	String input = JOptionPane.showInputDialog(
                    null, "Sign with your name: ");
        	SignOff.setText(input);
        	firstBoat.setBackground(Color.GREEN);
        }
        if(e.getSource() == DisplayGeneralSecond){
        	DisplayGeneralInfo.setText(SteelBoat.toString());
        }
        if(e.getSource() == secondBoatSignOff) {
        	String input = JOptionPane.showInputDialog(
                    null, "Sign with your name: ");
        	SignOff.setText(input);
        	secondBoat.setBackground(Color.GREEN);
        }
        if(e.getSource() == DisplayGeneralThird){
        	DisplayGeneralInfo.setText(TechnologyBoat.toString());
        }
        if(e.getSource() == thirdBoatSignOff) {
        	String input = JOptionPane.showInputDialog(
                    null, "Sign with your name: ");
        	SignOff.setText(input);
        	thirdBoat.setBackground(Color.GREEN);
        }
        if(e.getSource() == Quit) {
        	System.exit(0);
        }
   }
	
	public static void main(String args[]) {
		new Client();
		System.out.println("If any values are null, data was not specified.\n _________________\n");
		// Create the boat using the builder pattern

        // Display the boat1 details
        SpiceBoat.display();

        // Display the boat2 details
        SteelBoat.display();
        
        // Display the boat3 details
        TechnologyBoat.display();
	}

}
