package test;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrameTesty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

/*		System.out.println("char: ");
		int b = 6;
		int c = 2;
		System.out.println(b+" "+ c);

		try {
			c = System.in.read();
		
		}
		
		catch (IOException e) {
			
		}
		//b = Integer.parseInt(b);
		System.out.println(b);
		System.out.println(Integer.toString(c));*/
		
		JFrame okno = new JFrame("sdfsdf");
		okno.setVisible(true);
		okno.setSize(450, 250);
//		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container oknoPanel = okno.getContentPane();
//		oknoPanel.setBackground(Color.black);
		
		JMenuBar pasekMenu = new JMenuBar();
		okno.setJMenuBar(pasekMenu);
		
		JMenu menuPlik = new JMenu("Plik");
		JMenu menuZakoncz = new JMenu("Zakoñcz");
		pasekMenu.add(menuPlik);
		pasekMenu.add(menuZakoncz);
		
		JMenuItem menuPlik1 = new JMenuItem("Otwórz");
		menuPlik.add(menuPlik1);
		// nie dzia³a wy³¹czanie :(
		
		/*		class exitAction implements ActionListener{
		    public void actionPerformed (ActionEvent e){
		        System.exit(0);
		    }
		}
		exit.addActionListener(new exitAction());
		if(menuPlik1.isSelected())
		{
			System.exit(0);
		}*/
		
/*
		okno.setBackground(Color.RED);
//		okno.setTitle("muuuu");
		JMenuBar menu = new JMenuBar();
		okno.setJMenuBar(menu);
		JMenu adin = new JMenu();
		menu.add(adin).setLabel("ddd");
		
		
		
		okno.setSize(500, 500);
		okno.setLocation(500, 200);

//		okno.setLayout(null);
//		okno.setAutoRequestFocus(true);
		JButton knefel;
		JButton knefel1;
//		knefel.setSize(25, 25);
		okno.add(knefel = new JButton("aaa"));
		okno.add(knefel1 = new JButton("bbb"));
//		okno.add(knefel);
*/
	}

}
