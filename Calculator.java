package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	JFrame frame;
	 JTextField display;
	 JButton[] numberButtons;
	 JButton addButton, subButton, mulButton, divButton, equButton, delButton, clrButton;
	 JPanel panel;
	 double num1 = 0, num2 = 0, result = 0;
	 char operator;
	 public Calculator() {
	 // Frame settings
	 frame = new JFrame("Calculator");
	 frame.setSize(400, 600);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setLayout(null);
	 // Display panel
	 display = new JTextField();
	 display.setBounds(50, 25, 300, 50);
	 display.setFont(new Font("Arial", Font.BOLD, 24)); // Increased font size
	 display.setBackground(Color.LIGHT_GRAY); // Background color
	 display.setEditable(false);
	 frame.add(display);
	 // Number buttons
	 numberButtons = new JButton[10];
	 for (int i = 0; i < 10; i++) 
	 {
		 
		 numberButtons[i] = new JButton(String.valueOf(i));
		 numberButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
		 numberButtons[i].addActionListener(this);
		 }
		 // Operation buttons
		 addButton = new JButton("+");
		 subButton = new JButton("-");
		 mulButton = new JButton("*");
		 divButton = new JButton("/");
		 equButton = new JButton("=");
		 delButton = new JButton("Delete");
		 clrButton = new JButton("Clear");
		 // Set button fonts
		 addButton.setFont(new Font("Arial", Font.BOLD, 24));
		 subButton.setFont(new Font("Arial", Font.BOLD, 24));
		 mulButton.setFont(new Font("Arial", Font.BOLD, 24));
		 divButton.setFont(new Font("Arial", Font.BOLD, 24));
		 equButton.setFont(new Font("Arial", Font.BOLD, 24));
		 delButton.setFont(new Font("Arial", Font.BOLD, 24));
		 clrButton.setFont(new Font("Arial", Font.BOLD, 24));
		 // Add action listeners to operation buttons
		 addButton.addActionListener(this);
		 subButton.addActionListener(this);
		 mulButton.addActionListener(this);
		 divButton.addActionListener(this);
		 equButton.addActionListener(this);
		 delButton.addActionListener(this);
		 clrButton.addActionListener(this);
		 // Panel settings
		 panel = new JPanel();
		 panel.setBounds(50, 100, 300, 400);
		 panel.setLayout(new GridLayout(4, 4, 10, 10)); // Adjusted gaps
		 panel.add(numberButtons[1]);
		 panel.add(numberButtons[2]);
		 panel.add(numberButtons[3]);
		 panel.add(addButton);
		 panel.add(numberButtons[4]);
		 panel.add(numberButtons[5]);
		 panel.add(numberButtons[6]);
		 panel.add(subButton);
		 panel.add(numberButtons[7]);
		 panel.add(numberButtons[8]);
		 panel.add(numberButtons[9]);
		 panel.add(mulButton);
		 panel.add(clrButton);
		 panel.add(numberButtons[0]);
		 panel.add(delButton);
		 panel.add(equButton);
		 panel.add(divButton);
		 frame.add(panel);
		 frame.setVisible(true);
		 }
	public static void main1(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			 try {
				try {
					try {
						try {
							if (e.getSource() == numberButtons[i]) {
							 try {
								display.setText(display.getText().concat(String.valueOf(i)));
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							 }
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 }
			 // Check if display is not empty before parsing
			 try {
				try {
					if (e.getSource() == addButton) {
					 try {
						try {
							try {
								try {
									if (!display.getText().isEmpty()) {
									 num1 = Double.parseDouble(display.getText());
									 try {
										operator = '+';
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									 display.setText("");
									 }
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if (e.getSource() == subButton) {
			 if (!display.getText().isEmpty()) {
			 num1 = Double.parseDouble(display.getText());
			 operator = '-';
			 display.setText("");
			 }
			 }
			 if (e.getSource() == mulButton) {
			 if (!display.getText().isEmpty()) {
			 num1 = Double.parseDouble(display.getText());
			 operator = '*';
			 display.setText("");
			 }
			 }
			 if (e.getSource() == divButton) {
			 if (!display.getText().isEmpty()) {
			 num1 = Double.parseDouble(display.getText());
			 operator = '/';
			 display.setText("");
			 }
			 }
			 if (e.getSource() == equButton) {
			 if (!display.getText().isEmpty()) {
			 num2 = Double.parseDouble(display.getText());
			 switch (operator) {
			 case '+':
			 result = num1 + num2;
			 break;
			 case '-':
			 result = num1 - num2;
			 break;
			 case '*':
			 result = num1 * num2;
			 break;
			 case '/':
			 if (num2 != 0) { // Prevent division by zero
			 result = num1 / num2;
			 } else {
			 display.setText("Error");
			 return;
			 }
			 break;
			 }
			 display.setText(String.valueOf(result));
			 num1 = result;
			 }
			 }
			 if (e.getSource() == delButton) {
			 String str = display.getText();
			 display.setText(str.length() > 0 ? str.substring(0, str.length() - 1) : "");
			 }
			 if (e.getSource() == clrButton) {
			 display.setText("");
			 num1 = num2 = result = 0;
			 }
			 }
	public static void main(String[] args) {
		 new Calculator();
		 }
		}
	}

}
