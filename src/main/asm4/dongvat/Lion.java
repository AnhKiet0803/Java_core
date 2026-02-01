package main.asm4.dongvat;

public class Lion extends Animal {
    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Lion eats meat");
    }
}
