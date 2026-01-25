package main.asm2;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String soTaiKhoan,String tenChuTK,double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }
    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenChuTK() {
        return tenChuTK;
    }
    public void setTenChuTK(String tenChuTK) {
        this.tenChuTK = tenChuTK;
    }

    public double getSoDu() {
        return soDu;
    }
    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void napTien(double soTien){
        if(soTien <=0){
            System.out.println("Số tiền nạp phải lớn hơn 0");
        } else if (soTien % 10000 !=0) {
            System.out.println("Số tiền nạp phải là bội số của 10.000");
        } else {
            soDu = soDu + soTien;
            System.out.println("Nạp tiền thành công: "+soTien);
        }
    }
    public void rutTien(double soTien){
        if(soTien <=0){
            System.out.println("Số tiền rút phải lớn hơn 0");
        } else if (soTien % 10000 != 0) {
            System.out.println("Số tiền rút phải là bội số của 10.000");
        } else if (soTien > soDu) {
            System.out.println("Số dư của bạn không đủ để rút");
        } else {
            soDu = soDu -soTien;
            System.out.println("Rút tiền thành công: "+soTien);
        }
    }
    public void hienThiSoDu(){
        System.out.println("Số dư hiện tại của bạn: "+soDu);
    }
}
