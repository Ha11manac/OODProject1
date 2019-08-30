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
public class SandwichHub {
    public static void main(String[] args){
        Sandwich s1 = new Ham();
        s1 = new Mustard(s1);
        System.out.println(s1.getSName() + ": $" + s1.cost());
        
        Sandwich s2 = new Turkey();
        s2 = new Lettuce(s2);
        s2 = new Bacon(s2);
        System.out.println(s2.getSName() + ": $" + s2.cost());
        
        Sandwich s3 = new RoastBeef();
        s3 = new Tomato(s3);
        s3 = new Mayo(s3);
        System.out.println(s3.getSName() + ": $" + s3.cost());
        
        Sandwich s4 = new MeatBall();
        s4 = new Cheese(s4);
        System.out.println(s4.getSName() + ": $" + s4.cost());
        
    }
}
