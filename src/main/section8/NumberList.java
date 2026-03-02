package main.section8;

public class NumberList<T> {

    // kĩ thuật tham số hoá(generic), thường đặt là S,E,V,K,V

    public T x;

    public void print(){
        System.out.println("x="+x);
    }

    public <T> void info(T x,String y){

    }
}
