package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void testAddDog(){
        //Given
        Dog dog = new Dog("Milo", null, 2454);
        Integer expectedDogs = 1;

        //When
        DogHouse.add(dog);
        Integer actualDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
        DogHouse.clear();

    }

    @Test
    public void testRemoveDogById(){
        //Given
        Dog dog = new Dog("Milo",null,2454);
        Integer expectedDogs = DogHouse.getNumberOfDogs();
        //When
        DogHouse.add(dog);
        DogHouse.remove(2454);
        Integer actualDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
        DogHouse.clear();


    }
    @Test
    public void testRemoveDog(){
        //Given
        Dog dog = new Dog("Milo" , null, 2454);
        Integer expectedDogs = DogHouse.getNumberOfDogs();

        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer actualDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
        DogHouse.clear();


    }
    @Test
    public void testGetDogById(){
        //Given
        Dog dog = new Dog("Milo", null, 2454);
        Dog expectedId = dog;
        //When
        DogHouse.add(dog);
        Dog actualId = DogHouse.getDogById(2454);

        //Then
        Assert.assertEquals(expectedId, actualId);
        DogHouse.clear();
    }



}
