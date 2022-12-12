package service.impl;

import classes.*;
import enums.Status;
import service.WhatsAppService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WhatsAppImpl implements WhatsAppService {
    @Override
    public void whatsAppAccount(List<Passport>passports,List<WhatsApp>whatsAppList) {
        System.out.println(".\n" +
                "──▄▄█▀▀▀▀▀█▄▄──\n" +
                "▄█▀░░▄▄░░░░░▀█▄\n" +
                "█░░░███░░░░░░░█\n" +
                "█░░░██▄░░░░░░░█\n" +
                "█░░░░▀██▄░██░░█\n" +
                "█░░░░░░▀███▀░░█\n" +
                "▀█▄░░░░░░░░░▄█▀\n" +
                "─▄█░░░▄▄▄▄█▀▀──\n" +
                "─█░░▄█▀────────\n" +
                "─▀▀▀▀──────────\n");
        Scanner scanner= new Scanner(System.in);
                System.out.println("ID: ");
                        int id = scanner.nextInt();
                        System.out.println("Phone number: ");
                        String phoneNumber = scanner.next();
                        System.out.println("Create a password: ");
                        String password = scanner.next();
                        System.out.println("User name: ");
                        String userName = scanner.next();
                        for (Passport passport:passports) {
                            if(id == passport.getId()){
                               whatsAppList.add( new WhatsApp(id, """
                                        \n\n
                                        ⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀ ⣀⣀⣤⣤⣤⣀⡀
                                        ⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀
                                        ⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆
                                        ⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆
                                        ⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆
                                        ⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠸⣼⡿
                                        ⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉
                                        ⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇
                                        ⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇
                                        ⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇
                                        ⠀⠀ ⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠇
                                        ⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇
                                        ⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃
                                        \n\n""",userName,phoneNumber,password));
                                whatsAppList.forEach(System.out::println);
                                Profile profile= new Profile();
                                profile.contactSize(passports);
                                System.out.println("SUCCESSFULLY WHATSAPP ISTALED: ");



                            }
                        }

    }

    @Override
    public void messageSend(String send) {

    }

    @Override
    public String whatsAppTransfer(String transfer) {
        return null;

    }

    @Override
    public void addContact(ArrayList<Contact> addContact, List<WhatsApp> whatsAppsList){

        Scanner scanner =new Scanner(System.in);
        System.out.println("\nWrite your password WhatsApp: ");
        String password= scanner.nextLine();
        for (WhatsApp user : whatsAppsList) {
            if (password.equals(user.getPassword())){
                System.out.println("To whom to send a message. Write contact name: ");
                String number= scanner.nextLine();
                for (Contact c:addContact) {
                    if (c.getPhoneNumber().equals(number)){
                        user.getContacts().add(new Contact(user.getPhoneNumber(), c.getName()));
                        System.out.println("Successfully added contact->"+c.getName());

                    }
                }
//                for (Contact c:addContact) {
//                 System.out.println("Write number");
//                String number= scanner.nextLine();
//                if (number.equals(whatsApp.getPhoneNumber()))
//
//                        addContact.add(c);
//                        System.out.println("Successfully added contact->"+c.getName());
//
//                    }
//
//
//
//                System.out.println("successfully added contact - > "+whatsApp.getNickName());


            }







        }

    }

    @Override
    public void changeStatus(LinkedList<Status> changeStatus) {
        changeStatus.add(Status.PRIVET_YA_ISPOLSUYU_WHATSAPP);
        System.out.println("ТЕКУЩИЙ СТАТУС"+changeStatus);
        Scanner scanner= new Scanner(System.in);
        System.out.println("""
                    ВЫБРАТЬ СТАТУС :
                    1: NA_SVYIAZI,
                    2: ZANYIAT_A,
                    3: V_SHKOLE,
                    4: V_KINO,
                    5: NA_RABOTE,
                    6: NIZKIY_UREVEN_ZARIADA,
                    7: NE_MOGU_GOVORIT_TOLKO_WHATSAPP,
                    8: NA_SOVESHANIY,
                    9: V_SPORTZALE,
                   10: CPLU,
                   11: TOLKO_EXTRINNIE_ZVONKI,
                  ...
                """);
        int knopka= scanner.nextInt();

        switch (knopka){
            case 1:
                System.out.println(changeStatus.add(Status.NA_SVYIAZI));
                break;
            case 2:
                System.out.println(changeStatus.add(Status.ZANYIAT_A));
                break;
            case 3:
                System.out.println(changeStatus.add(Status.V_SHKOLE));
                break;
            case 4:
                System.out.println(changeStatus.add(Status.V_KINO));
                break;
            case 5:
                System.out.println(changeStatus.add(Status.NA_RABOTE));
                break;
            case 6:
                System.out.println(changeStatus.add(Status.NIZKIY_UREVEN_ZARIADA));
                break;
            case 7:
                System.out.println(changeStatus.add(Status.NE_MOGU_GOVORIT_TOLKO_WHATSAPP));
                break;
            case 8:
                System.out.println(changeStatus.add(Status.NA_SOVESHANIY));
                break;
            case 9:
                System.out.println(changeStatus.add(Status.V_SPORTZALE));
                break;
            case 10:
                System.out.println(changeStatus.add(Status.CPLU));
                break;
            case 11:
                System.out.println(changeStatus.add(Status.TOLKO_EXTRINNIE_ZVONKI));
                break;
//            case 12:
//                System.out.println("|: ");
//                String izmenitStatus= scanner.next();
//                Status.PRIVET_YA_ISPOLSUYU_WHATSAPP==izmenitStatus;
//                changeStatus.set(0,);
//                break;

        }


    }

    @Override
    public String getAllWatsAppStatus() {
        return null;

    }

    @Override
    public void getAllWatsApp(List<WhatsApp>whatsApps) {
        for (WhatsApp w :whatsApps) {
            System.out.println(w);

        }


    }

    @Override
    public void getMessage(List<WhatsApp>whatsAppList,ArrayList<String>message) {

        Scanner scanner= new Scanner(System.in);
        WhatsApp whatsApp= new WhatsApp();
        System.out.print("\nWrite you password WhatsApp");
        String password= scanner.next();
        if(password.equals(whatsApp.getPassword())){
            System.out.println("To whom to send a message.write contact name:");
            String name= scanner.nextLine();
            for (WhatsApp w:whatsAppList) {
                if (name.equals(whatsApp.getNickName())){
                    System.out.print("Write message:");
                    String otvet=scanner.next();
                    System.out.println("Will send a message? (yes/no)");
                    String yes= scanner.nextLine();
                   if (yes.equalsIgnoreCase("yes")){


                   }
                }

            }




        }





    }

    @Override
    public void changeImage(List<WhatsApp> imageWhatsApp) {


    }
    public String getMessage(List<WhatsApp> users, WhatsApp myUser) {
        Scanner scanner=new Scanner(System.in);
        String message="";
        System.out.println("Kogo budete pisat' ");
        String userScan=scanner.nextLine();
        for (Contact contact : myUser.getContacts()) {
            if (contact.getName().equals(userScan)){
                System.out.println("contact tabyldy: "+ contact.getName()+ "\nMessage...");
                message = contact.getName()+ ": " + scanner.nextLine();
                System.out.println("Otpravit (yes/no)?");
                String yesOrNo = scanner.nextLine();
                if(yesOrNo.equals("yes")){
                    contact.getMessage().add(message);
                    for (WhatsApp user : users) {
                        if (user.getContacts() != null){
                            for (Contact contact1 : user.getContacts()) {
                                if (contact1.getPhoneNumber().equals(myUser.getPhoneNumber())){
                                    for (Contact myContact :
                                            myUser.getContacts()) {
                                        if (user.getPhoneNumber().equals(myContact.getPhoneNumber()) && user.getPhoneNumber().equals(contact.getPhoneNumber())) {
                                            contact1.getMessage().add(message);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}
