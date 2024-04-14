package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        //given

        Cat cat = new Cat("Alice", null, 3);
        Integer expectedCats = 1;

        //When
        CatHouse.add(cat);
        Integer actualCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCats, actualCats);
        CatHouse.clear();



    }
    @Test
    public void testRemoveCatById(){
        //given
        //create object & expectation
      Cat cat1 = new Cat("Alice",null,3);
      Integer expectedCats = CatHouse.getNumberOfCats();
        //when

        CatHouse.add(cat1);

        //remove 1 cat
        CatHouse.remove(3);

        Integer actualCats=CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expectedCats, actualCats);


    }
    @Test
    public void testRemoveCatByCat(){
        //given
        Cat cat = new Cat("Alice",null,null);
        Integer expectedCats = CatHouse.getNumberOfCats();

        //when
        //create the defined objects we start with, we will later end at 3
        Cat cat1 = new Cat("Jorris", new Date(),4);
        Cat cat2 = new Cat("Alice", new Date(),3);
        Cat cat3 = new Cat("Matt", new Date(),2);
        Cat cat4 = new Cat("Jenn", new Date(),1);
        //cats are waiting in line, put them in shelter

        CatHouse.add(cat);

        //remove 1 cat
        CatHouse.remove(cat);

        Integer actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }
    @Test
    public void getCatById(){
        //make sure the number called is already in the shelter
        //check if Matt/id 2 is in the shelter

        //call certain object up that are in the shelter currently, first create objects
        //CHECK by calling the ID(this is what getID is doing)

        //cats are in line 0 jorris 1 alice 2 matt
        Cat cat1 = new Cat("Jorris",new Date(),35);
        Cat cat2 = new Cat("Alice", new Date(),100);
        Cat cat3 = new Cat("Matt",new Date(),414);
        Cat expectedAmount=cat3;

        //cats are to be put in shelter
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);


        //cats are to be checked if they were added to shelter
        //look at what the class for method getCatbyID is returning
        // getAnimalByID(id)...NOT CAT id/by the total cats the shelter ever had
        Cat actualAmount= CatHouse.getCatById(414);

        Assert.assertEquals(expectedAmount, actualAmount);
    }

        @Test
        public void testGetNumberOfCats(){
            //given
            int actualAmount = 0;
            int expectedAmount = 4;
            //when
            //create the defined objects we start with, we will later end at 3
            Cat cat1 = new Cat("Jorris", new Date(),4);
            Cat cat2 = new Cat("Alice", new Date(),3);
            Cat cat3 = new Cat("Matt", new Date(),2);
            Cat cat4 = new Cat("Jenn", new Date(),1);
            //cats are waiting in line, put them in shelter
            CatHouse.add(cat1);
            CatHouse.add(cat2);
            CatHouse.add(cat3);
            CatHouse.add(cat4);


            actualAmount=CatHouse.getNumberOfCats();

            Assert.assertEquals(expectedAmount, actualAmount);




    }
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`

    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
