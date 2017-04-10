package model;



/**import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
 
public class ImprimerTable extends JFrame {
	JPanel pane;
public ImprimerTable(JPanel pane)
{
	this.pane=pane;
	
	{


	    
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel jPanel = new JPanel(new GridLayout(2, 0));
	    jPanel.setOpaque(true);
	   // pane.setPreferredScrollableViewportSize(new Dimension(500, 70));
	    final MessageFormat hautDePage = new MessageFormat("Haut de Page");
	    final MessageFormat basDePage = new MessageFormat("Bas de Page");
	    jPanel.add(new JScrollPane(pane));
	    frame.add(jPanel);
	    frame.pack();
	    frame.setVisible(true);
 
       // Imprimer la table
	    //pane.print();
	}catch(Exception err)
	{
		err.printStackTrace();
	}
}
  /*public static void main(String[] args)
  {
      new ImprimerTable();
  }*/

