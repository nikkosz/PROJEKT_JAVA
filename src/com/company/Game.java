package com.company;

import java.io.IOException;
import java.util.Scanner;

import com.company.entitity.Inventory;
import com.company.entitity.Player;
import com.company.entitity.Shop;
import com.company.plot.Generator;
import com.company.plot.Ziemia;
import com.company.worktype.Feeding;
import com.company.worktype.Planting;
import sun.nio.cs.Surrogate;


public class Game {

    public void game() {
        Player gracz = new Player();

        System.out.println("Podaj imie:");
        Scanner sc = new Scanner(System.in);
        gracz.name = sc.next();
        gracz.setCash(300000.00);
        System.out.println("\f");
        System.out.println("Witaj "+gracz.name);
        System.out.println("Trzeba kupić kawałek ziemi by zacząć co?");

        System.out.println("To zobaczmy co my tu mamy.");

        Generator gen = new Generator();
        gen.generate();
        gen.generate_quality();
        gen.setPrice();
        Generator gen1 = new Generator();
        gen1.generate();
        gen1.generate_quality();
        gen1.setPrice();
        Generator gen2 = new Generator();
        gen2.generate();
        gen2.generate_quality();
        gen2.setPrice();


        System.out.println("Działka numer 1:");
        System.out.println("Wielkość: "+ gen.size +" a.");
        System.out.println("Cena: "+ gen.price+ " cebulionów");
        System.out.println("Jakość gruntu: "+gen.quality);
        System.out.println("Działka numer 2:");
        System.out.println("Wielkość: "+ gen1.size +"a.");
        System.out.println("Cena: "+ gen1.price+ " cebulionów");
        System.out.println("Jakość gruntu: "+gen1.quality);
        System.out.println("Działka numer 3:");
        System.out.println("Wielkość: "+ gen2.size +"a.");
        System.out.println("Cena: "+ gen2.price+ " cebulionów");
        System.out.println("Jakość gruntu: "+gen2.quality);
        System.out.println("To czas kupić ;)");


        int wyborDzialki;

        wyborDzialki = menu2();
        double cash_gracza = gracz.getCash();

        switch (wyborDzialki){
            case 1:
                if(gen.price == cash_gracza){
                    System.out.println("No to masz ziemie, ale nic poza tym.");
                }else if(gen.price < cash_gracza){
                    System.out.println("Kupiłeś i coś jeszcze w tej sakiewce jest :D");

                    gracz.setCash(cash_gracza-gen.price);

                    Ziemia myZiemia = new Ziemia(gen2.size, gen2.quality, "None");




                }else{
                    System.out.println("Sory brachu, ale Cię nie stać");
                }

                break;
            case 2:
                if(gen1.price == cash_gracza){
                    System.out.println("No to masz ziemie, ale nic poza tym.");
                }else if(gen1.price < cash_gracza){
                    System.out.println("Kupiłeś i coś jeszcze w tej sakiewce jest :D");

                    gracz.setCash(cash_gracza-gen1.price);

                    Ziemia myZiemia = new Ziemia(gen2.size, gen2.quality, "None");



                }else{
                    System.out.println("Sory brachu, ale Cię nie stać");
                }
                break;
            case 3:
                if(gen2.price == cash_gracza){
                    System.out.println("No to masz ziemie, ale nic poza tym.");
                }else if(gen2.price < cash_gracza){
                    System.out.println("Kupiłeś i coś jeszcze w tej sakiewce jest :D");

                    gracz.setCash(cash_gracza- gen2.price);

                    Ziemia myZiemia = new Ziemia(gen2.size, gen2.quality, "None");
                    MainGame();



                }else{
                    System.out.println("Sory brachu, ale Cię nie stać");
                }

                break;
        }



    }

    public void MainGame() {

            //// No to czas na Main Game;
            System.out.println("Co chciałbyś zrobic?");
            System.out.println("-----------------------");
            System.out.println("1. Praca w polu");
            System.out.println("2. Praca przy zwierzętach");
            System.out.println("3. Zakupy/sprzedaż");
            System.out.println("4. Ekwipunek");
            System.out.println("5. Następny tydzień");
            System.out.println("6. Wyjście z gry");

            int wyborDzialania;
            wyborDzialania = menu2();
            switch (wyborDzialania) {
                case 1:
                    Planting plant = new Planting();
                    System.out.println("Co byś chciał zasadzic:");
                    //DODAC FUNKCJONALNOSC - Planting
                    break;
                case 2:
                    Feeding feed = new Feeding();
                    System.out.println("No to co? karmimy?");
                    //DODAC FUNKCJONALNOSC - Feeding
                    break;
                case 3:
                    Shop buyOrSell = new Shop();
                    System.out.println("Jedziemy do sklepu!!!!");
                    //DODAC FUNKCJONALNOSC - Shop
                    break;
                case 4:
                    Inventory invent = new Inventory();
                    System.out.println("Zobaczmy co tam jeszzcze mamy");
                    //DODAC FUNKCJONAlNOSC - Inventory
                    break;
                case 5:
                    MainGame();
                    //dodać outcome - progress
                    //dodac czas
                    //Powrót o tydzien pozniej
                    break;
                case 6:
                    System.out.println("Koniec gry");
                    break;
            }





        //////////////////////////////////////////////////////////////////////


    }

    public static int menu2(){
        int wybor;
        Scanner input = new Scanner(System.in);
        wybor = input.nextInt();

        return wybor;
    }







}

