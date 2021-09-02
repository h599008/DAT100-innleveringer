package no.hvl.dat100;
import static javax.swing.JOptionPane.*;


public class Oppgave3 {

	public static void main(String[] args) {
		/** O3 */
		
		String user_input = showInputDialog("Skriv inn et heltall: ");
		int number = Integer.parseInt(user_input);
		int fakultet = 1;
		for (int n = 1; n<=number; n++) {
			fakultet=fakultet*n;
		}
		System.out.println("Fakultetet til " + number + " er: " + fakultet);
		
	}

}
