package models;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    /**
     * Isikute mudeli konstruktor
     * @param firstName eesnimi
     * @param lastName perekonnanimi
     * @param age Vanus täisarvuna
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * tagastab eesnime
     * @return eesnimi
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Tagastab perekonnanime
     * @return perekonnanimi
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Tagastab vanuse
     * @return vanus
     */
    public int getAge() {
        return age;
    }

    /**
     * Eesnime muutmine
     * @param firstName Eesnimi sõnena
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Perenimi muutmiseks
     * @param lastName uus perenimi
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Vanus muutmiseks
     * @param age uus vanus
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                '}';

        return String.format("%s %s %d", firstName, lastName, age);
    }
}
