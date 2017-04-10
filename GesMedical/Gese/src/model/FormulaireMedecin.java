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
	int u,u1,resultat,u5;
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
		

		public int inserer(String nom , String prenom,String specialite, String login,String motdepasse){
			
			try{

				u=st.executeUpdate( "insert into medecin values(null,'"+nom+"','"+prenom+"','"+specialite+"','"+login+"','"+motdepasse+"' )");

			}
			catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
			try { rs.close ( ) ;}catch (Exception d) {}
			return u;
		}
		
		public Object[][] MedecinRecupAdmin(){
			Object[][] dat=new Object[30][6];
			int i=0;
			try{     
				//JCheckBox jc= new JCheckBox();
				       rs=st.executeQuery("select * from medecin order by id_medecin desc");
							 while(rs.next()){
								 dat[i][0] =rs.getInt(1);
								 dat[i][1] =rs.getString(2);
								 dat[i][2] =rs.getString(3);
								 dat[i][3] =rs.getString(4);
								 dat[i][4] =rs.getString(5);
								 dat[i][5] =rs.getString(6);
								 
							 i++;
						
		    	// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
								}
				 }
				       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
					     try{ rs.close();st.close();con.close();} catch(Exception d){}
						return dat; 
					     
		}  
		
		
		public Object[][] secretaireRecupAdmin(){
			Object[][] dat=new Object[30][6];
			int i=0;
			try{     
				//JCheckBox jc= new JCheckBox();
				       rs=st.executeQuery("select * from secretaire order by id_secretaire desc");
							 while(rs.next()){
								 dat[i][0] =rs.getInt(1);
								 dat[i][1] =rs.getString(2);
								 dat[i][2] =rs.getString(3);
								 dat[i][3] =rs.getString(4);
								 dat[i][4] =rs.getString(5);
								
								 
							 i++;
						
		    	// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
								}
				 }
				       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
					     try{ rs.close();st.close();con.close();} catch(Exception d){}
						return dat; 
					     
		}  
		public String[] modifier(int id){
			String[] dat=new String[5];
			int i=0;
			try{     
				//JCheckBox jc= new JCheckBox()
				rs=st.executeQuery("select * from medecin where id_medecin='"+id+"'");
				while(rs.next()){
					
					dat[0] =rs.getString(2);
					dat[1] =rs.getString(3);
					dat[2] =rs.getString(4);
					dat[3] =rs.getString(5);
					dat[4] =rs.getString(6);
					

				}
			}
			catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
			try{ rs.close();st.close();con.close();} catch(Exception d){}
			System.out.println("bien recu "+dat[0]+" "+dat[1]+" "+dat[2]);
			return dat; 
		}
		
		
		public String[] modifierSec(int id){
			String[] dat=new String[5];
			int i=0;
			try{     
				//JCheckBox jc= new JCheckBox()
				rs=st.executeQuery("select * from secretaire where id_secretaire='"+id+"'");
				while(rs.next()){
					
					dat[0] =rs.getString(2);
					dat[1] =rs.getString(3);
					dat[2] =rs.getString(4);
					dat[3] =rs.getString(5);
					
					

				}
			}
			catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
			try{ rs.close();st.close();con.close();} catch(Exception d){}
			return dat; 
		}
		
		
		public int update(String nom, String prenom,String specialite,String login,String motdepasse,int id){
			
			try{

				u1=st.executeUpdate( "UPDATE medecin SET  nom_medecin = '"+nom+"',prenom_medecin =  '"+prenom+"',specialite = '"+specialite+"',login =  '"+login+"',mot_de_passe =  '"+motdepasse+"'WHERE id_medecin ='"+id+"';");

			}
			catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
			try { rs.close ( ) ;}catch (Exception d) {}
			return u1;
		}	
		
public int insererAntecedant(int id_patient ,String description, String categorie,String groupe){
			
			try{

				u=st.executeUpdate( "insert into antecedants values('"+id_patient+"',null,'"+description+"','"+categorie+"','"+groupe+"' )");

			}
			catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
			try { rs.close ( ) ;}catch (Exception d) {}
			return u;
		}


	

public Object[] recuperationAntecedant(int num){
	Object[] dat=new Object[3];
	int i=0;
	try{     
		//JCheckBox jc= new JCheckBox();
		       rs=st.executeQuery("select description,categorie,groupe_sanguin from antecedants where id_patient='"+num+"'");
					 while(rs.next()){
						 dat[0] =rs.getString(1);
						 dat[1] =rs.getString(2);
						 dat[2] =rs.getString(3);
				
						 
					 i++;
				
    	// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
						}
		 }
		       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
			     try{ rs.close();st.close();con.close();} catch(Exception d){}
				return dat; 
			     
}  

public int update(String description,String categorie, String groupe,int id){
	
	try{

		u1=st.executeUpdate( "UPDATE antecedants SET  description = '"+description+"',categorie =  '"+categorie+"',groupe = '"+groupe+"' WHERE id_patient ='"+id+"';");

	}
	catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
	try { rs.close ( ) ;}catch (Exception d) {}
	return u1;
}	

	
public int insererSec(String nom , String prenom, String login,String motdepasse){
	
	try{

		u=st.executeUpdate( "insert into secretaire values(null,'"+nom+"','"+prenom+"','"+login+"','"+motdepasse+"' )");

	}
	catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
	try { rs.close ( ) ;}catch (Exception d) {}
	return u;
}
public int updateSec(String nom, String prenom,String login,String motdepasse,int id){
	
	try{

		u1=st.executeUpdate( "UPDATE secretaire SET  nom_secretaire = '"+nom+"',prenom_secretaire =  '"+prenom+"',login =  '"+login+"',mot_de_passe =  '"+motdepasse+"'WHERE id_secretaire ='"+id+"';");

	}
	catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
	try { rs.close ( ) ;}catch (Exception d) {}
	return u1;
}


public int recupid(int num){
	int a=0;

	try{     
		//JCheckBox jc= new JCheckBox();
		       rs=st.executeQuery("select id_rv from rv  where id_patient='"+num+"'");
					 while(rs.next()){
						a=rs.getInt(1);
						 
						}
		 }
		       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
			     try{ rs.close();st.close();con.close();} catch(Exception d){}
				return a; 
				
}  
   

          


public static void main(String [] args){
	FormulaireMedecin fm= new FormulaireMedecin();
	int a=fm.recupid(201703216);
	System.out.println(a);
//	fm.inserercons(3, 12, 12, 12, "tresmal", "2015-25-56");
}		
	
}	
		
	

