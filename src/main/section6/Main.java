package main.section6;

public class Main {
    public static void main(String[] args){
        // xử lí ngoại lệ( try-catch )
        try{
            int x =10;
            int y =2;
            if (y<5){
                throw new ArithmeticException("Số bé quá ko được"); // chủ động phát ra ngoại lệ
            } else if (y<8) {
                throw new ArithmeticException("Số không hợp lệ");
            }
            int z;
            z = x/y;
            System.out.println("z="+z);
        }catch (ArithmeticException e){
            //ArithmeticException: lỗi số học hay gọi là toán học(do +,-,*,: sai)
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Lỗi!!!!!!");
        }finally {
            // Lúc nào cũng chạy qua
        }
    }

    //throws Exception: báo hiệu có thể có ngoại lệ nếu có ng dùng thì sẽ phải xử lí ngoại lệ
    public static void readExcelFile() throws Exception{
        // giả sử hàm này có thể xra ngoại lệ
    }
}
