package main.asm4.dongvat;


public class Main {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0]= new Lion("Sư tử hà đông");
        animals[1]= new Elephant("Voi ma mút");
        animals[2]= new Monkey("Khỉ đầu chó");
        for (Animal p: animals){
            System.out.println("Loại động vật: "+ p.getName());
            p.eat();
            System.out.println("------------------------------------");
        }
    }
}

