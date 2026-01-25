package main.asm1;

public class Main {
    public static void main(String[] args){
        Phanso f1 = new Phanso();
        Phanso f2 = new Phanso();
        Phanso daonguoc = new Phanso();

        // Nhập phân số thứ 1
        System.out.println("Phân số A ");
        f1.nhapso();
        System.out.print("Phân số A = ");
        f1.inphanso();
        // Nhập phân số thứ 2
        System.out.println("Phân số B ");
        f2.nhapso();
        System.out.print("Phân số B = ");
        f2.inphanso();


    }
}
