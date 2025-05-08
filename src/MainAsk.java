import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainAsk {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        askString();
        askNumber(true); // Täisarv
        askNumber(false);// Murdarv
        for (int x = 0; x < 3; x++) {
            String text = askReader(); // tekstiks: tekst; täisarv; murdarv; 3,54.78; 4 543.12
            checkInput(text);
        }
    }

    /**
     * Küsi kasutajalt teksti
     */

    private static void askString() {
        System.out.println("Sisesta tekst: ");
        String text = scanner.nextLine();
        System.out.println("Sa kirjutasid: " + text);
    }

    /**
     * Küsib kasutajalt numbrit
     * @param bool täisarv on true, murdarv on false
     */
    private static void askNumber(boolean bool) {
        if (bool) {
            System.out.print("Sisesta täisarv: ");
            int x = scanner.nextInt(); // Ainult täisarv on lubatud
            System.out.println("Sa kirjutasid: " + x);
        } else {
            // Lokaalne versioon . või , sisestusel
            System.out.print("Sisesta murdarv: ");
            double x = scanner.nextDouble();
            System.out.println("Sa kirjutasid: " + x);
        }
    }

    /**
     * Küsib kasutajalt sisestust
     * @return tagastab kasutaja sisestuse (String)
     */
    private static String askReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Sisesta midagi: ");
            String text = reader.readLine();
            System.out.println("Sa kirjutasid: " + text);
            return text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Kontrollib etteantud sisestust
     * @param input sisestus mida kontrollida
     */
    private static void checkInput(String input) {
        try {
            Integer.parseInt(input);
            System.out.println(input + " on täisarv.");
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(input);
                System.out.println(input + " on murdarv.");
            } catch (NumberFormatException exception) {
                System.out.println(input + " on sõne.");
            }
        }
    }
}
