import models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainArrayObj {
    public static void main(String[] args) {
        // Loome kaks isiku objekti. Esimene oled ise ja teine on praegune president :)

        Person mario = new Person("Mario", "Lindau", 36);
        Person president = new Person("Alar", "Karis", 67);

        // Mis on mario vanus ja presidendi eesnimi
        System.out.println(mario.getAge()); // Mario vanus
        System.out.println(president.getFirstName()); // Presidendi eesnimi

        // Väljasta kahe objekti vanuste vahe
        System.out.println("Vanuse vahe: " + (president.getAge() - mario.getAge()));

        // TODO Väljasta objekt preseident
        System.out.println(president);

        // Mitme isiku List
        List<Person> persons = new ArrayList<>(); // Tühi isikute list
        persons.add(mario); // Eelnevalt loodud isiku lisamine listi
        persons.add(president); // Eelnevalt loodud isiku lisamine listi
        // TODO Lisage listi persons president Lennart-Georg Meri, vanusega 77
        persons.add(new Person("Lennart-Georg", "Meri", 77));
        System.out.println(persons); // Mario Lindau 36, Alar Karis 67, Lennart-Georg Meri 77
        // Sorteerime listi perenime järgi
        persons.sort((Comparator.comparing(Person::getLastName))); //a->z
        System.out.println(persons); // [Alar Karis 67, Mario Lindau 36, Lennart-Georg Meri 77]
        persons.sort((Comparator.comparing(Person::getLastName).reversed())); // Tagurpidi sorteerimine z->a
        System.out.println(persons); // [Lennart-Georg Meri 77, Mario Lindau 36, Alar Karis 67]

        // TODO Väljasta persons list koos järjekorra numbriga, Iga isik eraldi real
        // 1. Lennart-Georg Meri 77
        // 2. Mario Lindau 36
        showPersons(persons);

    }

    /**
     * Näita isikute listi
     * @param persons Kaasa isikute list
     */
    private static void showPersons(List<Person> persons) {
        int nr = 1;
        for(Person p : persons) {
            System.out.printf("%d. %s\n", nr, p);
            //System.out.printf("%d. %s\n", nr, p);
            nr++;
        }
    }
}
