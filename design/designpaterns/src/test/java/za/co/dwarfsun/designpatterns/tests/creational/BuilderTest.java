/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.designpatterns.tests.creational;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import za.co.dwarfsun.designpatterns.creational.builder.ItalianMealBuilder;
import za.co.dwarfsun.designpatterns.creational.builder.JapaneseMealBuilder;
import za.co.dwarfsun.designpatterns.creational.builder.Meal;
import za.co.dwarfsun.designpatterns.creational.builder.MealBuilder;
import za.co.dwarfsun.designpatterns.creational.builder.MealDirector;

/**
 *
 * @author Matt
 */
public class BuilderTest {
    
    public BuilderTest() {
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
    public void builderTest() {
        MealBuilder mealBuilder;
        MealDirector mealDirector;
        
        mealBuilder = new ItalianMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal italian = mealDirector.getMeal();
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal japanese = mealDirector.getMeal();
        
        assertEquals(italian.getDrink(), "red wine","Wrong Italian drink");
        assertEquals(italian.getMainCourse(), "pizza","Wrong Italian main");
        assertEquals(italian.getSide(), "bread","Wrong Italian side");
        assertEquals(japanese.getDrink(), "sake","Wrong Japanese drink");
        assertEquals(japanese.getMainCourse(), "chicken teriyaki","Wrong Japanese main");
        assertEquals(japanese.getSide(), "miso soup","Wrong Japanese side");
        
    }
    
}
