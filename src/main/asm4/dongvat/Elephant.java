package main.asm4.dongvat;

public class Elephant extends Animal{
    public Elephant() {
    }

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Elephant eats grass");
    }
}
