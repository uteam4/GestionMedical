/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

import controleur.ControleurFormulaire;
import model.Formulaire;
import model.Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mamadou
 */
public class FichePatient extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form FichePatient
     */
	
	
    public FichePatient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	 rv = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        datedecreation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        numerofiche = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
       homme = new javax.swing.JRadioButton();
        femme = new javax.swing.JRadioButton();
        bg= new javax.swing.ButtonGroup();
        cin = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        professionliste = new javax.swing.JComboBox<String>();
        datenais = new javax.swing.JTextField();
        numerotel = new javax.swing.JTextField();
        nouveau = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fermer = new javax.swing.JButton();
        rechercher = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menupatient = new javax.swing.JMenu();
        menurv = new javax.swing.JMenu();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La fiche patient");
        setFont(new java.awt.Font("Agency FB", 0, 10)); // NOI18N
        setName("ct"); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 700));
        setResizable(false);
        getContentPane().setLayout(null);
        setBounds(200, 0, 0, 0);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 300));

        datedecreation.setName("STR_0B_datedecreation"); // NOI18N
        datedecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("DATE DE LA CREATION DU FICHE:");

       numerofiche.setName("SRT_OB_fichepatient"); // NOI18N

        jLabel2.setText("NUMERO DU FICHE PATIENT:");

        jLabel3.setText("SEXE:");

        homme.setLabel("Homme");
        homme.setText("Homme");
        homme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        
       femme.setLabel("Femme");
       femme.setText("Femme");
        femme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        bg.add(homme);
        bg.add(femme);
        
        
        cin.setName("STR_OB_cin"); // NOI18N

        prenom.setName("STR_OB_prenom"); // NOI18N
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setText("CIN:");

        jLabel5.setText("PRENOM:");

        jLabel6.setText("NOM:");

        nom.setName("STR_OB_nom"); // NOI18N

        jLabel7.setText("ADRESSE:");

        jLabel8.setText("PROFESSION:");

        jLabel9.setText("AGE:");

        jLabel10.setText("N� TEL:");

        adresse.setName("STR_OB_adresse"); // NOI18N

      professionliste.setName("STR_OB_profession"); // NOI18N

        datenais.setName("DATE_OB_age"); // NOI18N

        numerotel.setName("TEL_FAC_telephone"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(homme)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(femme))
                                .addComponent(numerofiche, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(datedecreation, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(numerotel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nom)
                        .addComponent(adresse)
                        .addComponent(datenais, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(professionliste)))
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datedecreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerofiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homme)
                    .addComponent(femme)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(professionliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(datenais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(numerotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        Formulaire form = new Formulaire();
       int id=form.id_fiche();
        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd" );
        Date currentTime_1 = new Date(); 
      //on cr�e la cha�ne � partir de la date  
      String dateString = formatter.format(currentTime_1); 
      datedecreation.setText(dateString );
      numerofiche.setText(dateString.replace("/", "")+id);
      datedecreation.setEnabled(false);
      numerofiche.setEnabled(false);
      

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 110, 780,260);
       jPanel1.setBorder ( new TitledBorder("INSERTION FICHE"));
        nouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/enregistrer.png"))); // NOI18N
      nouveau.setText("Search");
      nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
{
            	String txt=rechercher.getText();
            	int pos=search(txt, tableau, 4);
            	if (pos<0){
            	 JOptionPane.showMessageDialog(FichePatient.this, "Aucun �l�ment trouv�");
            	 
            	}
            	else{
            		//JOptionPane.showMessageDialog(FichePatient.this, "Position: " + pos);            		
            		tableau.setRowSelectionInterval(pos, pos);
            		tableau.scrollRectToVisible(new java.awt.Rectangle(tableau.getCellRect(pos, 0, true)));
            	}
            	
            	
            /**	datedecreation.setText("");
            	numerofiche.setText("");
            	cin.setText("");
            	prenom.setText("");
            	nom.setText("");
            	adresse.setText("");
            	datenais.setText("");
            	profession.setText("");
            	adresse.setText("");
            	numerotel.setText("");
                **/
            }
        });
        getContentPane().add( nouveau);
        nouveau.setBounds(250, 420, 111, 30);

        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/modifier.png"))); // NOI18N
        modifier.setText("Modifier");
        getContentPane().add(modifier);
        modifier.setBounds(810, 220, 110, 30);
        modifier.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent aevt){
         
		 id_fiche=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrez le numero de fiche du patient"));
		
		Formulaire form= new Formulaire();
		String [] data0=form.modifier(id_fiche);
		
			datedecreation.setText("");
            numerofiche.setText(data0[0]);
        	cin.setText(data0[4]);
        	prenom.setText(data0[2]);
        	nom.setText(data0[1]);
        	adresse.setText(data0[5]);
        	datenais.setText(data0[3]);
        	//professionliste.(data0[6]);
        	
        	numerotel.setText(data0[9]);
        	
        	    }
        });
        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/refres.png"))); // NOI18N
        supprimer.setText("Refresh");
        getContentPane().add(supprimer);
        supprimer.setBounds(810, 270, 110, 30);
            supprimer.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent aevt){
         
		/** id_fiche=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrez le numero de fiche du patient"));
		 Formulaire form =new Formulaire();
		 form.supprimer(id_fiche);**/
			//	jPanel1.repaint();
				 Formulaire form = new Formulaire();
			       int id=form.id_fiche();
			        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd" );
			        Date currentTime_1 = new Date(); 
			      //on cr�e la cha�ne � partir de la date  
			      String dateString = formatter.format(currentTime_1); 
			      datedecreation.setText(dateString );
			      numerofiche.setText(dateString.replace("/", "")+id);
			      datedecreation.setEnabled(false);
			      numerofiche.setEnabled(false);
		
			  }
            });
        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/ajouter.png"))); // NOI18N
        ajouter.setText("Ajouter");
        getContentPane().add(ajouter);
        ajouter.setBounds(810, 120, 110, 30);
        
        ajouter.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent aevt){
				String datecreation=datedecreation.getText();
				String num= numerofiche.getText();
				
				System.out.println(statut);
				String cinrecup=cin.getText();
				String prenomrecup=prenom.getText();
				String nomrecup=nom.getText();
				String adresserecup=adresse.getText();
				String professionrecup=(String) professionliste.getSelectedItem();
				String telephone=numerotel.getText();
				int tel=Integer.parseInt(telephone);
				String age=datenais.getText();
				int agerecup=Integer.parseInt(age);
				String statut=(String) professionliste.getSelectedItem();
				
				ControleurFormulaire conf= new ControleurFormulaire();
				Boolean testnum=conf.isInt(num);
				if(testnum==false){JOptionPane.showMessageDialog(null,"le numero du fiche patient doit etre un nombre");}
				Boolean testage=conf.isInt(age);
				if(testage==false){JOptionPane.showMessageDialog(null,"l'age doit etre un nombre");}
				Boolean testtel=conf.isTelephone(telephone);
				if(testtel==false){JOptionPane.showMessageDialog(null,"il faux revoire votre numero de telephone");}
				
				if(testnum==true&&testage==true&&testtel){
					int numeropatient=Integer.parseInt(num);
					Formulaire form = new Formulaire();
				int u=form.inserer(datecreation, numeropatient, statut, cinrecup, prenomrecup, nomrecup, adresserecup, professionrecup, agerecup, tel);
				if(u>0) JOptionPane.showMessageDialog(null,"insertion reussi");
				else JOptionPane.showMessageDialog(null,"erreur d'insertion");
				data=form.recuperation();

            	datedecreation.setText("");
            	numerofiche.setText("");
            	cin.setText("");
            	prenom.setText("");
            	nom.setText("");
            	adresse.setText("");
            	datenais.setText("");
            	//professionliste.setText("");
            	adresse.setText("");
            	numerotel.setText("");
			
				}
				
				
			
				
				
			    }////////bouton ajouter
                         // TODO Auto-generated method stub
 });	
		

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("GESTION DES PATIENTS");
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel11);
        jLabel11.setBounds(420, 50, 190, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

       
        Formulaire fr=new Formulaire();
		data=fr.recuperation();
		
		 
        String [] titretab={ "N� fiche", "Nom", "Prenom", "Age", "CIN", "Adresse", "Profession", "Date cr�ation",  "Sexe","N� telephone"};
       tableau =new JTable(data,titretab);
        
        jScrollPane1.setViewportView(tableau);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 470, 900, 130);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("LISTE DES PATIENTS");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(420, 370, 200, 40);

        jPanel3.setForeground(new java.awt.Color(153, 204, 0));

        jLabel13.setText("Systeme de gestion medical Team 4 (c) 2017");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(311, 311, 311))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 670, 930, 30);
        professionliste.setModel(new DefaultComboBoxModel<>(new String[] { "Medecin", "Ingenieur", "Etudiant","Professeur" }));
        fermer.setText("Enregistrer");
        fermer.setName("fermer"); // NOI18N
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
            	String datecreation=datedecreation.getText();
    			String num= numerofiche.getText();
    			
    			System.out.println(statut);
    			String cinrecup=cin.getText();
    			String prenomrecup=prenom.getText();
    			String nomrecup=nom.getText();
    			String adresserecup=adresse.getText();
    			String professionrecup=(String) professionliste.getSelectedItem();
    			String telephone=numerotel.getText();
    			int tel=Integer.parseInt(telephone);
    			String age=datenais.getText();
    			int agerecup=Integer.parseInt(age);
    			Formulaire form= new Formulaire();
            int u=form.update(datecreation, statut, cinrecup, prenomrecup, nomrecup, adresserecup, professionrecup, agerecup, tel, id_fiche);
            if(u>0) JOptionPane.showMessageDialog(null,"modification  reussie");
    		else JOptionPane.showMessageDialog(null,"erreur de modification");
    		data=fr.recuperation();
            
            }
        });
        getContentPane().add(fermer);
        fermer.setBounds(810, 320, 110, 30);

       rechercher.setText("Enter le CIN");
       rechercher.setName("entrer cin"); // NOI18N
       getContentPane().add(rechercher);
       rechercher.setBounds(20, 420, 190, 30);
       rechercher.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
            Acceuil a=new Acceuil(); 
             dispose();
             a.setVisible(true);
           }
       });
        ok.setText("fermer");
        ok.setBackground(new java.awt.Color(255, 0, 0));

        ok.setName("ok"); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             
              dispose();
            }
        });
        getContentPane().add(ok);
        ok.setBounds(810, 420, 110,30);

      //  jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));

       // menupatient.setBackground(new java.awt.Color(102, 204, 255));
       // menupatient.setText("");
       // menupatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
       // jMenuBar1.add(menupatient);

       // menurv.setBackground(new java.awt.Color(102, 204, 255));
       // menurv.setText("");
       // menurv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
       // jMenuBar1.add(menurv);
       // setJMenuBar(jMenuBar1);
        rv.setText("Rendez vous");
        getContentPane().add(rv);
        rv.setBounds(683, 423, 110, 30);

        
        
        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           
    

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	statut = "Homme";
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	statut = "Femme";
    }                                             

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    	
    	
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code her
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton  nouveau, modifier, supprimer,ajouter,fermer,ok;
    private javax.swing.JLabel jLabel1, jLabel10,jLabel11,jLabel12,jLabel13,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9;
    private javax.swing.JMenu menupatient,menurv;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1,jPanel2, jPanel3;
    private javax.swing.JRadioButton homme;
    private javax.swing.JRadioButton femme;
    private String statut;
    private ButtonGroup bg;
    private javax.swing.JButton rv;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableau;
    static private Object [][]data;
    int id_fiche;
    private javax.swing.JComboBox<String> professionliste;
    private javax.swing.JTextField datedecreation, rechercher, numerofiche,cin,prenom,nom,adresse,datenais,numerotel;
    // End of variables declaration                   
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

