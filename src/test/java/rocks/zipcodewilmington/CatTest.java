package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setName(){
        //given
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //when is calling the setter because we're testing the setter
        //we tested to see if the name change to cat is working
        cat.setName("cat");
        String actual = cat.getName();
        Assert.assertEquals("cat", actual);


    }
    @Test
    public void testSpeak(){
        //given  (usually values, to mock what will happen
        //if tested
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //Cat is calling the constructor asking permission
        //to make an object called kitty

        //when
        /*(when cat class is called to create a new
        cat object called kitty

         /*object is to be created before method

         */
        Cat kitty = new Cat(givenName, givenBirthDate, givenId);

        String expected = "meow!";

        //when whenever you are
        // performing the action, does the work

        String actual = kitty.speak();
        //then
        // always assert comparing if they're equal
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetBirthdate(){
        //given
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        //when
        Cat kitty = new Cat(givenName,givenBirthDate, givenId );
        //then
        Date expected = givenBirthDate;
        Date actual = kitty.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEat() {
        //given
        int expectedAmount = 3;
        int actualAmount = 0;
        //when
        Cat kitty = new Cat("Kitty", new Date(), 2);
        //kitty needs new food, let code know what needs to happen
        Food tuna = new Food();
        //we said kitty needs to eat 3x..we call the method eat 3x for kitty
        kitty.eat(tuna);
        kitty.eat(tuna);
        kitty.eat(tuna);
        //then
        //how many times kitty ate needs  to be updated
        actualAmount = kitty.getNumberOfMealsEaten();
        Assert.assertEquals(expectedAmount, actualAmount);
    }
    @Test
    public void getId(){
       //given
        int expectedId=911;
        int actualId=0;
        //when
        //create object
        Cat kitty = new Cat("",new Date(),911);
        //then
        //comparison
        actualId= kitty.getId();
        Assert.assertEquals(expectedId,actualId);
    }
    @Test
    public void isCatAnimal(){
        //given

        //when
        //create object of cat if they're instance of
        Cat cat = new Cat("", new Date(),2);
        //then
        Assert.assertTrue(cat instanceof Animal);


    }
    @Test
    public void isCatMammal(){
        //given

        //when
        //create object of cat if they're instance of
        Cat cat = new Cat("", new Date(),2);
        //then
        Assert.assertTrue(cat instanceof Mammal);
    }








}
