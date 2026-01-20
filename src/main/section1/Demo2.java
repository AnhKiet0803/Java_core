package main.section1;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args){
        int[] arr = new int[3]; // khoi boss 1 int array
        // list-collection, ko dung dong tren
        // int, float, double, char, bolean se ko dung duoc
        Integer a=10;
        Float b=3.14f;
        Double c=3.14159;
        Character d='x';
        Boolean e=true;
        ArrayList ar= new ArrayList();// ko nen dung
        ar.add(5);
        ar.add("hello");

        ArrayList<Integer> intArr= new ArrayList<>();// mang so nguyen
        intArr.add(5);
        intArr.add(7);
        //intArr.add(3.14);  se gay loi vi la mang so nguye
        //intArr.add("hello"); nhu tren
        ArrayList<Double> dbArr= new ArrayList<>();// mang so thuc
        dbArr.add(3.14);
        dbArr.add(3.5677);

        for (int i=0;i<intArr.size();i++){
            System.out.println(intArr.get(i));  // intArr.get(i)
        }
        for (Double f: dbArr){
            System.out.println(f);
        }
    }
}
