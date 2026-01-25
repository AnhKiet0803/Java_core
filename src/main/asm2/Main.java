package main.asm2;

public class Main {
    public static void main(String[] args){
        // asm1
        SinhVien sv1 = new SinhVien("0001","Nguyễn Văn A",20,7.35);
        SinhVien sv2 = new SinhVien("0002","Nguyễn Thị B",22,9.5);
        sv1.inThongTin();
        sv2.inThongTin();
        // asm2
        TaiKhoan use1 = new TaiKhoan("01234567","Nguyễn Văn A",2000000);
        use1.hienThiSoDu();
        use1.napTien(50000);
        use1.napTien(1000);
        use1.rutTien(3000000);
        use1.rutTien(1000000);
        use1.hienThiSoDu();
        //asm3
        HocSinh hs1 = new HocSinh("Nguyễn Văn A",8,8,9);
        System.out.println("Họ tên: " + hs1.getHoTen());
        System.out.println("Toán: " + hs1.getDiemToan());
        System.out.println("Văn: " + hs1.getDiemVan());
        System.out.println("Anh: " + hs1.getDiemAnh());
        System.out.println("Điểm TB: " + hs1.tinhDiemTB());
        System.out.println("Xếp loại: " + hs1.xepLoai());
    }
}
