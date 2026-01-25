package main.asm2;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(){

    }
    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }
    public void setDiemToan(double diemToan) {
        if (diemToan >= 0 && diemToan <= 10) {
            this.diemToan = diemToan;
        } else {
            System.out.println("Điểm Toán phải từ 0 đến 10");
        }
    }

    public double getDiemVan() {
        return diemVan;
    }
    public void setDiemVan(double diemVan) {
        if (diemVan >= 0 && diemVan <= 10) {
            this.diemVan = diemVan;
        } else {
            System.out.println("Điểm Văn phải từ 0 đến 10");
        }
    }

    public double getDiemAnh() {
        return diemAnh;
    }
    public void setDiemAnh(double diemAnh) {
        if (diemAnh >= 0 && diemAnh <= 10) {
            this.diemAnh = diemAnh;
        } else {
            System.out.println("Điểm Anh phải từ 0 đến 10");
        }
    }

    public double tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    public String xepLoai() {
        double dtb = tinhDiemTB();
        if (dtb >= 8)
            return "Giỏi";
        else if (dtb >= 6.5)
            return "Khá";
        else if (dtb >= 5)
            return "Trung bình";
        else
            return "Yếu";
    }
}

