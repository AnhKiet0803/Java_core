package main.section4;

public class Main {
    public static void main(String[] args){
        Student s = new Student(1,"a","b");
        s.study();
        FPTStudent f = new FPTStudent(2,"c","d","anh1");
        f.study();
        f.playgame();
        AptechStudent a = new AptechStudent(3,"e","f","anh2","abc@gmail");
        a.study();
        a.playgame();
        a.run();
        a.run(5);
        a.run("a");
    }
}
