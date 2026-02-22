package main.section5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Asian p = new Asian();
        Euro s = new Euro();
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(p);
        arr.add(s);

        Person c = new Person() {   // Lớp ẩn danh: viết 1 lớp kế thừa lớp Person và tạo ngay cthuc
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };

        LoveTips1 d = new LoveTips1() {
            @Override
            public void dinner() {

            }

            @Override
            public void goToCinema() {

            }

            @Override
            public void goToCafe() {

            }
        };

        // dòng số 50 giống như cái này nhưng sẽ gọn hơn
        LoveTipsPecical ls = new LoveTipsPecical() {
            @Override
            public void xyz(String x, int y) {

            }
        };

        LoveTipsPecical lss = (x,y)->{

        }; //lambda expression

        // 2 dòng dưới này bằng 2 cách viet trên
        ArrayList<Integer> arrs = new ArrayList<>();
        arrs.stream().filter(i -> i >0).map(i -> i<10).toArray();
    }
}
