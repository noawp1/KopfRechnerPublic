import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Mit diesem Programm kann man das Kopfrechnen erlernen. Es werden zufällig generierte Zahlen
 * verwendet, welche man mit verschiedenen Rechenoperatoren ausrechnen kann.
 * @author noawp
 * @version 2024-02-15
 */

public class KopfRechner {
    public static void main(String[] args) {

        double ergebnis;
        double ergebnis1;


        ergebnis = 0;
        ergebnis1 = 0;

        String operation = JOptionPane.showInputDialog(null, "Rechenoperation: ", "Kopfrechner", JOptionPane.INFORMATION_MESSAGE);
        String komma = JOptionPane.showInputDialog(null, "Mit Kommazahlen?: (Ja/Nein)", "Kopfrechner", JOptionPane.INFORMATION_MESSAGE);
        Random random = new Random();


        if(komma.equalsIgnoreCase("Nein")) {
            int zahl1 = random.nextInt(100);
            int zahl2 = random.nextInt(100);
            if(operation.equalsIgnoreCase("+")) {
                ergebnis = zahl1 + zahl2;
            }
            if(operation.equalsIgnoreCase("-")) {
                ergebnis = zahl1 - zahl2;
            }
            if(operation.equalsIgnoreCase("*")) {
                ergebnis = zahl1 * zahl2;
            }
            if(operation.equalsIgnoreCase("/")) {
                ergebnis = zahl1 / zahl2;
            }
            if(operation.equalsIgnoreCase("%")) {
                ergebnis = zahl1 % zahl2;
            }
            JOptionPane.showMessageDialog(null, "Berechne " + zahl1 + operation + zahl2 , "Kopfrechner", JOptionPane.INFORMATION_MESSAGE);
            ergebnis1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Gebe die Lösung ein: ",  "Kopfrechner", JOptionPane.INFORMATION_MESSAGE));

        }

        if(komma.equalsIgnoreCase("Ja")) {
            double zahl1 = random.nextDouble(100);
            double zahl2 = random.nextDouble(100);
            if(operation.equalsIgnoreCase("+")) {
                ergebnis = zahl1 + zahl2;
            }
            if(operation.equalsIgnoreCase("-")) {
                ergebnis = zahl1 - zahl2;
            }
            if(operation.equalsIgnoreCase("*")) {
                ergebnis = zahl1 * zahl2;
            }
            if(operation.equalsIgnoreCase("/")) {
                ergebnis = zahl1 / zahl2;
            }
            if(operation.equalsIgnoreCase("%")) {
                ergebnis = zahl1 % zahl2;
            }
            JOptionPane.showMessageDialog(null, "Berechne " + zahl1 + operation + zahl2, "Kopfrechner", JOptionPane.INFORMATION_MESSAGE);
            ergebnis1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Gebe die Lösung ein: ",  "Kopfrechner", JOptionPane.INFORMATION_MESSAGE));

        }


        if (ergebnis1 == ergebnis) {
            JOptionPane.showMessageDialog(null, "Richtig!", "Kopfrechner", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Falsch!", "Kopfrechner", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}