package main.section4;

public class AptechStudent extends FPTStudent {
    public String account;

    public AptechStudent(Integer id, String name, String email, String avatar, String account) {
        super(id, name, email, avatar);
        this.account = account;
    }
    public void playgame(){  //override method // - ghi đè
        super.playgame(); // đối tượng ngầm định của lớp cha với con
        System.out.println("APTECH Student play game  . . .");
    }

    //over lood - nạp chồng
    public void run(){
        System.out.println("running 5km/h");
    }
    public void run(int x){
        System.out.println("running 10km/h");
    }
    public void run(String msg){
        System.out.println("running 20km/h");
    }
    public void sing(int a, String b){

    }
    public void sing(String b, int a){

    }
}
