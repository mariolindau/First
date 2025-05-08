public class MainString {
    static String sentence = "Minu esimesed triibulised (Eduard Vilde)";

    public static void main(String[] args) {
        System.out.println("Lause: '" + sentence + "'");
        System.out.println("Lause pikkus: " + sentence.length() + " märki.");
        System.out.println("Sõnade arv lauses:" + sentence.split(" ").length); //Loeb sulud sõnadesse sisse

        //TODO Väljasta lauses olevad sõnad igaüks eraldi real.
       for (int x = 0; x < sentence.split(" ").length; x++) {
           System.out.println(sentence.split(" ")[x]);
        }

       //väljastame lause tähe kaupa
        for(char c : sentence.toCharArray()) { // {"M", "i", "n", "u", " ",....}
            System.out.println(c + " ");
        }
        System.out.println(); //Reavahetus

        // Lausest osade väljastamine "Minu esimesed triibulised (Eduard Vilde)"
        System.out.println(sentence.substring(0, 4)); //Minu
        System.out.println(sentence.substring( 14)); //triibulised (Eduard Vilde)
        System.out.println(sentence.substring(5, 13)); //Esimesed

        // TODO Väljasta kolmanda sõna pikkus sõltumata sõnade arvust lauses
        // Lühike variant
        System.out.println("Kolmanda sõna pikkus: " + sentence.split(" ")[2].length());
        // Pikk variant
        String[] words = sentence.split(" ");
        int wordCount = words[2].length();
        System.out.println("Kolmanda pikkus: " + wordCount);
        System.out.println("Täishäälikuid on " + countVowels(sentence) + " Tükki.");
        System.out.println(countVowels( "Kas täpitähed on ka sees"));
    }

    private static int countVowels(String word) {
        int count = 0; // Lugeja on algselt 0
        for (int i = 0; i < word.length(); i++) {
            if("aeiouõäöüAEIOUÕÄÖÜ".indexOf(word.charAt(i)) != -1) {
                count++; //leiti, suurenda loendurit ühe võrra
            }
        }
        return count;
    }
}
