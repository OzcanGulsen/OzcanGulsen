package com.company.javaPractice;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.*;

public class Ders1 {

    public static void main(String[] args) {
        System.out.println("ders 1 baslangic");
        System.out.println("degiskenler");
     int a=34;
     String B ="b=22";
     short s=3;
     double d=3.14;
     char c='A';
     boolean b= true;
     String ozy ="Ozy";

        System.out.println("b+" + a + "=56  ise b=? ");
        System.out.println("56-34= b olduguna gore   "  + B);
        System.out.println(s);
        System.out.println("pi sayisi=" + d);
        System.out.println(c);
        System.out.println(ozy);






        System.out.println("ders2 kullanicidan input alma");

        Scanner scan=new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("bir sayi giriniz");
        int g = scan.nextInt();
        System.out.println(" g degiskeninin degeri "+ g );
        System.out.println("bir sayi giriniz");
        double gb = scan.nextDouble();
        System.out.println(" gb degiskeninin degeri "+ gb );

        System.out.println("adinizi giriniz");

        String abc = scan.nextLine();
        System.out.println(" isminiz  "+ abc );









    }

}
