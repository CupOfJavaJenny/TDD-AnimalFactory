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


    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }


    public String speak() {
        return "meow!";
    }
}
