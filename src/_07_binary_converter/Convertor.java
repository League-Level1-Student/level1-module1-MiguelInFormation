package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convertor implements ActionListener {
	
	public static void main(String[] args ) {
		
		Convertor  v = new Convertor();
				v.setup();
	}
	
	JTextField answer = new JTextField(30);
	JLabel label = new JLabel ();
	JButton button = new JButton();
	JFrame frame = new JFrame();
	private void setup() {
		
		
		
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		button.addActionListener(this);
		button.setText("Convert");
		panel.add(label);
		panel.add(answer);
		panel.add(button);
		frame.pack();
				
		
		
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String converted = answer.getText();
		converted = convert(converted);
        label.setText(converted);
        frame.pack();
				
				
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	                	
	
}


