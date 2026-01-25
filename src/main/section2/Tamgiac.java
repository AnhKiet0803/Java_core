package main.section2;

public class Tamgiac {
     Integer a;
     Integer b;
     Integer c;

     public String name;

     public Tamgiac(){

     }
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
        System.out.println(this.name+"là tam giác cân");
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
