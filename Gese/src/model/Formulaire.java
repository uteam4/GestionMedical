package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;



public class Formulaire {

	static Connection con;
	static Statement st;
	ResultSet  rs;
	int u,u1;
	private String[][] data;

	public Formulaire(){

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

	public int inserer(String date,int numerofiche,String sexe, String cin,String prenom,String nom,String adresse,String profession, int age,int tel){
		Login log= new Login();
		log.remplacer();
		System.out.println(log.getId_secretaire());
		int id_sec=log.getId_secretaire();
		try{

			u=st.executeUpdate( "insert into patient values('"+numerofiche+"','"+id_sec+"','"+nom+"','"+prenom+"','"+age+"','"+cin+"','"+adresse+"','"+profession+"','"+date+"','"+sexe+"','"+tel+"' )");

		}
		catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
		try { rs.close ( ) ;}catch (Exception d) {}
		return u;
	}	


	public Object[][] recuperation(){
		Object[][] dat=new Object[8][10];
		int i=0;
		try{     
			//JCheckBox jc= new JCheckBox();
			rs=st.executeQuery("select * from patient order by id_patient desc");
			while(rs.next()){
				dat[i][0] =rs.getInt(1);
				dat[i][1] =rs.getString(3);
				dat[i][2] =rs.getString(4);
				dat[i][3] =rs.getInt(5);
				dat[i][4] =rs.getString(6);
				dat[i][5] =rs.getString(7);
				dat[i][6] =rs.getString(8);
				dat[i][7] =rs.getString(9);
				dat[i][8] =rs.getString(10);
				dat[i][9] =rs.getInt(11);
				i++;

				// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
			}

		}
		catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
		try{ rs.close();st.close();con.close();} catch(Exception d){}
		return dat; 


	}

	public String[] modifier(int id){
		String[] dat=new String[10];
		int i=0;
		try{     
			//JCheckBox jc= new JCheckBox();
			rs=st.executeQuery("select * from patient where id_patient='"+id+"'");
			while(rs.next()){
				dat[0] =""+rs.getInt(1);
				dat[1] =rs.getString(3);
				dat[2] =rs.getString(4);
				dat[3] =""+rs.getInt(5);
				dat[4] =rs.getString(6);
				dat[5] =rs.getString(7);
				dat[6] =rs.getString(8);
				dat[7] =rs.getString(9);
				dat[8] =rs.getString(10);
				dat[9] =""+rs.getInt(11);
				i++;


			}
		}
		catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
		try{ rs.close();st.close();con.close();} catch(Exception d){}
		return dat; 
	}

	public int update(String date,String sexe, String cin,String prenom,String nom,String adresse,String profession, int age,int tel,int id){
		Login log= new Login();
		log.remplacer();
		System.out.println(log.getId_secretaire());
		int id_sec=log.getId_secretaire();
		try{

			u1=st.executeUpdate( "UPDATE  patient SET  nom_patient = '"+nom+"',prenom_patient =  '"+prenom+"',age_patient = '"+age+"',cin =  '"+cin+"',adresse =  '"+adresse+"',profession =  '"+profession+"',datedecraetion =  '"+date+"',tel='"+tel+"' WHERE id_patient ='"+id+"';");

		}
		catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
		try { rs.close ( ) ;}catch (Exception d) {}
		return u1;
	}	


	public int supprimer(int id){
		try{     
			//JCheckBox jc= new JCheckBox();
			int r= st.executeUpdate("delete from patient where id_patient='"+id+"'");
			if(r>0) JOptionPane.showMessageDialog(null,"patient supprimé");
			else JOptionPane.showMessageDialog(null,"erreur de suppression");


		}catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
		try{ rs.close();st.close();con.close();} catch(Exception d){}
		return id;

	}

	public int   id_fiche(){


		int a=0;
		try{     
			//JCheckBox jc= new JCheckBox();
			rs=st.executeQuery("select count(*) as total from patient");
			while(rs.next()){
				a=rs.getInt("total");
				System.out.println(a);

			} 

		}
		catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
		try{ rs.close();st.close();con.close();} catch(Exception d){}
		return a;		 

	}

	public int search(String txt, JTable tableau, int indexChamp){
		TableModel model = tableau.getModel();
		Object[][] tuples = new Object[model.getRowCount()][model.getColumnCount()];
		for(int i=0; i < tuples.length; i++)
			for(int j=0; j < tuples[i].length; j++)
				tuples[i][j] = model.getValueAt(i, j);
		
		return search(txt, tuples, indexChamp);
	}
	
	public int search(String txt, Object[][] tuples, int indexChamp){
		for(int i=0; i < tuples.length; i++)
			if(search(txt, tuples[i], indexChamp))
				return i;
		return -1;
	}

	public boolean search(String txt, Object[] tuple, int indexChamp){
		try{
			String val = (String) tuple[indexChamp];
			return (val.compareToIgnoreCase(txt) == 0);
		}	
		catch (Exception e){
			return false;
		}
		
		
		
		
	}

	

	public static void main(String[]args){
		Formulaire form= new Formulaire();
		//form.recherchertableau(100);
	}



}
