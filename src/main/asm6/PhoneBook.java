package main.asm6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pn: PhoneList){
            if (pn.getName().equalsIgnoreCase(name)){
                if (pn.getPhones().contains(phone)){
                    return;
                }
                pn.getPhones().add(phone);
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber pn: PhoneList){
            if (pn.getName().equalsIgnoreCase(name)){
                PhoneList.remove(pn);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                pn.getPhones().clear();   // xoá hết số cũ
                pn.getPhones().add(newphone); // thêm số mới
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                System.out.println("Name: " + pn.getName());
                System.out.println("Phone: " + pn.getPhones());
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng: " + name);
    }

    @Override
    public void sort() {
//  Cách 1:
//        for(int i=0;i<PhoneList.size()-1;i++){
//            for(int j=0;j<PhoneList.size()-i-1;j++){
//                if(PhoneList.get(j).getName().compareTo(PhoneList.get(j+1).getName()) > 0){
//                    PhoneNumber p = PhoneList.get(j);
//                    PhoneList.set(j,PhoneList.get(j+1));
//                    PhoneList.set(j+1,p);
//                }
//            }
//        }
//  Cách 2:
//        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//  Cách 3:
//        Collections.sort(PhoneList,(o1,o2)->o1.getName().compareTo(o2.getName()));
//  Cách 4:
        Collections.sort(PhoneList, Comparator.comparing(PhoneNumber::getName));
    }
//  4 cách trên đều như nhau sử dụng 1 trong 4 đều được
}
