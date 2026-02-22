package main.asm6;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        //this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }
}
