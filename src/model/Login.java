package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

import vue.Acceuil;
import vue.FichePatient;
import vue.Medecin;

public class Login {
	
	static Connection con;
	static Statement st;
	ResultSet  rs;
    int id_secretaire;
    static int changer;
	public int getId_secretaire() {
		return id_secretaire;
	}

	public void setId_secretaire(int id_secretaire) {
		this.id_secretaire = id_secretaire;
	}

	public String login,mdp;
	//Connexion connexion=new Connexion(con,st);
//constructeur login
	public Login(String login, String mdp) {
		
		this.login = login;
		this.mdp = mdp;
		
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
	
	public Login() {
		// TODO Auto-generated constructor stub
		
	}

	
	public void verifierMedecin(){
		 boolean defaut=false;
			try{
				   rs=st.executeQuery("select mot_de_passe from medecin where login='"+login+"'");
				 while(rs.next()){
					 
				if(mdp.equals(rs.getObject(1))){	
				defaut=true;
				Medecin m =new Medecin();
				m.setVisible(true);
				
				 }  
				 }
				 if(defaut==false){
						JOptionPane.showMessageDialog(null,"le mot de passe ou le login n'est pas correct");
						}
				 }
			 catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
		 try{ rs.close(); st.close();con.close();} catch(Exception d){} 
		 
		   
		 }
		
	public void verifierSecretaire(){
		 boolean defaut=false;
			try{
				 rs=st.executeQuery("select mot_de_passe,id_secretaire from secretaire where login='"+login+"'");
				 while(rs.next()){
					 
				if(mdp.equals(rs.getObject(1))){	
				defaut=true;
				changer=rs.getInt(2);
				System.out.println(changer);
				FichePatient fp =new FichePatient();
				fp.setVisible(true);

				 }  
				 }
				 if(defaut==false){
						JOptionPane.showMessageDialog(null,"le mot de passe ou le login n'est pas correct");
						}
				 }
			 catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
		 try{ rs.close(); st.close();con.close();} catch(Exception d){} 
		    
		 }
	//pour recuperer l id
	public void remplacer(){
		setId_secretaire(changer);
	
		
	}
	
	
	}
	

