package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickOrTreat implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton trick = new JButton();
	JButton treat = new JButton();
	
	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		trick.setText("Trick!");
		trick.addActionListener(this);
		treat.setText("Treat!");
		treat.addActionListener(this);
		
		panel.add(trick);
		panel.add(treat);
		
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed.equals(trick)) {
			showPictureFromTheInternet("https://www.google.com/url?sa=i&url=https%3A%2F%2Fbarkpost.com%2Flife%2Fdog-names-music%2F&psig=AOvVaw1bp9QKPKWX5UGXiCwLiUfy&ust=1587777926120000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPjR0_Dz_-gCFQAAAAAdAAAAABAD");
		}
		if (buttonPressed.equals(treat)) {
			showPictureFromTheInternet("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.instructables.com%2Fid%2FHow-to-Play-the-C-Major-Scale-on-the-Piano%2F&psig=AOvVaw1vlAy30N-zUIBjUgfn7JRK&ust=1587777978108000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLickYX0_-gCFQAAAAAdAAAAABAD");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
}
