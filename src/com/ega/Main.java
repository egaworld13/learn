package com.ega;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Reģistrācija");
        //1. USER
        //Vārds
        System.out.println("Lietotāja vārds:");
        String name =sc.nextLine();
        //Parole
            System.out.println("Parole:");
            String pas = sc.nextLine();
        while (pas.length()<8){  // kritērijs, lai parole nav īsāka par 8 simboliem,
                System.out.print("Vismaz 8 simboli:"); // šis leks ārā, kamēr nebūs 8 simboli.
                pas = sc.next();}
           //epasts
            System.out.println("Epasts:");
            String email = sc.nextLine();
        while (email.length()<10){
            System.out.print("Vismaz 10 simboli:");
            email = sc.next();}

        System.out.println(name);
        System.out.println(pas);
        System.out.println(email);
        System.out.println("Jūs esat reģistrējies :)");
//LOGIN

        System.out.println("Ievadiet Lietotājvārdu:");
        String logname = sc.nextLine();

        System.out.println("Ievadiet paroli:");
        String logpas = sc.nextLine();

        if (logname.equals(name) && logpas.equals(pas)){   // && ir un; || ir vai; ! ir not
            System.out.println("Welcome!"+logname);
        }
        else {
            System.out.println("Mēģiniet vēlāk vēlreiz =]");
                   }
        // Aktīvs profils
        System.out.println("Čau kā tev iet, reku tavi dati:");
        System.out.println("Leitotājvārds: "+name);
        System.out.println("Leitotājvārds: "+email);
        System.out.println("Leitotājvārds: "+pas);
// LOGOUT
        System.out.println("Vēlaties iziet? y/n");
        String exit = sc.nextLine();
        if (exit.equals("y")){
            System.out.println("See you later "+name);
        }




        }
}

