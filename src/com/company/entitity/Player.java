package com.company.entitity;

import java.util.Date;

public class Player {
    public String name;
    private Double cash;


    public double getCash(){
        System.out.println(new Date());
        return this.cash;

    }
    public void setCash(double price){
        if(price >=0.0){

            this.cash += price;
        }else {
            this.cash -= price;
        }
    }




}
