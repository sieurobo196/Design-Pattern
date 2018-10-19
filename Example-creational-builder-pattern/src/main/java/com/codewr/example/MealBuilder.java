package com.codewr.example;

import com.codewr.example.abstracts.extds.Coke;
import com.codewr.example.abstracts.extds.Pepsi;
import com.codewr.example.abstracts.extds.ChickenBurger;
import com.codewr.example.abstracts.extds.VegBurger;

/**
 *
 * @author codewr
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
