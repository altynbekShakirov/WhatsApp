package service;

import classes.Passport;
import classes.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface PersonService {
    void getPassport(  List<Passport>passports);
    void allPeoplePassports(Map<Person,Passport>personPassportMap);
    void getAllCountry();
    void getAllGender();


    void getPersonByFirstName(List<Person>personList);
}
