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
public class Tomato extends Toppings{
    public Tomato(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public String getSName() {
        return sandwich.getSName() + ", Tomato";
    }
            
    public double cost() {
        return .05 + sandwich.cost();
    } 
}
