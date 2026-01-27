package main.section4;

public class FPTStudent extends Student{
    private String avt;

    public FPTStudent(Integer id, String name, String email, String avt) {
        super(id,name,email);
        this.avt = avt;
    }

    public void playgame(){
        System.out.println("play game");
        System.out.println("play game");
        System.out.println("play game");
        System.out.println("play game");
        System.out.println("play game");
    }
}
