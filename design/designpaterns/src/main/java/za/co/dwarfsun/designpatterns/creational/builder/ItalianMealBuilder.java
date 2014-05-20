/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.designpatterns.creational.builder;

/**
 *
 * @author Matt
 */
public class ItalianMealBuilder implements MealBuilder {
    private Meal meal;
    public ItalianMealBuilder() {
        meal = new Meal();
    }
    @Override
    public void buildDrink() {
        meal.setDrink("red wine");
    }
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("pizza");
    }

    public void buildSide() {
        meal.setSide("bread");
    }

    public Meal getMeal() {
        return meal;
    }
    
}
