import classes.Contact;
import classes.Passport;
import classes.Person;
import classes.WhatsApp;
import enums.Status;
import service.impl.PersonImpl;
import service.impl.WhatsAppImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Passport> passports = new ArrayList<>();
    private static WhatsAppImpl whatsApp = new WhatsAppImpl();
    private static PersonImpl person = new PersonImpl();
    private static List<WhatsApp>whatsAppsList= new ArrayList<>();
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        commands();


    }

    public static void commands() {
        PersonImpl person = new PersonImpl();
        Person person1 = new Person();
        WhatsAppImpl whatsApp = new WhatsAppImpl();
        WhatsApp whatsApp2= new WhatsApp();
        shablon();
        while (true) {
            comannds();

            switch (new Scanner(System.in).nextInt()) {
                case 0:
                    break;
                case 1:
                    passports.forEach(System.out::println);
                    break;
                case 2:
                    person.getAllPassword(passports);
                    break;
                case 3:
                   whatsApp.getAllWatsApp(whatsAppsList);

                    break;
                case 4:
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("password jazynyz: ");
                    String password = scanner.nextLine();
                    for (WhatsApp whatsApp1:whatsAppsList) {
                        if(password.equals(whatsApp1.getPassword())){
                            System.out.println(whatsApp1);

                        }
                        else {
                            System.out.println("Mynday Password jok");
                        }
                    }
                    break;
                case 5:
                    person.getAllCountry();
                    break;
                case 6:
                    LinkedList<Status> statuses = new LinkedList<>();
                    whatsApp.changeStatus(statuses);
                    break;
                case 7:
                    person.getPassport(passports);
                    break;
                case 8:
                    whatsApp.whatsAppAccount(passports,whatsAppsList);
                    break;
                case 10:

                    whatsApp.addContact(contacts, whatsAppsList);
                case 11:
                    whatsApp.getMessage(whatsAppsList,whatsApp2);
                    break;
                case 12:
                    Status[]statuses1=Status.values();
                    for (Status status : statuses1) {
                        System.out.println(status)   ;

                    }

                    break;



            }


        }

    }

    public static void shablon() {
        System.out.println("""
                                
                .
                ──▄▄█▀▀▀▀▀█▄▄──
                ▄█▀░░▄▄░░░░░▀█▄
                █░░░███░░░░░░░█
                █░░░██▄░░░░░░░█
                █░░░░▀██▄░██░░█
                █░░░░░░▀███▀░░█
                ▀█▄░░░░░░░░░▄█▀
                ─▄█░░░▄▄▄▄█▀▀──
                ─█░░▄█▀────────
                ─▀▀▀▀──────────
                """);
    }

    public static void comannds() {
        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~~~ * COMMANDS * ~~~~~~~~~~~~~~~~~~~~~~
                                1. Get all passport
                                2. get passport by first name
                                3. Get all WhatsApp
                                4. Go to profile
                                5. Get all country
                                6. Get WhatsApp status
                                7. Create a passport
                                8. Install WhatsApp
                                9. Change status
                                10. Add contact
                                11. Send a message
                                12. See status
                               
                """);
        System.out.println("Write command");
    }
}