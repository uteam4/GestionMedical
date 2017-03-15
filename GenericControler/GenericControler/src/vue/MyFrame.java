package vue;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controler.Controler;

public class MyFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	protected JButton jbu;
	
	public MyFrame(){
		super();
		
		JPanel pan1 = new JPanel();
		JLabel lab1 = new JLabel("Prénom:");
		JTextField jtf1 = new JTextField(); 
		jtf1.setColumns(10);
		jtf1.setName("STR_OB_Prénom");
		pan1.add(lab1);
		pan1.add(jtf1);
		
		JPanel pan2 = new JPanel();
		JLabel lab2 = new JLabel("Nom:");
		JTextField jtf2 = new JTextField(); 
		jtf2.setColumns(10);
		jtf2.setName("STR_OB_Nom");
		pan2.add(lab2);
		pan2.add(jtf2);
		
		JPanel pan3 = new JPanel();
		JLabel lab3 = new JLabel("Age:");
		JTextField jtf3 = new JTextField(); 
		jtf3.setColumns(10);
		jtf3.setName("INT_OB_Age");
		pan3.add(lab3);
		pan3.add(jtf3);
		
		JPanel pan4 = new JPanel();
		JLabel lab4 = new JLabel("Tel.:");
		JTextField jtf4 = new JTextField(); 
		jtf4.setColumns(10);
		jtf4.setName("TEL_FAC_Téléphone");
		pan4.add(lab4);
		pan4.add(jtf4);
		
		
		JPanel mainPan = new JPanel();
		mainPan.setLayout(new GridLayout(4,1));
		mainPan.add(pan1);
		mainPan.add(pan2);
		mainPan.add(pan3);
		mainPan.add(pan4);
		
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		container.add(mainPan, BorderLayout.CENTER);
		
		jbu = new JButton("Enregistrer");
		jbu.addActionListener(this);
		
		container.add(jbu, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setBounds(100, 100, 200, 300);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent aevt) {
		Object src = aevt.getSource();
		if(src == jbu){
			if(Controler.isAllOk(this.getContentPane())){
				JOptionPane.showMessageDialog(null, "Données enregistrées!", "Erreur", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

	
	public static void main(String[] args){
		new MyFrame();
	}
}
