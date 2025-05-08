import java.util.Scanner;

public class MainAsk {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // askString();
        askNumber(true);
        askNumber(false);
    }

    private static void askString() {
        System.out.println("Sisesta tekst: ");
        String text = scanner.nextLine();
        System.out.println("Sa kirjutasid: " + text);
    }

    private static void askNumber(boolean bool) {
        if (bool) {
            System.out.print("Sisesta täisarv: ");
            int x = scanner.nextInt(); // Ainult täisarv on lubatud
            System.out.println("Sa kirjutasid: " + x);
        } else {
            System.out.print("Sisesta murdarv: ");
            double x = scanner.nextDouble();
            System.out.println("Sa kirjutasid: " + x);
        }
    }
}
