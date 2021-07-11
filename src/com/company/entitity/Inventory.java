package com.company.entitity;

import java.util.ArrayList;

public class Inventory {
    public String item; //name of an item
    public Integer pieces; //pieces of an item
    public Double weight; //weight of an item for example for measuring packeges needed to plant seeds.


    public ArrayList<Inventory> Invent;

    public void setInvent(Inventory invent){
        if(Invent.size()==0){
                Invent.set(0, invent);
        }else if(Invent.size()>0){
            Invent.set(Invent.size() +1, invent);
        }

    }
    public void getInvent(int inventSlot){
        if(inventSlot>=1){
            Invent.get(inventSlot -1);
            System.out.println("Wybrano :" + Invent.get(inventSlot-1).item);
            System.out.println("Jego ilość to: "+Invent.get(inventSlot-1).pieces);
            System.out.println("Waga jednej sztuki to: "+Invent.get(inventSlot -1).weight);
        }

    }
    public void getAll(){
        for(int i =0; i<Invent.size(); i++){
            System.out.println(Invent.get(i));
        }
    }



}
