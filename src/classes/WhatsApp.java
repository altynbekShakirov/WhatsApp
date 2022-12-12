package classes;

import enums.Status;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WhatsApp  {

    private int id;
    private String image;
    private String nickName;
    private String phoneNumber;
    private String password;
    private Status status= Status.PRIVET_YA_ISPOLSUYU_WHATSAPP;
    private List<Contact>contacts;
    private Queue<String>messages;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WhatsApp(int id, String image, String nickName, String phoneNumber, String password) {
        this.id =id;
        this.image = image;
        this.nickName = nickName;
        this.phoneNumber=phoneNumber;
        this.password= password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getImage() {
        return image;
    }

    public WhatsApp() {
    }

    @Override
    public String toString() {
        return " id:       " + id+"\n"+
                "image:    " + image + '\n' +
                "nickName: " + nickName + '\n' +
                "status:   " + status + '\n';
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Queue<String> getMessages() {
        return messages;
    }

    public void setMessages(Queue<String> messages) {
        this.messages = messages;
    }
}
