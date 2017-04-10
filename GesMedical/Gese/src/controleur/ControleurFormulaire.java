package controleur;

import java.util.regex.Pattern;

public class ControleurFormulaire {
	
	
	public static boolean isInt(String val){
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

}
