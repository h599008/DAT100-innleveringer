package no.hvl.dat100;
import static javax.swing.JOptionPane.*;


public class Oppgave2 {

	public static void main(String[] args) {
		/** O2 */
		
		for (int i = 0; i < 10;) {
			String input = showInputDialog("Skriv inn poengsum: ");
			int poengsum = Integer.parseInt(input);
			
			if (poengsum >= 90 && poengsum <= 100 ) {
				System.out.println("Karakter: A");
				// Legger kun til 'i' hvis input er korrekt.
				i++;
			} else if (poengsum >= 80 && poengsum < 90) {
				System.out.println("Karakter: B");
				i++;
			} else if (poengsum >= 60 && poengsum < 80) {
				System.out.println("Karakter: C");
				i++;
			} else if (poengsum >= 50  && poengsum < 60) {
				System.out.println("Karakter: D");
				i++;
			} else if (poengsum >= 40 && poengsum < 50) {
				System.out.println("Karakter: E");
				i++;
			} else if (poengsum >= 0 && poengsum < 40) {
				System.out.println("Karakter: F");
				i++;
			} else if (poengsum > 100 || poengsum < 0) {
				// Legger ikke til 'i' fordi poengsum er ugyldig.
				System.out.println("Ugyldig poengsum... Skriv inn på nytt");
			}
		}

	}

}
