package classes;

import java.util.List;

public class Contact {
    private String phoneNumber;
    private String name;
    private List<String> message;
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }



    public Contact(String whatsApp, String name) {
        this.phoneNumber =whatsApp;
        this.name = name;

    }
}
