package main.asm4.dongvat;

public class Monkey extends Animal{
    public Monkey() {
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Monkey eats banana");
    }
}
