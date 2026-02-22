package main.asm6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();

        // Thêm số điện thoại
        pb.insertPhone("An", "0901234567");
        pb.insertPhone("Binh", "0912345678");
        pb.insertPhone("An", "0987654321");
        pb.insertPhone("Cuong", "0933333333");

        // Tìm kiếm
        System.out.println("Insert phone");
        pb.searchPhone("An");
        pb.searchPhone("Binh");
        pb.searchPhone("Cuong");

        // Cập nhật số
        System.out.println("Cập nhật số");
        pb.updatePhone("Binh", "0999999999");
        pb.searchPhone("Binh");

        // Xoá số
        System.out.println("Xoá số");
        pb.removePhone("Cuong");
        pb.searchPhone("Cuong");

        // Sắp xếp theo tên
        System.out.println("Danh bạ sau khi sắp xếp");
        pb.sort();
        for (PhoneNumber pn : pb.PhoneList) {
            System.out.println("Name: " + pn.getName());
            System.out.println("Phone: " + pn.getPhones());
        }
    }
}
