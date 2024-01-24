package src;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {
	
	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPanel;

	public static void main(String[] args) {
		
		new GUI();
		
	}
	
	public GUI() {
		createWindow();
		createTextArea();
		
		window.setVisible(true);
	}
	
	public void createWindow() {
		 
		window = new JFrame("Notepad");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createTextArea() {
		textArea = new JTextArea();
		window.add(textArea);
		
		scrollPanel = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPanel.setBorder(BorderFactory.createEmptyBorder());
		window.add(scrollPanel);
	}

}
