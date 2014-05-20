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
public class JapaneseMealBuilder implements MealBuilder {
    private Meal meal;
    public JapaneseMealBuilder() {
        meal = new Meal();
    }
    @Override
    public void buildDrink() {
        meal.setDrink("sake");
    }
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("chicken teriyaki");
    }

    public void buildSide() {
        meal.setSide("miso soup");
    }

    public Meal getMeal() {
        return meal;
    }
    
}
