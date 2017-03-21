package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import vue.FichePatient;

public class FormulaireMedecin {
	
	static Connection con;
	static Statement st;
	ResultSet  rs;
	int u,u1,resultat;
	private String[][] data;
	int id_rv;
	
		public int getId_rv() {
		return id_rv;
	}

	public void setId_rv(int id_rv) {
		this.id_rv = id_rv;
	}

		public FormulaireMedecin(){
			
		try{ Class.forName("com.mysql.jdbc.Driver").newInstance(); }
		catch(Exception e){System.out.println("Erreur driver"+e.getMessage());}

		try {con=DriverManager.getConnection("jdbc:mysql://localhost/gestionmedical","root","");
		System.out.println("bonne connexion");
		}
		 catch(Exception e){System.out.println("Erreur de connexion"+e.getMessage());}
		
		 try {st=con.createStatement();
		 System.out.println("bonne statement");}
		 catch(Exception e){System.out.println("Erreur de statement"+e.getMessage());}
	}
		
		public Object[][] recuperationMedecin(){
			Object[][] dat=new Object[8][10];
			int i=0;
			try{     
				//JCheckBox jc= new JCheckBox();
				       rs=st.executeQuery("select * from consultation order by id_consultation desc");
							 while(rs.next()){
								 dat[i][0] =rs.getInt(1);
								 dat[i][1] =rs.getInt(2);
								 dat[i][2] =rs.getInt(3);
								 dat[i][3] =rs.getInt(4);
								 dat[i][4] =rs.getInt(5);
								 dat[i][5] =rs.getString(6);
								 dat[i][6] =rs.getString(7);
								 //dat[i][7] =rs.getString(8);
								 dat[i][7] =rs.getString(9);
								 dat[i][8] =rs.getString(10);
							 i++;
						
		    	// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
								}
				 }
				       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
					     try{ rs.close();st.close();con.close();} catch(Exception d){}
						return dat; 
					     
		}  	
		

}				
		
	
	
		
	

