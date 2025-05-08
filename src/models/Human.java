package models;

import java.time.LocalDate;

public class Human {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String gender;
    private String personalcode;

    public Human(String firstname, String lastname, LocalDate birthday, String gender, String personalcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.gender = gender;
        this.personalcode = personalcode;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getPersonalcode() {
        return personalcode;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", personalcode='" + personalcode + '\'' +
                '}';
    }
}

