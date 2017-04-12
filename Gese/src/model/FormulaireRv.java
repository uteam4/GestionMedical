package model;



	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

	import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;



	public class FormulaireRv {

		static Connection con;
		static Statement st;
		ResultSet  rs;
		int u,u1;
		private String[][] data;

		public FormulaireRv(){

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
		public int insererRv(String date ,String heure  , int idpatient ,int id_sec ,int idmed){
			
			try{

				u=st.executeUpdate("insert into rv values(null,'"+date+"','"+heure+"','"+idpatient+"','"+id_sec+"','"+idmed+"')");

			}
			catch (Exception e){System.out.println("Erreur Resultatset11"+e.getMessage());}
			try { rs.close ( ) ;}catch (Exception d) {}
			return u;
		}
		
		public Object[][] recuperation(){
			Object[][] dat=new Object[20][10];
			int i=0;
			try{     
				//JCheckBox jc= new JCheckBox();
				rs=st.executeQuery("select * from rv order by id_rv desc");
				while(rs.next()){
					dat[i][0] =rs.getInt(1);
					dat[i][1] =rs.getString(2);
					dat[i][2] =rs.getString(3);
					dat[i][3] =rs.getInt(4);
					dat[i][4] =rs.getInt(5);
					dat[i][5] =rs.getInt(6);
					
					i++;

					// liste2.add(" "+rs.getObject(1)+" "+rs.getObject(2));
				}

			}
			catch (Exception e){System.out.println("Erreur Resultatset"+e.getMessage()); }
			try{ rs.close();st.close();con.close();} catch(Exception d){}
			return dat; 


		}
		
}
