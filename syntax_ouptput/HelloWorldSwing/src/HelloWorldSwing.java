
/* 
 * HelloWorldSwing.java requires no other files. 
 */ 
import javax.swing.*;
import java.awt.*;    
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
  
public class HelloWorldSwing implements ActionListener { 
	
	public static void main(String[] args) { 
        //Schedule a job for the event-dispatching thread: 
        //creating and showing this application's GUI. 
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                HelloWorldSwing hws = new HelloWorldSwing();
            	hws.createAndShowGUI(); 
                
            } 
        }); 
    } 
	
    /** 
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread. 
     */ 
	JButton love;
	JButton friends;
	JButton peeps;

    private void createAndShowGUI() { 
    	//Create and set up the window. 
    	JFrame frame = new JFrame("HelloWorldSwing"); 
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    	JPanel panel = new JPanel();
    	JPanel left = new JPanel();
		JPanel middle = new JPanel();
		JPanel right = new JPanel();
		JPanel bottom = new JPanel();
		JPanel top = new JPanel();

		left.setPreferredSize(new Dimension(80,100));
		middle.setPreferredSize(new Dimension(85,100));
		right.setPreferredSize(new Dimension(85,100));
	
		GridLayout grid = new GridLayout(3,1, 20, 40);
		frame.getContentPane().add(panel); 
		frame.getContentPane().add(BorderLayout.SOUTH, bottom);
		panel.setLayout(new BorderLayout());
	
		panel.add(left, BorderLayout.WEST);	
		panel.add(middle, BorderLayout.CENTER);
		panel.add(right, BorderLayout.EAST);
		panel.add(bottom, BorderLayout.SOUTH);
		panel.add(top, BorderLayout.NORTH);
	
		left.setLayout(grid);
		middle.setLayout(grid);
		right.setLayout(grid);
		bottom.setLayout(new GridLayout(1,1));
		top.setLayout(new GridLayout(1,1));
		
        //Add the ubiquitous "Hello World" label. 
        //JLabel label = new JLabel("OOF!", SwingConstants.CENTER); 
        //frame.getContentPane().add(label); 
	

		love = new JButton("Love");
		friends = new JButton("Friends");
		peeps = new JButton("Peeps");
	
		JTextField them = new JTextField("I Love Them",10);
		JTextField gui = new JTextField("GUI Fun");
		gui.setHorizontalAlignment(SwingConstants.CENTER);
		them.setHorizontalAlignment(SwingConstants.CENTER);
	
		String song[] = {"These", "are", "my", "friends"};
		JComboBox<String> these = new JComboBox<>(song);
	
		JCheckBox free = new JCheckBox("free");
		JCheckBox pass = new JCheckBox("pass");
	
		left.add(love);
		left.add(friends);
		left.add(peeps);
	
		middle.add(new JRadioButton("true"));
		middle.add(new JRadioButton("false"));
		middle.add(these);
	
		right.add(free);
		right.add(pass);
		bottom.add(them);
		top.add(gui);
	
        //Display the window. 
		frame.setSize(350,250);
		frame.setResizable(false);
		//frame.pack();
        frame.setVisible(true); 

        love.addActionListener(this);
        friends.addActionListener(this);
        peeps.addActionListener(this);
   }
	
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == love) {
        	if (love.getBackground() == Color.RED) {
        		love.setBackground(Color.YELLOW);
        	} else {
        		love.setBackground(Color.RED);
        	}
        } else if (e.getSource() == friends) {
        	System.out.println("Friends");
        } else if (e.getSource() == peeps) {
        	System.out.println("Peeps");
        }
    }

}