import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
public class MonsterLauncher implements ActionListener {
	private static Monster[] menster = new Monster[12]; 
	private static Monster[] menster2 = new Monster[12];
	private static Monster[][] m;
	private static int columns = 6, rows = 4;
	 
	public static void main(String[] args) {
		int max = 3;
		int min = 0;
		int r = 0, c = 0;
		String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven","Twelve"};
		double[] d = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] in = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i = 0; i < menster.length; i++) {
			int ran = (int)(Math.random()*12);
			int ran1 = (int)(Math.random()*12);
			int ran2 = (int)(Math.random()*12);
			int mon = (int)(Math.random()*3);
			if(mon == 0) {
				menster[i] = new Zombie(names[ran], d[ran1], in[ran2]);
				menster2[i] = new Zombie(names[ran], d[ran1], in[ran2]);
				name.add(menster[i]);
				name.add(menster2[i]);
			} else if (mon == 1) {
				menster[i] = new WereWolf(names[ran], d[ran1], in[ran2]);
				menster2[i] = new WereWolf(names[ran], d[ran1], in[ran2]);
				name.add(menster[i]);
				name.add(menster2[i]);
			} else {
				menster[i] = new Vampire(names[ran], d[ran1], in[ran2]);
				menster2[i] = new Vampire(names[ran], d[ran1], in[ran2]);
				name.add(menster[i]);
				name.add(menster2[i]);
			}
		}
		
		r = 0;
		c = 0;
		m = new Monster[columns][rows];
		for(int i = 0; i < columns; i++) {
			r = 0;
			int math =(int)(( Math.random () * (max - min + 1)) + min);
			
				for(int j = 0; j < rows; j++) {
					math =(int) (Math.floor( Math.random () * (max - min + 1)) + min);
					pickName(c, r);
					//System.out.println("Location[" + c + "]["+ r + "]: " + m[c][r]);
					r++;
				}
			c++;
		}
		MonsterLauncher monLan = new MonsterLauncher();
		monLan.CreateAndShowGUI();
	}
	
	private static List<Monster> name = new ArrayList();
    private static List<Monster> remaining = name;
	public static void pickName(int c, int r) {
		
		if (remaining.isEmpty()) {
            // could refill 'remaining' here.. but we'll just throw, for now.
            throw new IllegalStateException("names all used");
        }
		int index = (int) (Math.random() * remaining.size());
        //String result = remaining.remove( index).toString();
        m[c][r] = remaining.remove(index);
	}
	
	private JFrame mainFrame = new JFrame("Memory Game");
	private JPanel mainPanel = new JPanel();
	private JButton[] monsterNames = new JButton[columns*rows];
	private JPanel secondaryPanel = new JPanel();
	private int source1 = -1, source2 = -1;
	private boolean resetColors = false;
	private int correct = 0, wrong = 0;
	private JLabel[] winsLoss = new JLabel[3];
	
	private void CreateAndShowGUI() {
		int c = 0, r = 0;
		mainFrame.setLayout(new BorderLayout());
		GridLayout grid = new GridLayout(4,6);
		grid.setVgap(1);
		grid.setHgap(1);

		mainPanel.setLayout(grid);
		mainFrame.add(mainPanel, BorderLayout.CENTER);
		mainFrame.add(secondaryPanel, BorderLayout.SOUTH);
		winsLoss[0] = new JLabel("Wins: " + correct);
		winsLoss[1] = new JLabel("Loss: " + wrong);
		secondaryPanel.add(winsLoss[0]);
		secondaryPanel.add(winsLoss[1]);
		int restart = 0;
		for(int i = 0; i < columns*rows; i++) {	
			if (restart == 1) {
				restart = 0; 
				r = 0;
			}
			monsterNames[i] = new JButton(m[c][r].toString());
			monsterNames[i].addActionListener(this);
			monsterNames[i].setForeground(new Color(255,255,255,0));
			mainPanel.add(monsterNames[i]);
			monsterNames[i].setPreferredSize(new Dimension(300, 100));
			if(r < rows-1) {
				r++;
			} else {
				c++;
				restart = 1;
			}
		}
		
		
		mainFrame.setSize(1800,400);
		mainFrame.setResizable(false);
		mainFrame.pack();
        mainFrame.setVisible(true);
        System.out.println(mainPanel.getSize().getHeight());
	}

	public void actionPerformed(ActionEvent e) {
		if(source1 != -1 && source2 != -1) {
			if(resetColors == true) {
				resetColors = false;
				monsterNames[source1].setForeground(new Color(0,0,0,0));
				monsterNames[source2].setForeground(new Color(0,0,0,0));
			}
			source1 = -1;
			source2 = -1;
		}

		for(int i = 0; i < columns*rows; i++) {
			if(e.getSource() == monsterNames[i]) {
				if(source1 != -1 && source2 == -1) {
					source2 = i;
					check();
				} else if (source1 == -1) {
					source1 = i;
				}
				monsterNames[i].setForeground(new Color(0,0,0));
			}
			
		}
		System.out.println("Source1: " + source1 + " Source2: " + source2);
	}
	
	public void check() {
		if(monsterNames[source1].getText().equals(monsterNames[source2].getText()) && !monsterNames[source1].equals(monsterNames[source2])) {
			System.out.println("YEAHHH; true");
			monsterNames[source1].setEnabled(false);
			monsterNames[source2].setEnabled(false);
			correct++;
			winsLoss[0].setText("Wins: " + correct);
			if(correct == (columns * rows / 2 )) {
				winsLoss[2] = new JLabel("You Win!");
				secondaryPanel.add(winsLoss[2]);
			}
		} else {
			System.out.println("False my dude");
			resetColors = true;
			wrong++;
			winsLoss[1].setText("Loss: " + wrong);
		}
	}
}
