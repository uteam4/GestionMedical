package controleur;

import model.Login;
import java.sql.DriverManager;
public class ControleurLogin {
	
	String statut;
	String login;
	String mdp;
	public ControleurLogin(String statut,String login,String mdp){
		this.statut=statut;
		this.login=login;
		this.mdp=mdp;
	Login log=new Login(login,mdp);
		if(statut.equals("Medecin")){
	log.verifierMedecin();
		
		}
		else 
			if(statut.equals("Secretaire")){
	
			log.verifierSecretaire();
			}
			else
		
	
			if(statut.equals("Administrateur")){
				
				log.verifierAdmin();
			}
			
	}}
	


