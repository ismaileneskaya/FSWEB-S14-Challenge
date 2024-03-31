package org.example.model;

import org.example.enums.DrinkType;

public class Drink {
    private DrinkType drinkType;

    public Drink(DrinkType drinkType, Cips cips){
        this.drinkType=drinkType;
    }

    public DrinkType getDrinkType(){
        return drinkType;
    }
}
