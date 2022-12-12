package service;

import classes.*;
import enums.Status;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface WhatsAppService {
    void whatsAppAccount( List<Passport>passports,List<WhatsApp>whatsAppList);
    void messageSend(String send);
     String whatsAppTransfer(String transfer);
    void addContact(ArrayList<Contact>addContact,  List<WhatsApp>whatsAppsList);
    void changeStatus(LinkedList<Status> changeStatus);
    String getAllWatsAppStatus();
   void getAllWatsApp(List<WhatsApp>whatsApps);
    void getMessage(List<WhatsApp>whatsAppList,ArrayList<String>message);
    void  changeImage(List<WhatsApp>imageWhatsApp);

}
