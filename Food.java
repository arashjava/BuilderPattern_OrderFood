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
public class Food {
    private String meat;
    private String cheese;
    private String dressing;
    private double size;

    public Food(String meat, String cheese, String dressing, double size) {
        this.meat = meat;
        this.cheese = cheese;
        this.dressing = dressing;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Food{" + "meat=" + meat + ", cheese=" + cheese + ", dressing=" + dressing + ", size=" + size + '}';
    }

}
