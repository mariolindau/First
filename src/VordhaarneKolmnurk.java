import java.util.Random;
import java.util.Scanner;

public class VordhaarneKolmnurk {
    private double alus;
    private double korgus;

    public VordhaarneKolmnurk(double alus, double korgus) {
        this.alus = alus;
        this.korgus = korgus;
    }

    public double arvutaPindala() {
        return (alus * korgus) / 2;
    }

    public double arvutaKuljePikkus() {
        return Math.sqrt(Math.pow(alus / 2, 2) + Math.pow(korgus, 2));
    }

    public double arvutaUmbermoot() {
        return alus + 2 * arvutaKuljePikkus();
    }

    public static double genereeriKolmekohalineMurdarv() {
        Random rand = new Random();
        return rand.nextInt(1000000) / 1000.0; // nt 123.456
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta kolmnurga alus (murdarv): ");
        double alus = scanner.nextDouble();

        double korgus = genereeriKolmekohalineMurdarv();

        VordhaarneKolmnurk kolmnurk = new VordhaarneKolmnurk(alus, korgus);

        double pindala = kolmnurk.arvutaPindala();
        double umbermoot = kolmnurk.arvutaUmbermoot();

        System.out.println("Kujundi võrdhaarne kolmnurk alusega " + alus + " ja kõrgusega " + korgus +
                " on pindala " + pindala + " ja ümbermõõt " + umbermoot + ".");
    }
}

