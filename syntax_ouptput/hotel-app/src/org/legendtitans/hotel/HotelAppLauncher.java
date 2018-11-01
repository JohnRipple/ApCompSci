package org.legendtitans.hotel;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.legendtitans.hotel.domain.Booking;
import org.legendtitans.hotel.domain.Customer;
import org.legendtitans.hotel.domain.Hotel;
import org.legendtitans.hotel.domain.Payment;
import org.legendtitans.hotel.domain.PaymentType;

import javax.swing.JFrame;

public class HotelAppLauncher implements ActionListener, ChangeListener {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception ignored) {
		}
		javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
            	HotelAppLauncher hotel = new HotelAppLauncher();
            	hotel.createAndShowGUI();
            } 
        }); 
		
	}
	private JTabbedPane tabbedPane;
	private GridLayout gridAll = new GridLayout(13,2);
	
	//User
	private JTextField userName = new JTextField();
	private JTextField passWord = new JTextField();
	private JButton enter = new JButton("Enter");
	private JPanel userGUI = new JPanel();
	private int start = 0;
	
	//Summary Panel
	private JPanel summaryPanel;
	private JLabel done = new JLabel("All Done!");
	
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
	private JRadioButton[] paymentT = new JRadioButton[3];
	ButtonGroup group = new ButtonGroup();
	private int type;
	
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
	
	//Objects
	Customer customer;
	private JPanel mainPanel;
	Booking booking;
	Hotel hotel;
	Payment payment;
	
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
	
	private void createAndShowGUI() {
		JFrame mainFrame = new JFrame("Hotel App");
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
		mainFrame.add(userGUI);
		if (start == 0) {
			user();
		} else {
			mainFrame.remove(userGUI);
			mainFrame.add(tabbedPane, BorderLayout.CENTER);
			mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
			
			//Tabs
			tabbedPane.addTab("Hotel", hotelPanel);
			tabbedPane.addTab("Customer", mainPanel);
			tabbedPane.addTab("Payment", paymentPanel);
			tabbedPane.addTab("Booking", bookingPanel);
			tabbedPane.addTab("Review", reviewPanel);
			tabbedPane.addTab("Summary", summaryPanel);
			tabbedPane.setEnabledAt(tabbedPane.getTabCount() - 1, false);
	        
	        mainPanel();
	        hotel();
			payment();
			booking();
			review();
			summary();
			tabbedPane.addChangeListener(this);
		}
		mainFrame.setSize(500,600);
		mainFrame.setResizable(false);
		//frame.pack();
        mainFrame.setVisible(true);
		
	}
	
	private void user() {
		JLabel labels[] = new JLabel[20];
		userGUI.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		JLabel username =  new JLabel("User Name: ");
		JLabel password = new JLabel("Password: ");
		userGUI.setLayout(gridAll);
		userGUI.add(username);
		userGUI.add(userName);
		userGUI.add(password);
		userGUI.add(passWord);
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");
			userGUI.add(labels[i]);
		}
		userGUI.add(enter);
		enter.addActionListener(this);
	}
	
	private void mainPanel() {
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

		clear.addActionListener(this);
		next.addActionListener(this);
		back.addActionListener(this);
	}
	
	private void hotel() {
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

		nextH.addActionListener(this);
		clearH.addActionListener(this);
	}
	
	private void summary() {
		summaryPanel.setLayout(new BorderLayout());
		summaryPanel.add(done, BorderLayout.NORTH);
		summaryPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		done.setFont(new Font("", Font.PLAIN, 28));
		done.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public void stateChanged(ChangeEvent e) {
       if(e.getSource() == tabbedPane) {
    	   update();
       }
    }
	
	private JLabel[] review = new JLabel[19];
	
	private void review() {
		JLabel labels[] = new JLabel[1];
		reviewPanel.setLayout(gridAll);
		gridAll.setVgap(12);
		reviewPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		review[0] = new JLabel("Hotel: " + nameH.getText());
		review[1] = new JLabel("Address Line 1: " + addressLine1H.getText());
		review[2] = new JLabel("Address Line 2: " + addressLine2H.getText());
		review[3] = new JLabel("City: " + cityH.getText());
		review[4] = new JLabel("State: " + stateH.getText());
		review[5] = new JLabel("Zip: " + zipH.getText());
		review[6] = new JLabel("First Name: " + firstName.getText());
		review[7] = new JLabel("Last Name: " + lastName.getText());
		review[8] = new JLabel("Addr Line 1: " + addr1.getText());
		review[9] = new JLabel("Addr Line 2: " + addr2.getText());
		review[10] = new JLabel("City: " + city.getText());
		review[11] = new JLabel("State: " + state.getText());
		review[12] = new JLabel("Zip: " + zip.getText());
		review[13] = new JLabel("Phone Number: " + phoneNumber.getText());
		review[14] = new JLabel("Email Address: " + emailAddress.getText());
		review[15] = new JLabel("Payment Amount: " + paymentAmount.getText());
		review[16] = new JLabel("Payment Type: ");
		review[17] = new JLabel("Booking Date: " + bookingDate.getText());
		review[18] = new JLabel("Number of Rooms: " + numberOfRooms.getText());

		update();
		for(int i = 0; i < review.length; i++) {
			reviewPanel.add(review[i]);
		}
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");
			reviewPanel.add(labels[i]);
		}
		
		submit.setEnabled(false);
		reviewPanel.add(backR);
		reviewPanel.add(nextR);
		reviewPanel.add(submit);
		nextR.setEnabled(false);
		
		backR.addActionListener(this);
		submit.addActionListener(this);
	}
	
	private void update() {
		review[0].setText("Hotel: " + nameH.getText());
		review[1].setText("Address Line 1: " + addressLine1H.getText());
		review[2].setText("Address Line 2: " + addressLine2H.getText());
		review[3].setText("City: " + cityH.getText());
		review[4].setText("State: " + stateH.getText());
		review[5].setText("Zip: " + zipH.getText());
		review[6].setText("First Name: " + firstName.getText());
		review[7].setText("Last Name: " + lastName.getText());
		review[8].setText("Addr Line 1: " + addr1.getText());
		review[9].setText("Addr Line 2: " + addr2.getText());
		review[10].setText("City: " + city.getText());
		review[11] .setText("State: " + state.getText());
		review[12].setText("Zip: " + zip.getText());
		review[13].setText("Phone Number: " + phoneNumber.getText());
		review[14].setText("Email Address: " + emailAddress.getText());
		review[15].setText("Payment Amount: " + paymentAmount.getText());
		review[17].setText("Booking Date: " + bookingDate.getText());
		review[18].setText("Number of Rooms: " + numberOfRooms.getText());
		
		if(paymentT[0].isSelected()) {
			review[16].setText("Payment Type: Credit Card");
		} else if (paymentT[1].isSelected()) {
			review[16].setText("Payment Type: Debit Card");
		} else if (paymentT[2].isSelected()) {
			review[16].setText("Payment Type: Cash");
		}
		
		if(nameH.getText().equals("") || addressLine1H.getText().equals("") || addressLine2H.getText().equals("") || cityH.getText().equals("") || stateH.getText().equals("") || zipH.getText().equals("") || firstName.getText().equals("") || lastName.getText().equals("")) {
			submit.setEnabled(false);
		} else if (addr1.getText().equals("") || addr2.getText().equals("") || city.getText().equals("") || state.getText().equals("") || zip.getText().equals("") || phoneNumber.getText().equals("") || emailAddress.getText().equals("")) {
			submit.setEnabled(false);
		} else if(paymentAmount.getText().equals("") || bookingDate.getText().equals("") || numberOfRooms.getText().equals("")) {
			submit.setEnabled(false);
		} else if(paymentT[0].isSelected() || paymentT[1].isSelected() || paymentT[2].isSelected()) {
			submit.setEnabled(true);
			if (paymentT[0].isSelected()) {
				type = PaymentType.CREDIT_CARD;
			} else if (paymentT[1].isSelected()) {
				type = PaymentType.DEBIT_CARD;
			} else if (paymentT[2].isSelected()) {
				type = PaymentType.CASH;
			}
		}
		
	}
	
	private void booking() {
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
	
	private void payment() {
		JLabel labels[] = new JLabel[14];
		GridLayout gridP = new GridLayout(13,2);
		gridP.setVgap(12);
		paymentPanel.setLayout(gridP);
		paymentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));

		JLabel labelAmount = new JLabel("Payment Amount: ");
		JLabel labelType = new JLabel("Payment Type: ");
		paymentT[0] = new JRadioButton("Credit Card");
		paymentT[1] = new JRadioButton("Debit Card");
		paymentT[2] = new JRadioButton("Cash");
		
		paymentPanel.add(labelAmount);
		paymentPanel.add(paymentAmount);
		paymentPanel.add(labelType);
		for(int i = 0; i < paymentT.length; i++) {
			group.add(paymentT[i]);
			paymentPanel.add(paymentT[i]);
		}
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
	
	private void tabs() {
		
		for (int i = 1; i < tabbedPane.getTabCount()+1; i++) {
			tabbedPane.setEnabledAt(tabbedPane.getTabCount() - i, false);
		}
		tabbedPane.setEnabledAt(tabbedPane.getTabCount() - 1, true);
	}
	
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == submit) {
			tabs();
			tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() + 1);
			double amount = Double.parseDouble(paymentAmount.getText());
			payment = new Payment(amount, type);
			customer = new Customer(firstName.getText(), lastName.getText(), addr1.getText(), addr2.getText(), city.getText(), state.getText(), zip.getText(), phoneNumber.getText(), payment);
			hotel = new Hotel(nameH.getText(), addressLine1H.getText(), addressLine2H.getText(), cityH.getText(), stateH.getText(), zipH.getText());
			int num = Integer.parseInt(numberOfRooms.getText());
			booking = new Booking();
			//booking.setBookingDate(date);
			booking.setCustomer(customer);
			booking.setHotel(hotel);
			
		} 
		//Next and back buttons
		else if(e.getSource() == nextH || e.getSource() == next || e.getSource() == nextP || e.getSource() == nextB) {
			tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() + 1);
		} else if(e.getSource() == back || e.getSource() == backP || e.getSource() == backB || e.getSource() == backR) {
			tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() - 1);
		}
		//Clear buttons
		else if (e.getSource() == clearH) {
			nameH.setText("");
			addressLine1H.setText("");
			addressLine2H.setText("");
			cityH.setText("");
			stateH.setText("");
			zipH.setText("");
		} else if (e.getSource() == clearP) {
			paymentAmount.setText("");
			paymentType.setText("");
			group.clearSelection();
		} else if (e.getSource() == clearB) {
			bookingDate.setText("");
			numberOfRooms.setText("");
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
		} else if (e.getSource() == enter) {
			if(userName.getText().equals("h") && passWord.getText().equals("1")) {
				start = 1;
				createAndShowGUI();
			}
			
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
