import java.awt.*;
import javax.swing.*;

public class porfilePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
    JLabel addressLabel = new JLabel("Address:");
    JLabel porfileLabel = new JLabel("Porfile:");


	
	porfilePage(String userID){
		
		welcomeLabel.setBounds(30,80,200,20);
		welcomeLabel.setText("Username:  "+ userID);

        addressLabel.setBounds(30,100,200,20);
        addressLabel.setText("Addres:  267 Nw 36th st, Miami,FL ");

        porfileLabel.setBounds(175,25,100,35);
		porfileLabel.setText("Porfile");
        porfileLabel.setFont(new Font(null,Font.PLAIN,25));


        frame.add(porfileLabel);

        frame.add(addressLabel);
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}