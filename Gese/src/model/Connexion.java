package model;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connexion {
	public static Connection con;
	public static Statement st;
	
	
	


	public  Connexion(Connection con, Statement st){
		try{ Class.forName("com.mysql.jdbc.Driver").newInstance(); }
		catch(Exception e){System.out.println("Erreur driver"+e.getMessage());}

		try {con=DriverManager.getConnection("jdbc:mysql://localhost/gestionmedical","root","");
		System.out.println("bonne connexion");
		}
		 catch(Exception e){System.out.println("Erreur de connexion"+e.getMessage());}
		
		 try {st=con.createStatement(); 
		 System.out.println("bonne statemet");}
		 catch(Exception e){System.out.println("Erreur de statement"+e.getMessage());}
	 
	
	}
	
	

	
}
