package com.company;

import java.util.Scanner;
import com.company.entitity.Player;
import com.company.plot.Ziemia;

public class Game {

    public void game() {
        Player gracz = new Player();

        System.out.println("Podaj imie:");
        Scanner sc = new Scanner(System.in);
        gracz.name = sc.next();
        gracz.setCash(40000.00);



    }
}
