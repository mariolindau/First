import java.util.ArrayList;
import java.util.List;

public class MainArray {
    public static void main(String[] args) {
        // Defineeri dünaamiline sõnade list (Linnad)
      List<String> cities = new ArrayList<>(List.of("Tallinn", "Riia", "Vilnius"));
      System.out.println(cities); // Näita massiivi sisu

        // Lisa kaks uut linna
        cities.add("Pärnu");
        cities.add("Narva");
        System.out.println(cities); // (Tallinn, Riia, Vilnius, Pärnu, Narva;)

        // Võta Vilnius listist
        System.out.println(cities.get(2));

        // Muuda Riia Ainaži'ks
        cities.set(1, "Ainaži");
        System.out.println(cities); // (Tallinn, Ainaži, Vilnius, Pärnu, Narva)

        // Lisa Pärnu ja Narva vahele Kehtna
        cities.add(4, "Kehtna");
        System.out.println(cities); // (Tallinn, Ainaži, Vilnius, Pärnu, Kehtna, Narva)

        // Lisa mitu kohta Pä
        cities.addAll(4, List.of("Märjamaa", "Tori", "Tootsi", "Tallinn"));
        System.out.println(cities); // (Tallinn, Ainaži, Vilnius, Pärnu, Märjamaa, Tori, Tootsi, Tallinn, Narva)

        //Eemalda Tallinn
        cities.remove("Tallinn"); // Ainult esimene leitud nimi eemdaldatakse
        System.out.println(cities); // (Ainaži, Vilnius, Pärnu, Märjamaa, Tori, Tootsi, Tallinn, Narva)
        //TODO Eemalda teine Tallinn indexi põhjal
        cities.remove(6);
        System.out.println(cities); // (Ainaži, Vilnius, Pärnu, Märjamaa, Tori, Tootsi, Narva)

        // Mitu elementi on listis?
        System.out.println("Listi suurus: " + cities.size());

        // TODO Väljasta neljanda koha teine täht, TRÜKITÄHENA
        System.out.println(cities.get(3).substring(1, 2).toUpperCase());
    }
}
