package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Passport {
    private int id;
    private String lastName;
    private String firstName;

    private LocalDate dateOfBirth;
    private Country country;
    private Gender gender;


    public Passport() {
    }

    public Passport(int id, String lastName, String firstName, LocalDate dateOfBirth, Country country, Gender gender) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Password:\n"+
                "id:          " + id +"\n"+
                "lastName:    " + lastName + '\n' +
                "firstName:   " + firstName + '\n' +
                "dateOfBirth: " + dateOfBirth +"\n"+
                "country:     " + country +"\n"+
                "gender:      " + gender+"\n"+
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName;
    }



    public void setFullName(String fullName) {
        this.lastName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    public void exceptionId(){

    }




}
