package main.section2;

public class Tamgiac {
     Integer a;
     Integer b;
     Integer c;

     public Tamgiac(Integer a,Integer b,Integer c){
         this.a = a;
         this.b = b;
         this.c = c;
     }

    public Integer chuvi(){
         return this.a+this.b+this.c;
    }
    public Double dientich(){
        double p = (double) chuvi()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
