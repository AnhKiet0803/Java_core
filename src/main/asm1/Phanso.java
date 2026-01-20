package main.asm1;

import java.util.Scanner;

public class Phanso {
    Integer tu; // a là tử số
    Integer mau; // b là mẫu số

    public Phanso(){
        tu = 0;
        mau =1;
    }
    public Phanso(Integer tu, Integer mau){
        this.tu = tu;
        this.mau = mau;
    }

    // nhập 2 số từ bàn phím
    public void nhapso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        tu = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        mau = sc.nextInt();
    }

    // setter và getter
    public Integer getA(){
        return tu;
    }
    public void setA(Integer a){
        this.tu = a;
    }
    public Integer getB(){
        return mau;
    }
    public void setB(Integer b){
        this.mau = b;
    }

    // In phân số
    public void inphanso(){
        System.out.println(tu+"/"+mau);
    }
    // Rút gọn phân số
    public Integer UCLN(Integer a, Integer b){
        while (b!=0){
            Integer r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public void rutgon(){
        Integer u = UCLN(tu,mau);
        tu = tu / u;
        mau = mau / u;
    }

    // Nghịch đảo phân số
    // Nghịch đảo phân số f
    public void nghichdao(Phanso f) {
        tu = f.mau;
        mau = f.tu;
    }

    // Cộng 2 phân số
    public Phanso add(Phanso f){
        Phanso kq = new Phanso();
        kq.tu = this.tu * f.mau + f.tu * this.mau;
        kq.mau = this.mau * f.mau;
        kq.rutgon();
        return kq;
    }

    // Trừ 2 phân số
    public Phanso sub(Phanso f){
        Phanso kq = new Phanso();
        kq.tu = this.tu * f.mau - f.tu * this.mau;
        kq.mau = this.mau * f.mau;
        kq.rutgon();
        return kq;
    }

    // Nhân 2 phân số
    public Phanso mul(Phanso f){
        Phanso kq = new Phanso();
        kq.tu = this.tu * f.tu;
        kq.mau = this.mau * f.mau;
        kq.rutgon();
        return kq;
    }

    // Nhân 2 phân số
    public Phanso div(Phanso f){
        Phanso kq = new Phanso();
        kq.tu = this.tu * f.mau;
        kq.mau = this.mau * f.tu;
        kq.rutgon();
        return kq;
    }
}
