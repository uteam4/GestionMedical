package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormulaireMedicament {
	

	
	
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

			public FormulaireMedicament(){
				
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
			
			public Object[][] recupMedicament(){
				Object[][] dat=new Object[20][2];
				int i=0;
				try{     
					//JCheckBox jc= new JCheckBox();
					       rs=st.executeQuery("select * from medicament");
								 while(rs.next()){
									 dat[i][0] =rs.getString(1);
									 dat[i][1] =rs.getString(2);
									 
									 
								 i++;
							
			    	// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
									}
					 }
					       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
						     try{ rs.close();st.close();con.close();} catch(Exception d){}
							return dat; 
						     
			}  
			
			public Object[] recupMedicamentbase(){
				Object[] dat=new Object[10][2];
				int i=0;
				try{     
					//JCheckBox jc= new JCheckBox();
					       rs=st.executeQuery("select * from medicament");
								 while(rs.next()){
									 dat[0] =rs.getString(1);
									 dat[1] =rs.getString(2);
									 
									 
								 i++;
							
			    	// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
									}
					 }
					       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
						     try{ rs.close();st.close();con.close();} catch(Exception d){}
							return dat; 
						     
			}  
			
			public int recupidcons(int patient){
		
				int i=0;
				int a=0;
				try{     
				
					       rs=st.executeQuery("select id_rv from rv where id_patient='"+patient+"'");
								 while(rs.next()){
									i=rs.getInt("id_rv");
									}
								  rs=st.executeQuery("select id_consultation from consultation where id_rv='"+i+"'");
									 while(rs.next()){
										a=rs.getInt("id_consultation");
										} 
					 }
					       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
						     try{ rs.close();st.close();con.close();} catch(Exception d){}
							return a; 
						     
			}  
			
			
			public int recupordonner(){
				
				int i=0;
				try{     
					//JCheckBox jc= new JCheckBox();
					       rs=st.executeQuery("select max(id_ordonnance) from ordonnance");
								 while(rs.next()){
									 i=rs.getInt(1);
									
			   
									}
					 }
					       catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
						     try{ rs.close();st.close();con.close();} catch(Exception d){}
							return i; 
						     
			}  
		public static void main(String [] args){
			FormulaireMedicament fm=new FormulaireMedicament();
			int a=fm.recupordonner();
			System.out.println(a);
			FormulaireCertificat fc= new FormulaireCertificat();
			int f=fc.insererordonner(a, "Diane 35");
			System.out.println(f);
		}
			
			
}
