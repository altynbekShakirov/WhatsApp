package service.impl;

import classes.Passport;
import classes.Person;
import enums.Country;
import enums.Gender;
import service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonImpl implements PersonService  {
    private  List<Passport>passports=new ArrayList<>();
    @Override
    public void getPassport(  List<Passport>passports) {
        System.out.println("Full out a from");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        int id= scanner.nextInt();
        System.out.println("Last name: ");
        String lastName= scanner.next();
        System.out.println("First name: ");
        String firstName= scanner.next();
        System.out.println("Birthday(yyy-mm-dd)");
        LocalDate localDate= LocalDate.parse(scanner.next());
        System.out.println("Place of birth: ");
        Country country=Country.valueOf(scanner.next().toUpperCase().trim());
        System.out.println("Gender: ");
        String gender=scanner.next();
        Gender gen=Gender.valueOf(gender.toUpperCase().trim());
        passports.add(new Passport(id,lastName,firstName,localDate,country,gen));


        System.out.println("USPESHNO POLUCHILI PASSPORT");



    }

    @Override
    public void allPeoplePassports(Map<Person, Passport> personPassportMap) {

    }

    @Override
    public void getAllCountry() {
        Country[] country= Country.values();
        for (Country v:country) {
            System.out.println(v);

        }


    }

    @Override
    public void getAllGender() {


        Gender male=Gender.MALE;
        Gender female=Gender.FEMALE;
        System.out.println(male);
        System.out.println(female);



    }

    @Override
    public void getPersonByFirstName(List<Person> personList) {

    }
    public void getAllPassword(List<Passport> passports){
        Scanner scanner= new Scanner(System.in);
        System.out.println("First name:");
        String firstName = scanner.nextLine();
        for (Passport passport:passports) {
            if(firstName.equals(passport.getFirstName())){
                System.out.println(passport);
            }
        }

    }

    public List<Passport> getPassports() {
        return passports;
    }

    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }
}
