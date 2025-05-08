import java.io.*;

public class MainReadCSV {
    /**
     * Loetakse failist esimene rida, et tuvastada mitu veergu on.
     * Küsitakse kasutajalt mitmendat veergu kokku liita (inimlik)
     * Väljastatakse soovitud veeru summa
     */

    static String filename = "Create-MyCSV-s.csv";

    public static void main(String[] args) {
        String firstLine = readOnlyFirstLine();
        int lineParts = firstLine.split(";").length; // kas 10 või 15 meie failides
        int colNumber = askColumnNumber(lineParts);
        if (colNumber != 0) {
            sumColumn(colNumber);
        }
    }

    private static String readOnlyFirstLine() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int askColumnNumber(int max) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Sisesta veeru number [1 - %d]: ", max);
        try {
            int colNumber = Integer.parseInt(br.readLine());
            if (colNumber >= 0 && colNumber <= max) {
                return colNumber;
            } else {
                System.out.println("Vigane veeru number. ");
                askColumnNumber(max); // Käivitame sama meetodi uuesti
            }

        } catch (IOException e){
            throw new RuntimeException(e);
        }
        return 1; // See tähendab "Viga", sest pole tegelikku numbrit teada
    }

    private static void sumColumn(int colNumber) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int total = 0;

            for(String line; (line = br.readLine()) != null;) {
                String[] lineParts = line.split(";");
                int fileCol = colNumber - 1;
                if (isInteger(lineParts[fileCol])) {
                    total += Integer.parseInt(lineParts[fileCol]);
                }
            }
            System.out.printf("Veeru summa on: %d\n", total);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isInteger(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
