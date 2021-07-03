package com.company.plot;

import java.util.Random;

public class Generator {
    public double size;
    public String quality;
    public Double price;

    public int Q_Rand;
    public void generate(){
        Random rand = new Random();
        double maxSize= 4000.00;
        double size_rand = rand.nextDouble();
        this.size = size_rand;

    }
    public void generate_quality(){
        Random rand = new Random();
        int maxQuality = 5;

        Q_Rand = rand.nextInt();
        switch (Q_Rand){
            case 0:
                this.quality = "CZY TO JEST POWAŻNE?";
                break;
            case 1:
                this.quality = "na coś to się jeszcze chyba nada";
                break;
            case 2:
                this.quality = "Trochę zwierzyny, trochę pracy i będzie dobrze";
                break;
            case 3:
                this.quality = "Zawsze mogło być gorzej";
                break;
            case 4:
                this.quality = "Jest przyzwoicie";
                break;
            case 5:
                this.quality = "NO I TU MOŻNA CHODOWAC!!!!!!";
                break;
        }
    }

    public void setPrice(){
        Random rand = new Random();
        double max_Price = 1000000.00;
        double new_price = rand.nextDouble();

        if(size >= 500){
            if(new_price<= 20000){
                new_price *=2;
            }
            if(Q_Rand<3){
                new_price*=0.9;
            }
        }else if(size<= 5000){
            if(new_price >=20000){
                new_price /= 3;
            }
            if(Q_Rand>3){
                new_price *= 1.2;
            }
        }else if(size >=2000) {
            if (new_price <= 20000) {
                new_price *= 3;
            }
            if (Q_Rand < 3) {
                new_price *= 0.95;
            } else if (Q_Rand > 3) {
                new_price *= 1.4;

            }
        }
        else if(size >=3000) {
            if (new_price <= 20000) {
                new_price *= 3.5;
            }
            if (Q_Rand < 3) {
                new_price *= 0.95;
            } else if (Q_Rand > 3) {
                new_price *= 1.4;

            }
        }
    }


}
