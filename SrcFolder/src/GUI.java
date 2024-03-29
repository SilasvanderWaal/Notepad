package src;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {
	
	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPanel;
	JMenuBar menuBar;
	JMenu menuFile, menuEdit, menuFormat, menuColor;
	JMenuItem iNew, iOpen, iSave, iSaveAs, iExit, iUndo, iRedo;

	public static void main(String[] args) {
		
		new GUI();
		
	}
	
	public GUI() {
		createWindow();
		createTextArea();
		createMenuBar();
		createFileMenu();
		
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
	
	public void createMenuBar() {
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);
		
		menuColor = new JMenu("Color");
		menuBar.add(menuColor);
	}
	
	public void createFileMenu() {
		iNew = new JMenuItem("New");
		menuFile.add(iNew);
		
		iOpen = new JMenuItem("Open");
		menuFile.add(iOpen);
		
		iSave = new JMenuItem("Save");
		menuFile.add(iSave);
		
		iSaveAs = new JMenuItem("Save as");
		menuFile.add(iSaveAs);
		
		iExit = new JMenuItem("Exit");
		menuFile.add(iExit);
		
		iUndo = new JMenuItem("Undo");
		menuEdit.add(iUndo);
		
		iRedo = new JMenuItem("Redo");
		menuEdit.add(iRedo);
	}

}
