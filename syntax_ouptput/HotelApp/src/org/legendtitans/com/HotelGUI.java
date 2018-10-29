package org.legendtitans.com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class HotelGUI implements ActionListener {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception ignored) {
		}
		javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
            	HotelGUI hotel = new HotelGUI();
            	hotel.createAndShowGUI();
            	//Customer customer;
            } 
        }); 
		
	}
	private JTabbedPane tabbedPane;
	private GridLayout gridAll = new GridLayout(13,2);
	
	//Summary Panel
	private JPanel summaryPanel;
	
	//Review Variables
	private JPanel reviewPanel;
	private JButton backR = new JButton("Back");
	private JButton nextR = new JButton("Next");
	//Booking Variables
	private JPanel bookingPanel;
	private JTextField bookingDate = new JTextField();
	private JTextField numberOfRooms = new JTextField();
	private JButton nextB = new JButton("Next");
	private JButton backB = new JButton("Back");
	private JButton clearB = new JButton("Clear");
	
	//Payment Variables
	private JPanel paymentPanel;
	private JTextField paymentType = new JTextField();
	private JTextField paymentAmount = new JTextField();
	private JButton nextP = new JButton("Next");
	private JButton backP = new JButton("Back");
	private JButton clearP = new JButton("Clear");
	
	//Hotel Variables
	private JPanel hotelPanel;
	private JTextField nameH;
	private JTextField addressLine1H;
	private JTextField addressLine2H;
	private JTextField cityH;
	private JTextField stateH;
	private JTextField zipH;
	private JLabel labelNameH;
	private JLabel labelAddressLine1H;
	private JLabel labelAddressLine2H;
	private JLabel labelCityH;
	private JLabel labelStateH;
	private JLabel labelZipH;
	private JButton nextH;
	private JButton clearH;
	
	//Customer
	Customer customer;
	private JPanel mainPanel;
	
	//Customer Variables
	private JButton submit;
	private JButton clear;
	static private String[] info = new String[9];
	private JTextField firstName;
	private JTextField lastName;
	private JTextField addr1;
	private JTextField addr2;
	private JTextField city;
	private JTextField state;
	private JTextField zip;
	private JTextField phoneNumber;
	private JTextField emailAddress;
	private JLabel labelFirst;
	private JLabel labelLast;
	private JLabel labelAddr1;
	private JLabel labelAddr2;
	private JLabel labelCity;
	private JLabel labelState;
	private JLabel labelZip;
	private JLabel labelPhone;
	private JLabel labelEmail;
	private JButton next = new JButton("Next");
	private JButton back = new JButton("Back");
	private JLabel labelError;
	private boolean error = false;
	//int pos;
	
	private void createAndShowGUI() {
		JFrame mainFrame = new JFrame("Swing Database");
		mainFrame.setLayout(new BorderLayout());
		
		GridLayout grid = new GridLayout(13,2);
		GridLayout gridH = new GridLayout(13,2);
		grid.setVgap(12);
		gridH.setVgap(12);
		tabbedPane = new JTabbedPane();
		
		//Panels
		bookingPanel = new JPanel();
		paymentPanel = new JPanel();
		reviewPanel = new JPanel();
		summaryPanel = new JPanel();
		hotelPanel = new JPanel();
		hotelPanel.setLayout(gridH);
		hotelPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));

		
		mainPanel = new JPanel();
		mainPanel.setLayout(grid);
		mainFrame.add(tabbedPane, BorderLayout.CENTER);
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		
		//Tabs
		tabbedPane.addTab("Hotel", hotelPanel);
		tabbedPane.addTab("Customer", mainPanel);
		tabbedPane.addTab("Payment", paymentPanel);
		tabbedPane.addTab("Booking", bookingPanel);
		tabbedPane.addTab("Review", reviewPanel);
		
		
		//Main Fields
		firstName = new JTextField();
		lastName = new JTextField();
		addr1 = new JTextField();
		addr2 = new JTextField();
		city = new JTextField();
		state = new JTextField();
		zip = new JTextField();
		phoneNumber = new JTextField();
		emailAddress = new JTextField();
		submit = new JButton("Submit");
		clear = new JButton("Clear");
		labelFirst = new JLabel("First Name: ");
		labelLast = new JLabel("Last Name: ");
		labelAddr1 = new JLabel("Addr Line 1: ");
		labelAddr2 = new JLabel("Addr Line 2: ");
		labelCity = new JLabel("City: ");
		labelState = new JLabel("State: ");
		labelZip = new JLabel("Zip: ");
		labelPhone = new JLabel("Phone Number: ");
		labelEmail = new JLabel("Email Address: ");
		labelError = new JLabel("");
		JLabel labelCar = new JLabel("Hotel ");
		labelCar.setFont(new Font("", Font.PLAIN, 18));
		JLabel labelShop = new JLabel("Booking");
		labelShop.setFont(new Font("", Font.PLAIN, 18));
		labelCar.setHorizontalAlignment(SwingConstants.RIGHT);
		
		mainPanel.add(labelCar);
		mainPanel.add(labelShop);
		mainPanel.add(labelFirst);
		mainPanel.add(firstName);

		mainPanel.add(labelLast);
		mainPanel.add(lastName);
		
		mainPanel.add(labelAddr1);
		mainPanel.add(addr1);
		
		mainPanel.add(labelAddr2);
		mainPanel.add(addr2);
		
		mainPanel.add(labelCity);
		mainPanel.add(city);
		
		mainPanel.add(labelState);
		mainPanel.add(state);
		
		mainPanel.add(labelZip);
		mainPanel.add(zip);
		
		mainPanel.add(labelPhone);
		mainPanel.add(phoneNumber);
		
		mainPanel.add(labelEmail);
		mainPanel.add(emailAddress);
		
		mainPanel.add(back);
		mainPanel.add(next);
		//mainPanel.add(submit);
		mainPanel.add(clear);
		
		mainPanel.add(labelError);
		
		//Hotel Pane
		JLabel labels[] = new JLabel[8];
		nameH = new JTextField();
		addressLine1H = new JTextField();
		addressLine2H = new JTextField();
		cityH = new JTextField();
		stateH = new JTextField();
		zipH = new JTextField();
		labelNameH = new JLabel("Hotel: ");
		labelAddressLine1H = new JLabel("Address 1: ");
		labelAddressLine2H = new JLabel("Address 2: ");
		labelCityH = new JLabel("City: ");
		labelStateH = new JLabel("State: ");
		labelZipH = new JLabel("Zip: ");
		nextH = new JButton("Next");
		clearH = new JButton("Clear");
		JButton backH = new JButton("Back");
		backH.setEnabled(false);
		
		hotelPanel.add(labelNameH);
		hotelPanel.add(nameH);
		hotelPanel.add(labelAddressLine1H);
		hotelPanel.add(addressLine1H);
		hotelPanel.add(labelAddressLine2H);
		hotelPanel.add(addressLine2H);
		hotelPanel.add(labelCityH);
		hotelPanel.add(cityH);
		hotelPanel.add(labelStateH);
		hotelPanel.add(stateH);
		hotelPanel.add(labelZipH);
		hotelPanel.add(zipH);
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");
			hotelPanel.add(labels[i]);
		}
		hotelPanel.add(backH);
		hotelPanel.add(nextH);
		hotelPanel.add(clearH);
		
		mainFrame.setSize(500,600);
		mainFrame.setResizable(true);
		//frame.pack();
        mainFrame.setVisible(true);
        
        nextH.addActionListener(this);
        clearH.addActionListener(this);
        
        submit.addActionListener(this);
        clear.addActionListener(this);
        next.addActionListener(this);
        back.addActionListener(this);
        
		payment();
		booking();
		review();
	}
	
	public void review() {
		JLabel labels[] = new JLabel[16];
		reviewPanel.setLayout(gridAll);
		gridAll.setVgap(12);
		reviewPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		JLabel[] review = new JLabel[19];
		review[0] = new JLabel("Hotel: " + nameH.getText());
		review[1] = new JLabel("");
		reviewPanel.add(review[0]);
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");
			reviewPanel.add(labels[i]);
		}
		
		
		reviewPanel.add(backR);
		reviewPanel.add(nextR);
		reviewPanel.add(submit);
		nextR.setEnabled(false);
	}
	
	public void booking() {
		JLabel labels[] = new JLabel[16];
		bookingPanel.setLayout(gridAll);
		gridAll.setVgap(12);
		bookingPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		
		JLabel labelDate = new JLabel("Booking Date: ");
		JLabel labelNum = new JLabel("Number of Rooms: ");
		
		bookingPanel.add(labelDate);
		bookingPanel.add(bookingDate);
		bookingPanel.add(labelNum);
		bookingPanel.add(numberOfRooms);
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");
			bookingPanel.add(labels[i]);
		}
		bookingPanel.add(backB);
		bookingPanel.add(nextB);
		bookingPanel.add(clearB);
		
		backB.addActionListener(this);
		nextB.addActionListener(this);
		clearB.addActionListener(this);
	}
	
	public void payment() {
		JLabel labels[] = new JLabel[16];
		GridLayout gridP = new GridLayout(13,2);
		gridP.setVgap(12);
		paymentPanel.setLayout(gridP);
		paymentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));

		JLabel labelAmount = new JLabel("Payment Amount: ");
		JLabel labelType = new JLabel("Payment Type: ");
		
		paymentPanel.add(labelAmount);
		paymentPanel.add(paymentAmount);
		paymentPanel.add(labelType);
		paymentPanel.add(paymentType);
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");
			paymentPanel.add(labels[i]);
		}
		paymentPanel.add(backP);
		paymentPanel.add(nextP);
		paymentPanel.add(clearP);
		
		backP.addActionListener(this);
        nextP.addActionListener(this);
        clearP.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		labelError.setText("");
		error = false;
		if (e.getSource() == submit) {
			/*for(int i = 0; i< info.length; i++) {
				if (info[i].equals("")) {
					labelError.setForeground(Color.RED);
					labelError.setText("You did not enter some fields!");
					error = true;
				}
			}*/
			if (error == false) {
				 customer = new Customer(firstName.getText(), lastName.getText(), addr1.getText(), addr2.getText(), city.getText(), state.getText(), zip.getText(), phoneNumber.getText(), emailAddress.getText());
			}
			
		} else if(e.getSource() == clear) {
			firstName.setText("");
			lastName.setText("");
			addr1.setText("");
			addr2.setText("");
			city.setText("");
			state.setText("");
			zip.setText("");
			phoneNumber.setText("");
			emailAddress.setText("");
		} else if(e.getSource() == nextH || e.getSource() == next || e.getSource() == nextP || e.getSource() == nextB) {
			tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() + 1);
		} else if(e.getSource() == back || e.getSource() == backP || e.getSource() == backB || e.getSource() == backR) {
			tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() - 1);
		} else if (e.getSource() == clearH) {
			nameH.setText("");
			addressLine1H.setText("");
			addressLine2H.setText("");
			cityH.setText("");
			stateH.setText("");
			zipH.setText("");
		} else if (e.getSource() == clearP) {
			paymentAmount.setText("");
			paymentType.setText("");
		} else if (e.getSource() == clearB) {
			bookingDate.setText("");
			numberOfRooms.setText("");
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public String[] getFields() {
		return info;
	}
	
	public String getFirstName() {
		return info[0];
	}
	
	public String getLastName() {
		return info[1];
	}
	
	public String getAddr1() {
		return info[2];
	}
	
	public String getAddr2() {
		return info[3];
	}
	
	public String getCity() {
		return info[4];
	}
	
	public String getState() {
		return info[5];
	}
	
	public String getZip() {
		return info[6];
	}
	
	public String getPhoneNumber() {
		return info[7];
	}
	
	public String getEmailAddress() {
		return info[8];
	}

}
