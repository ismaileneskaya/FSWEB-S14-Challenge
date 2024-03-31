package org.example.model;

import org.example.enums.BreadRollType;

import java.util.StringTokenizer;

public class DeluxeBurger extends Hamburger {

    private Drink drink;
    private Cips cips;


    public DeluxeBurger(Drink drink,Cips cips) {
        super("DELUXE BURGER","DOUBLE",19.10,BreadRollType.DOUBLE_BURGER);
        this.drink=drink;
        this.cips=cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void itemizeHamburger() {

        StringBuilder deluxeBurgerBuilder= new StringBuilder();
        deluxeBurgerBuilder.append("DRINK: "+ drink.getDrinkType()+"\n");
        deluxeBurgerBuilder.append("CIPS: "+ cips.getCipsType()+"\n");
        super.itemizeHamburger();
        System.out.println(deluxeBurgerBuilder);
    }
}
