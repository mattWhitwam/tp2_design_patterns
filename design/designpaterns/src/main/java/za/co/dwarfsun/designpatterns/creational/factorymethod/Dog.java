/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.designpatterns.creational.factorymethod;

/**
 *
 * @author Matt
 */
public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }    
}
