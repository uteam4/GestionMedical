package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JPanel;

public class Impression1 extends JPanel implements Printable, ActionListener{

    JPanel frameToPrint;

/** **/

public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

if (page > 0) {

System.out.println("2");

 return NO_SUCH_PAGE;

}

Graphics2D g2d = (Graphics2D) g;

g2d.translate(pf.getImageableX(), pf.getImageableY());

frameToPrint.printAll(g);

System.out.println("3");

return PAGE_EXISTS;

}

public void actionPerformed(ActionEvent e) {

Object source =e.getSource();

if(source==null){

System.out.println("Ok");

PrinterJob job = PrinterJob.getPrinterJob();

job.setPrintable(this);

boolean ok = job.printDialog();

if (ok) {

 try {

   job.print();

 } catch (PrinterException ex) {

}

}

}

}

public Impression1(JPanel f) {

frameToPrint = f;

System.out.println("1");

}

public static void main(String args[]) {
	Impression1 imp=new Impression1(null);
	imp.setVisible(true);
}

}