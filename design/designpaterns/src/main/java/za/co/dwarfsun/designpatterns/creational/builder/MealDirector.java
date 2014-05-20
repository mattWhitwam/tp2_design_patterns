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
public class MealDirector {
    private MealBuilder mealBuilder = null;
    
    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public void constructMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }
    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
