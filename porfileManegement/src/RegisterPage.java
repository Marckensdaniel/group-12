import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class RegisterPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton saveButton = new JButton("Save");
	
    JTextField addressField = new JTextField();
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("Username:");
	JLabel userPasswordLabel = new JLabel("Password:");
    JLabel addressLabel = new JLabel("Address:");


    JLabel registerLabel = new JLabel();
	HashMap<String,String> registerinfo = new HashMap<String,String>();
	


	RegisterPage(HashMap<String,String> registerInfoOriginal){
		
		registerinfo = registerInfoOriginal;
		
        registerLabel.setBounds(175,25,100,35);
		registerLabel.setFont(new Font(null,Font.PLAIN,25));
		registerLabel.setText("Register");       


		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
        addressLabel.setBounds(50,200,75,25);
    
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);		
		addressField.setBounds(125,200,200,25);
	
		saveButton.setBounds(175,300,100,25);
		saveButton.setFocusable(false);

        

		
		frame.add(registerLabel);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(addressField);
        frame.add(saveButton);
		frame.add(addressLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		
		if(a.getSource()==saveButton) {
            frame.dispose();
			
		}


    }
}
