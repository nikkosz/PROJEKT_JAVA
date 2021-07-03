package com.company;

import java.io.IOException;
import java.util.Scanner;
import com.company.entitity.Player;
import com.company.plot.Generator;
import com.company.plot.Ziemia;
import sun.nio.cs.Surrogate;


public class Game {

    public void game() {
        Player gracz = new Player();

        System.out.println("Podaj imie:");
        Scanner sc = new Scanner(System.in);
        gracz.name = sc.next();
        gracz.setCash(40000.00);
        System.out.println("\f");
        System.out.println("Witaj "+gracz.name);
        System.out.println("Trzeba kupić kawałek ziemi by zacząć co?");

        System.out.println("To zobaczmy co my tu mamy.");

        Generator gen = new Generator();
        gen.generate();
        gen.generate_quality();
        gen.setPrice();
        Generator gen1 = new Generator();
        gen.generate();
        gen.generate_quality();
        gen.setPrice();
        Generator gen2 = new Generator();
        gen.generate();
        gen.generate_quality();
        gen.setPrice();

    }
}
