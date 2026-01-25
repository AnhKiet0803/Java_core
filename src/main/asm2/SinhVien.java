package main.asm2;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private double diemTB;

    public SinhVien() {

    }

    public SinhVien(String maSV, String hoTen, int tuoi, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public double getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void inThongTin(){
        System.out.println("Mã sinh viên: "+getMaSV());
        System.out.println("Họ tên sinh viên: "+getHoTen());
        System.out.println("Tuổi: "+getTuoi());
        System.out.println("Điểm trung bình: "+getDiemTB());
    }
}
