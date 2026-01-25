package main.asm1;

import java.util.Scanner;

public class Phanso {
    private Integer tu;
    private Integer mau;

    public Phanso(){

    }
    public Phanso(Integer tu, Integer mau){
        this.tu = tu;
        this.mau = mau;
    }

    // setter và getter
    public Integer gettu(){
        return tu;
    }
    public void settu(Integer tu){
        this.tu = tu;
    }
    public Integer getmau(){
        return mau;
    }
    public void setmau(Integer mau){
        this.mau = mau!=0?mau:1;
    }

    // nhập 2 số từ bàn phím
    public void nhapso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        tu = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        mau = sc.nextInt();
    }

    // In phân số
    public void inphanso(){
        System.out.println(gettu()+"/"+getmau());
    }
    // Rút gọn phân số
    public void rutgon(){
        int ucln =1;
        for (int i=2;i<Math.abs(gettu());i++){
            if (gettu()%i==0 && getmau()%i==0){
                ucln =1;
            }
        }
        settu(gettu()/ucln);
        setmau(getmau()/ucln);
    }

    // Nghịch đảo phân số
    public void nghichdao(Phanso f) {
        tu = f.mau;
        mau = f.tu;
    }

    // Cộng 2 phân số
    public void add(Phanso f){
        setmau(this.mau * f.getmau());
        settu(this.tu*f.getmau() + this.mau*f.gettu());
        rutgon();
    }

    // Trừ 2 phân số
    public void sub(Phanso f){
        setmau(this.mau * f.getmau());
        settu(this.tu*f.getmau() - this.mau*f.gettu());
        rutgon();
    }

    // Nhân 2 phân số
    public void mul(Phanso f){
        settu(this.tu * f.gettu());
        setmau(this.mau * f.getmau());
        rutgon();
    }

    // Chia 2 phân số
    public void div(Phanso f){
        settu(this.tu * f.getmau());
        setmau(this.mau * f.gettu());
        rutgon();
    }
}
