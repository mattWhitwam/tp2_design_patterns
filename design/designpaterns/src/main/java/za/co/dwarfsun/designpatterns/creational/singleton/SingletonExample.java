/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.designpatterns.creational.singleton;

/**
 *
 * @author Matt
 */
public class SingletonExample {
    private static SingletonExample singletonExample = null;
    
    private SingletonExample() {
    }
    
    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    
    public void sayHello() {
        System.out.println("Hello");
    }
}
