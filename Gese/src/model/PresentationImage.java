/**package model;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PresentationImage { 

public static void main(String[] args) { 
WindowListener listener = new WindowAdapter() { 
public void windowClosing(WindowEvent e) {System.exit(0);} 
}; 

MaFrame _fenetre = new MaFrame("Impression 2 deja vue"); 
_fenetre.addWindowListener(listener); 
} 
}**/