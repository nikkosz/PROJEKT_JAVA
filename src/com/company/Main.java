package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int wyborGracza;

    wyborGracza = menu();

    switch (wyborGracza){
        case 1:
            newGame();
            break;
        case 2:
            System.out.println("Gra to symulator farmy - od zera do bohatera");
            System.out.println("Zaczynając od podstaw kupujemy więcej ziemi, zarabiamy, a także i tracimy");
            System.out.println("Have fun!!!");
            System.out.println("Napisał: Nikodem Kosznik 53535");

            break;
        case 3:
            System.exit(0);
            break;
    }


    }

    private static void newGame() {
        Game gra = new Game();
        gra.game();


    }


    public static int menu(){
        int wybor;
        Scanner input = new Scanner(System.in);

        System.out.println("witam w Farm Lords");
        System.out.println("---------------------------");
        System.out.println("1. Nowa gra");
        System.out.println("2. Pomoc");
        System.out.println("3. Wyjście");

        wybor = input.nextInt();

        return wybor;
    }

}
