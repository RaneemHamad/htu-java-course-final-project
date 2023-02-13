package Resubmetion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Frame extends JFrame implements ActionListener  {
	JButton button;
	Frame(){
		
	
    
	button = new JButton(); 
	button.setBounds(100, 100, 250, 100);
	button.addActionListener(this);//ActionListener
	button.setText("reservation");
	button.setFocusable(false);
	button.setBackground(Color.lightGray);
	button.setForeground(Color.DARK_GRAY);
	button.setFont(new Font("Comic Sans",Font.BOLD,27));
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setSize(500,500); 
	this.setVisible(true);
	this.add(button);
	
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("reserved");
			
		}
	}
	}


