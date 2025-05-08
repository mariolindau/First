import models.Human;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NameReadPerson {
    static String filename = "Persons.csv";
    static List<Human> humans = new ArrayList<>();

    public static void main(String[] args) {
        readFileContents();
        System.out.println("Humans listi suurus: " + humans.size());
        // TODO Väljasta listist humans kõik isikud kes on sündinud 1990 - 1992 esimesel poolaastal
        List<Human> taskList = new ArrayList<>(); // Vajalikud isikud
        for (Human h : humans) {
            if((h.getBirthday().getYear() >= 1990 && h.getBirthday().getYear() <= 1992)
                && h.getBirthday().getMonthValue() <= 6) {
                taskList.add(h);
            }
        }

        taskList.sort((Comparator.comparing(Human::getBirthday))); // Sorteeri a->z
        // Väljasta tulemus nagu toString() seda teeb
        for (Human h : taskList) {
            System.out.println(h);
        }
        System.out.println("Kokku: " + taskList.size());
    }

    private static void readFileContents() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int lineCount = 0;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // 31.12.1999

            for (String line; (line = br.readLine()) != null; ) {
                if (lineCount > 0) {
                    String[] lineParts = line.split(";"); // tükeldab rea semikoolonist
                    LocalDate date = LocalDate.parse(lineParts[2], formatter);
                    //System.out.println(lineParts[2] + " " + date); // TEST töötab => 31.12.1999 1999-12-31
                    humans.add(new Human(lineParts[0], lineParts[1], date, lineParts[3], lineParts[4]));

                }
                lineCount++; // Suurenda ridade loendurit
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}