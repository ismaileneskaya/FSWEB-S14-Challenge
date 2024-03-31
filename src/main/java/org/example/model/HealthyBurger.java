package org.example.model;

import org.example.enums.BreadRollType;
import org.example.model.Hamburger;

public class HealthyBurger extends Hamburger {
    private Addition healthyAddition1;
    private Addition healthyAddition2;


    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1==null){
            healthyAddition1= new Addition(name,price);
        }
        else if(healthyAddition2==null){
            healthyAddition2 = new Addition(name,price);
        }
        else {
            System.out.println("Ekstra malzeme 2 taneden fazla eklenemez");
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder healthyBurgerBuilder=new StringBuilder();
        if(healthyAddition1!=null) {
            healthyBurgerBuilder.append("HealthyAddition1:"+getHealthyAddition1().getName()+"\n");
            setPrice(getPrice()* getHealthyAddition1().getPrice());


        }
        if(healthyAddition2!=null) {
            healthyBurgerBuilder.append("HealthyAddition2:"+getHealthyAddition2().getName()+"\n");
            setPrice(getPrice()* getHealthyAddition2().getPrice());


        }
        System.out.println(healthyBurgerBuilder );


    }
}
