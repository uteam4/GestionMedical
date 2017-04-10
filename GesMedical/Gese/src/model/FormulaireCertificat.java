package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FormulaireCertificat {
	static Connection con;
	static Statement st;
	ResultSet  rs;
	int u;
	
	public FormulaireCertificat(){
		
		
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
	public String recuperationMedecin(){
		Login log= new Login();
		log.prendre();
	
		int id_med=log.getId_medecin();
		System.out.println(id_med);
		String nom=null;
		String prenom=null;
		try{ 
			rs=st.executeQuery("select nom_medecin,prenom_medecin from medecin where id_medecin='"+id_med+"'");
			while(rs.next()){
				 nom=rs.getString(1);
				prenom=rs.getString(2);
			}
			
			
		}
    catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
	    
	     
		
		
		return nom+" "+prenom;
	}
		
	
	public String nomrecup(int idpatient){
		String nom=null;
		String prenom=null;
		try{ 
			rs=st.executeQuery("select prenom_patient,nom_patient from patient where id_patient='"+idpatient+"'");
			while(rs.next()){
				prenom=rs.getString(1);
				 nom = rs.getString(2);
			}
			
			
		}
    catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
	     try{ rs.close();st.close();con.close();} catch(Exception d){}
	 
	     
	     return prenom+"  "+nom;
	}
		
	
	/**public String prenomrecup(int idpatient){
		String prenom=null;
		try{ 
			rs=st.executeQuery("select prenom_patient from patient where id_patient='"+idpatient+"'");
			while(rs.next()){
				 prenom = rs.getString(1);
			}
			
			
		}
    catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
	    
	 
	     
	     return prenom;
	}
	**/	
		
	
	public int inserercons(int id ,int poids , int tension ,int temperature ,String resultat,String date){
		
		try{

			u=st.executeUpdate("insert into consultation values(null,'"+id+"','"+poids+"','"+tension+"','"+temperature+"','"+resultat+"','"+date+"' )");

		}
		catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
		try { rs.close ( ) ;}catch (Exception d) {}
		return u;
	}
			
	
	public static void main (String[]args){
		FormulaireCertificat fc= new FormulaireCertificat();
		fc.nomrecup(8);
	}
	
public int inserermedoc(String nom ,String posologie){
		
		try{

			u=st.executeUpdate("insert into medicament values('"+nom+"','"+posologie+"')");

		}
		catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
		try { rs.close ( ) ;}catch (Exception d) {}
		return u;
	}
			
public String[] modifiermedoc(String id){
	String[] dat=new String[2];
	int i=0;
	try{     
		//JCheckBox jc= new JCheckBox()
		rs=st.executeQuery("select * from medicament where nom_medicament='"+id+"'");
		while(rs.next()){
			
			dat[0] =rs.getString(1);
			dat[1] =rs.getString(2);
			
			

		}
	}
	catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
	try{ rs.close();st.close();con.close();} catch(Exception d){}
	//System.out.println("bien recu "+dat[0]+" "+dat[1]+" "+dat[2]);
	return dat; 
}

public int updateMedoc(String nom, String posologie){
	
	try{

		u=st.executeUpdate( "UPDATE medicament SET  nom_medicament = '"+nom+"',posologie =  '"+posologie+"'");

	}
	catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
	try { rs.close ( ) ;}catch (Exception d) {}
	return u;
}
public int insererordonnance(int id_cons, String date,String recommandation){
	
	try{

		u=st.executeUpdate( "insert into ordonnance values(null,'"+id_cons+"','"+date+"','"+recommandation+"' )");

	}
	catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
	try { rs.close ( ) ;}catch (Exception d) {}
	return u;
}


public int insererordonner(int id_ordonnance, String nom_medicament){
	
	try{

		u=st.executeUpdate( "insert into ordonner values('"+id_ordonnance+"','"+nom_medicament+"')");

	}
	catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
	try { rs.close () ;}catch (Exception d) {}
	return u;
}





}
