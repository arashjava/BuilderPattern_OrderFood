/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybuilder;

/**
 *
 * @author arash
 */
public class FoodBuilder {
    private String meat;
    private String cheese;
    private String dressing;
    private double size;

    public FoodBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public FoodBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public FoodBuilder setDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public FoodBuilder setSize(double size) {
        this.size = size;
        return this;
    }
    
    public Food getFood(){
        return new Food(meat, cheese, dressing, size);
    }
}
