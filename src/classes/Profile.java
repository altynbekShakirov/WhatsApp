package classes;

import java.util.List;

public class Profile extends WhatsApp{

    public Profile(int id, String image, String nickName, String phoneNumber, String password) {
        super(id, image, nickName, phoneNumber, password);
    }

    public Profile() {
    }
    public void contactSize(List<Passport> sizeContact){
        WhatsApp whatsApp= new WhatsApp();
        System.out.println("contacts:["+sizeContact.size()+"]");
        System.out.println("massage:[]");
        System.out.println("password:"+whatsApp.getPassword());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
}
