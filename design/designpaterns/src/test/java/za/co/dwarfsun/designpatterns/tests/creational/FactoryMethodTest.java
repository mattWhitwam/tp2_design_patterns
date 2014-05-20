/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.designpatterns.tests.creational;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.co.dwarfsun.designpatterns.creational.factorymethod.Animal;
import za.co.dwarfsun.designpatterns.creational.factorymethod.AnimalFactory;

/**
 *
 * @author Matt
 */
public class FactoryMethodTest {
    
    public FactoryMethodTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void factoryTest() {
        AnimalFactory factory = new AnimalFactory();
        Animal a1 = factory.getAnimal("feline");
        Animal a2 = factory.getAnimal("canine");
        
        assertNotEquals(a1.makeSound(), a2.makeSound(), "Animals do not make different sounds");
        assertEquals(a1.makeSound(), "Meow", "Animal makes wrong sound");
        assertEquals(a2.makeSound(), "Woof", "Animal makes wrong sound");
    }
}
