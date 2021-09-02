package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {
		/** O1*/
		
		String user_input = showInputDialog("Skriv inn bruttolønn: ");
		double brutto = Double.parseDouble(user_input);
		
		if (brutto < 164101) {
			System.out.println("Skattetrekk er ingenting.");
		} else if (brutto > 164100 && brutto < 230951 ) {
			System.out.println("Skattetrekk er: " + brutto * 0.0093);
		} else if (brutto > 230950 && brutto < 580651 ) {
			System.out.println("Skattetrekk er: " + brutto * 0.0241);
		} else if (brutto > 580650 && brutto < 934051 ) {
			System.out.println("Skattetrekk er: " + brutto * 0.093);
		} else {
			System.out.println("Skattetrekk er: " + brutto * 0.1452);
		}

	}

}
