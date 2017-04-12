package controleur;

import java.awt.*;
import javax.swing.*;
import java.util.regex.*;

public class Controleur {
   
	protected static boolean isInt(String val){
		try{
			Integer.parseInt(val);
			return true;
		}
		catch(Exception exc){
			return false;
		}
	}

	public static boolean isDouble(String val){
		try{
			Double.parseDouble(val);
			return true;
		}
		catch(Exception exc){
			return false;
		}
	}

	public static boolean isTelephone(String val){
		return Pattern.matches("^([\\+(00)]221[-./ ]?)?[37][03678][-./ ]?[0-9]{3}[-./ ]?[0-9]{2}[-./ ]?[0-9]{2}$", val);
	}

	protected static boolean isEmail(String val){
		return Pattern.matches("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$", val);
	}

	public static boolean isOk(JTextField jtf){
		System.out.println("isOk : " + jtf);
		String name = jtf.getName();
		if(name != null){
			String[] parts = name.split("_"); // Ex: STR_OB_Prénom

			if((parts[1].compareToIgnoreCase("OB") == 0) && jtf.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Le champ \"" + parts[2] + "\" est obligatoire", "Erreur", JOptionPane.ERROR_MESSAGE);
				jtf.requestFocus();
				return false;
			}

			if(!jtf.getText().isEmpty()){
				String val = jtf.getText();
				if(parts[0].compareToIgnoreCase("INT") == 0){
					if(!isInt(val)){
						JOptionPane.showMessageDialog(null, "Le champ \"" + parts[2] + "\" doit avoir une valeur entière", "Erreur", JOptionPane.ERROR_MESSAGE);
						jtf.requestFocus();
						return false;
					}
				}
				else
					if(parts[0].compareToIgnoreCase("DBL") == 0){
						if(!isDouble(val)){
							JOptionPane.showMessageDialog(null, "Le champ \"" + parts[2] + "\" doit avoir une valeur réelle", "Erreur", JOptionPane.ERROR_MESSAGE);
							jtf.requestFocus();
							return false;
						}
					}
					else
						if(parts[0].compareToIgnoreCase("TEL") == 0){
							if(!isTelephone(val)){
								JOptionPane.showMessageDialog(null, "Le champ \"" + parts[2] + "\" doit avoir un numéro de téléphone", "Erreur", JOptionPane.ERROR_MESSAGE);
								jtf.requestFocus();
								return false;
							}
						}
						else
							if(parts[0].compareToIgnoreCase("EMAIL") == 0){
								if(!isEmail(val)){
									JOptionPane.showMessageDialog(null, "Le champ \"" + parts[2] + "\" doit avoir un e-mail", "Erreur", JOptionPane.ERROR_MESSAGE);
									jtf.requestFocus();
									return false;
								}
							}
			}
		}

		return true;
	}

	public static boolean isAllOk(Container cont){
		System.out.println("isAllOk : " + cont);
		try{
			if(cont == null)
				return true;

			for(Component comp : cont.getComponents()){
					if(JTextField.class.isInstance(comp)){
						JTextField jtf = (JTextField)comp;
						if(!isOk(jtf))
							return false;
					}
					else 
						if(JList.class.isInstance(comp)){

						}
						else
							if(JComboBox.class.isInstance(comp)){

							}
							else
								if(Container.class.isInstance(comp)){
									if(!isAllOk((Container)comp))
										return false;
								}
			}

			return true;
		}
		catch(Exception exc){
			JOptionPane.showMessageDialog(null, "Une exception a été rencontrée lors du contrôl.\n" + exc.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

}
