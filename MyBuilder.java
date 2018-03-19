/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybuilder;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyBuilder {

    /**
     * @param args the command line arguments
     */
    protected static String typeOfMeant;
    protected static String typeOfCheese;
    protected static String typeOfDressing;
    protected static double size;
        
    public static void main(String[] args) {
        
        getOrder();
        
        Food food= new FoodBuilder()
                .setMeat(typeOfMeant)
                .setCheese(typeOfCheese)
                .setDressing(typeOfDressing)
                .setSize(size).getFood();
                
        System.out.println(food);
    }
    
    public static void getOrder(){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter type of the meat you would like:");
        typeOfMeant= sc.nextLine();
        
        System.out.println("Please enter type of the cheese you would like:");
        typeOfCheese= sc.nextLine();
        
        System.out.println("Please enter type of the dressing you would like:");
        typeOfDressing= sc.nextLine();   
               
        System.out.println("Please enter the size(Lb) you would like (0.5, 1):");
        size= sc.nextDouble();   
    }
    
}
