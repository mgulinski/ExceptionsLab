package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
//    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) throws MandatoryEntryException {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public String extractLastName(String fullName) throws MandatoryEntryException {
	
	String lastName;
	try {
	if ((fullName == null) ||(fullName.length() == 0)) {	    
	    throw new MandatoryEntryException();	
	}
	
        String[] nameParts = fullName.split(" ");
		
        lastName = nameParts[nameParts.length - 1];
	
	if (fullName.contains(",")) {
	    
	    lastName = nameParts[0];	
	}
	
	return lastName;
    }
    } catch {}
    
    
    
    
    

}
