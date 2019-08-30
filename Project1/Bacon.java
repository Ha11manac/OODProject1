/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author pokem
 */
public class Bacon extends Toppings{
    public Bacon(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public String getSName() {
        return sandwich.getSName() + ", Bacon";
    }
            
    public double cost() {
        return 1.00 + sandwich.cost();
    } 
}