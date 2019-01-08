import java.awt.BorderLayout;
import org.lhs.dcsdk12.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.UIManager;
public class MonsterLauncher implements ActionListener{
	private static int columns = 4, rows = 4;
	private static Monster[] menster = new Monster[columns*rows/2]; 
	private static Monster[][] m;
	
	private JFrame mainFrame = new JFrame("Memory Game");
	private JPanel mainPanel = new JPanel();
	private JButton[] monsterNames = new JButton[columns*rows];
	private JPanel secondaryPanel = new JPanel();
	private int source1 = -1, source2 = -1;
	private boolean resetColors = false;
	private int correct = 0, wrong = 0;
	private JLabel[] winsLoss = new JLabel[3];
	private JButton reveal = new JButton("Reveal");
	private boolean reveal1 = false; 
	private JButton play = new JButton("Play");
	private boolean restart = false;
	 
	public static void main(String[] args) {
		initialize();
		MonsterLauncher monLan = new MonsterLauncher();
		monLan.CreateAndShowGUI();
	}
	
	private static void initialize() {
		int max = 3;
		int min = 0;
		int r = 0, c = 0;
		String[] names = {"Bob", "Joe", "John", "Ryan", "Clint", "TJ", "Yibo", "Bryan", "Cam", "Eric", "Kyle","Andy"};
		double[] d = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] in = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i = 0; i < menster.length; i++) {
			int ran = (int)(Math.random()*12);
			int ran1 = (int)(Math.random()*12);
			int ran2 = (int)(Math.random()*12);
			int mon = (int)(Math.random()*3);
			if(mon == 0) {
				menster[i] = new Zombie(names[ran], d[ran1], in[ran2]);
				name.add(menster[i]);
				name.add(menster[i]);
			} else if (mon == 1) {
				menster[i] = new WereWolf(names[ran], d[ran1], in[ran2]);
				name.add(menster[i]);
				name.add(menster[i]);
			} else {
				menster[i] = new Vampire(names[ran], d[ran1], in[ran2]);
				name.add(menster[i]);
				name.add(menster[i]);
			}
		}
		
		r = 0;
		c = 0;
		m = new Monster[columns][rows];
		for(int i = 0; i < columns; i++) {
			r = 0;
				for(int j = 0; j < rows; j++) {
					pickName(c, r);
					//System.out.println("Location[" + c + "]["+ r + "]: " + m[c][r]);
					r++;
				}
			c++;
		}
	}
	
	private static List<Monster> name = new ArrayList();
    private static List<Monster> remaining = name;
	public static void pickName(int c, int r) {
		
		if (remaining.isEmpty()) {
            throw new IllegalStateException("names all used");
        }
		int index = (int) (Math.random() * remaining.size());
        m[c][r] = remaining.remove(index);
	}
	
	private void CreateAndShowGUI() {
		int c = 0, r = 0;
		mainFrame.setLayout(new BorderLayout());
		GridLayout grid = new GridLayout(4,6);
		grid.setVgap(1);
		grid.setHgap(1);

		mainPanel.setLayout(grid);
		mainFrame.add(mainPanel, BorderLayout.CENTER);
		mainFrame.add(secondaryPanel, BorderLayout.SOUTH);
		winsLoss[0] = new JLabel("Correct Guesses: " + correct + " ");
		winsLoss[1] = new JLabel("Incorrect Guesses: " + wrong);
		secondaryPanel.setLayout(new GridLayout(2,3));
		secondaryPanel.add(winsLoss[0]);
		winsLoss[0].setHorizontalAlignment(JLabel.RIGHT);
		secondaryPanel.add(winsLoss[1]);
		secondaryPanel.add(reveal);
		secondaryPanel.add(play);
		reveal.addActionListener(this);
		play.addActionListener(this);
		int restart = 0;
		for(int i = 0; i < columns*rows; i++) {	
			if (restart == 1) {
				restart = 0; 
				r = 0;
			}
			monsterNames[i] = new JButton(m[c][r].toString());
			monsterNames[i].setText("");
			monsterNames[i].addActionListener(this);
			monsterNames[i].setForeground(new Color(255,255,255,0));
			monsterNames[i].setEnabled(false);
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
		mainFrame.setResizable(true);
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
				monsterNames[source1].setBackground(null);
				monsterNames[source2].setBackground(null);
			}
			source1 = -1;
			source2 = -1;
		}

		for(int i = 0; i < columns*rows; i++) {
			if(e.getSource() == monsterNames[i]) {
				color(monsterNames[i]);
				if(source1 != -1 && source2 == -1) {
					source2 = i;
					check();
				} else if (source1 == -1) {
					source1 = i;
				}
				monsterNames[i].setForeground(new Color(0,0,0));
			} else if(e.getSource() == reveal) {
				if(reveal1 == false) monsterNames[i].setForeground(new Color(0,0,0)); 
				else if (monsterNames[i].isEnabled()) monsterNames[i].setForeground(new Color(0,0,0,0));
			} else if (e.getSource() == play) {
				monsterNames[i].setEnabled(true);
				play.setEnabled(false);
			}
		}
		if(e.getSource() == play) {

			initialize();
			for(int i = 0; i < menster.length; i++) {
				System.out.println(menster[i]);
			}
			int r = 0, c = 0;
			int restart = 0;
			for(int i = 0; i < columns*rows; i++) {	
				if (restart == 1) {
					restart = 0; 
					r = 0;
				}
				monsterNames[i].setText(m[c][r].toString());
				monsterNames[i].setForeground(new Color(255,255,255,0));
				if(r < rows-1) {
					r++;
				} else {
					c++;
					restart = 1;
				}
			}
			if (correct > 0) {
				wrong = 0;
				correct = 0;
				secondaryPanel.remove(winsLoss[2]);
				for(int i = 0; i < monsterNames.length; i++) {
					monsterNames[i].setBackground(null);
				}
			}
		}
		if (reveal1 == false) reveal1 = true; else reveal1 = false;
		System.out.println("Source1: " + source1 + " Source2: " + source2);
	}
	
	public void check() {
		if(monsterNames[source1].getText().equals(monsterNames[source2].getText()) && !monsterNames[source1].equals(monsterNames[source2])) {
			System.out.println("YEAHHH; true");
			monsterNames[source1].setEnabled(false);
			monsterNames[source2].setEnabled(false);
			correct++;
			winsLoss[0].setText("Correct Guesses: " + correct + " ");
			if(correct == (columns * rows / 2 )) {
				winsLoss[2] = new JLabel("You Win!");
				secondaryPanel.add(winsLoss[2]);
				play.setEnabled(true);
			}
		} else {
			System.out.println("False my dude");
			resetColors = true;
			wrong++;
			winsLoss[1].setText("Incorrect Guesses: " + wrong);
		}
	}
	
	public void color(JButton m) {
		char[] c = m.getText().toCharArray();
		if(c[0] == 'V') {
			m.setBackground(Color.red);
			m.setOpaque(true);
		} else if(c[0] == 'W') {
			m.setBackground(Color.green);
			m.setOpaque(true);
		} else {
			m.setBackground(Color.yellow);
			m.setOpaque(true);
		}
	}

}
