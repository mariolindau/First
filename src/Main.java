public class Main {

    static String[] names = {"Marko", "Jaana", "Lible", "Karmen"}; // Nimede massiiv

    public static void main(String[] args) {
        System.out.println("Tere maailm!");

        String name = "Mario"; // String ehk sõna
        int age = 36; // Täisarv (primitiivne)
        double height = 1.76; // murdarv (primitiivne)
        System.out.println(name + " on " + age + " aastat vana ja " + height + " pikk.");
        System.out.println(String.format("%s on %d aastat vana ja %.2f pikk.", name, age, height));
        System.out.printf("%s on %d aastat vana ja %.2f pikk.%n", name, age, height);

        // Primitiivsed massiivid
        int[] ages = {2, 20, 36, 27, 14, 25}; // Täisarvude massiivid ja suurust muuta ei saa
        // TODO Tee uus täisarvude massiiv kolme elemendiga ja väljasta peale vanuseid need ühel real
        int[] years = {2000, 2023, 1989};
        System.out.println(ages[2]); // 36
        showIntegers(ages);
        showIntegers(years);
        years[0] = 1999;
        showIntegers(years); // Näita muudetud massiivi sisu
        showStrings(names);
        // TODO Defineeri kolme linna massiiv kolme linnaga. Väljasta linnad ühel real. Kohanda showStrings() meetodit
        String[] cities = {"Tallinn", "Tartu", "Pärnu"};
        showStrings(cities);
    }

    private static void showIntegers(int[] values) {
        for(int x : values) {
            System.out.print(x + " "); // Ühele reale väljastus
        }
        System.out.println(); // Reavahetus
    }
    //TODO Nimede väljastamine ühele reale
    private static void showStrings(String[] values) {
        for(int x= 0; x < values.length; x++) {
            System.out.print(values[x] + " "); //Ühele reale
        }
        System.out.println();
    }
}
