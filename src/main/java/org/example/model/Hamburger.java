package org.example.model;

import org.example.enums.BreadRollType;

import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;

    private Addition [] additions;


    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions= new Addition[4];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }


    public Addition[] getAdditions() {
        return additions;
    }


    @Override
    public void addAddition(String name, double price) {
        for(int i =0;i< additions.length; i++){
            if(additions[i]==null){
                additions[i]= new Addition(name,price);
            }
        }
    }
    public void itemizeHamburger(){
        StringBuilder HamburgerStringBuilder= new StringBuilder();
        HamburgerStringBuilder.append("Name:"+name+"\n");
        HamburgerStringBuilder.append("Meat:"+meat+"\n");
        HamburgerStringBuilder.append("Bread Roll Type:"+breadRollType+"\n");
        for (Addition addition:additions){
            if(addition!= null){
                HamburgerStringBuilder.append("Addition name:"+ addition.getName()+"\n");
                HamburgerStringBuilder.append("Addition price:"+ addition.getPrice()+"\n");
            }
        }
        System.out.println(HamburgerStringBuilder);
        System.out.println("total price:"+price);
        System.out.println("*******************");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hamburger hamburger)) return false;
        return Objects.equals(name, hamburger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType=" + breadRollType +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }
}
