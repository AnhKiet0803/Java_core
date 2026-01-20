package main.section1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        int x = 10;
        float y = 3.14f;
        double z = 3.14159;
        boolean t = true;
        char c = 'h';
        String s = "Hello world";
        System.out.print(s+x); // string+number -> string(giống JS)
        int u =20;
        int v =30;
        System.out.println(u+"+"+v+"="+add(u,v));
        System.out.println(u+"/"+v+"="+div(u,v));

        // nhập 1 số từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        // ktra phải số ng tố ko
        //thông báo kết quả
        if (isPrime(n)){
            System.out.println(n+"is a prime");
        }else {
            System.out.println(n+"is not prime");
        }

        double p;
        p = sc.nextDouble();

    }

    // cong 2 so
    public static int add(int a,int b){
        return a+b;
    }

    // chia 2 so
    public static double div(int a,int b){
        if (b==0) return 0;
        return (double) a/b;
    }

    // viết hàm k tra 1 số có là số nguyên tố ko ?
    public static boolean isPrime(int n){
        if (n<2) return false;
        if(n<4) return true;
        for (int i=2;i<=n;i++){
            if (n%i==0) return true;
        }
        return false;
    }
}
