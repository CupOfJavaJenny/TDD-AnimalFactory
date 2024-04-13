package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.Date;
import java.util.List;

/**
 * @author leon on 4/19/18.
 */
//cat is an extension of mammal, cat has
// to conform to EVERYTHING mammal says(parameters)
    //jennifer extends
// to zipcode, zipcode requires a final project
public class Cat extends Mammal {
    public Integer getNumberOfMealsEaten() {
        return mealsEaten;
    }

    private int mealsEaten;


    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
        //THIS constructor
        // is able to only have mealseaten available to THIS cat
        this.mealsEaten = 0;

        



    }

    public void eat(Food food) {
        this.mealsEaten++;

    }

    public String speak() {
        return "meow!";
    }
}
