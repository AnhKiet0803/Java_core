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

        // Rút gọn phân số
        System.out.println("Phân số A được rút gọn là: ");
        f1.rutgon();
        f1.inphanso();
        System.out.println("Phân số B được rút gọn là: ");
        f2.rutgon();
        f2.inphanso();

        // Nghịch đảo phân số
        daonguoc.nghichdao(f1);
        System.out.print("Nghịch đảo của phân số A là: ");
        daonguoc.inphanso();

        daonguoc.nghichdao(f2);
        System.out.print("Nghịch đảo của phân số b là: ");
        daonguoc.inphanso();
        // Cộng 2 phân số
        System.out.print("A + B = ");
        f1.add(f2).inphanso();

        // Trừ 2 phân số
        System.out.print("A - B = ");
        f1.sub(f2).inphanso();

        // Nhân 2 phân số
        System.out.print("A * B = ");
        f1.mul(f2).inphanso();

        // Chia 2 phân số
        System.out.print("A / B = ");
        f1.div(f2).inphanso();
    }
}
