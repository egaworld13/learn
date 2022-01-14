package com.ega;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] dati ={"1","2","3"};//Šeit glabāsim vārdu,paroli,epastu.
        System.out.println("Reģistrācija");
        //1. USER
        //Vārds
        System.out.println("Lietotāja vārds:");
        String name =sc.nextLine();
        dati[0] = name;//ieraksta ievadīto vārdu array "1" vietā

        //Parole
            System.out.println("Parole:");
           String pas = sc.nextLine();
        while (pas.length()<8){// kritērijs, lai parole nav īsāka par 8 simboliem,
            System.out.print("Vismaz 8 simboli:");// šis leks ārā, kamēr nebūs 8 simboli.
            pas = sc.next();}

        dati[1] = pas;//ieraksta ievadīto paroli array "2" vietā

           //epasts
            System.out.println("Epasts:");
            String email = sc.nextLine();
        dati[2] = email;//ieraksta ievadīto epastu array "3" vietā
//TESTS
        System.out.println(dati[0]);
        System.out.println(dati[1]);
        System.out.println(dati[2]);

        }
}
