package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.security.PublicKey;
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
    public void testGetSetName() {
        //Given
        Cat cat = new Cat(null, null, null);
        String expectedName = "Claws McGee";

        //When
        cat.setName(expectedName);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }


    @Test
    public void getBirthDate() {

        //Given
        Date date = new Date(1000000L);
        Cat cat = new Cat(null, date, null);
        Date expectedBirthDate = new Date(1000000L);

        //When

        //Then
        Date actualBirthDate = cat.getBirthDate();
        Assert.assertEquals(actualBirthDate, expectedBirthDate);



    }

    @Test
    public void setBirthDate() {
        //Given
        Cat cat = new Cat(null, null, null);


        //When
        Date date = new Date(1000000L);
        cat.setBirthDate(date);

        //Then
        Date actual = cat.getBirthDate();
        Date expected = new Date(1000000L);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfMealsEaten() {

        //Given
        Cat cat = new Cat(null, null, null);

        //Then
        Integer actual = cat.getNumberOfMealsEaten() ;
        Integer expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void eat() {
        //Given
        Cat cat = new Cat (null, null, null);

        //When
        cat.eat(new Food());

        //Then
        Integer actual = cat.getNumberOfMealsEaten();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        //Given
        Cat cat = new Cat (null, null, 482);

        //When
        int actual = cat.getId();

        //Then
        int expected = 482;
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void speak() {
        //Given
        Cat cat = new Cat(null, null, null);
        String expectedSpeak = "meow!";

        //When
        String actualSpeak = cat.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }

    @Test
    public void testInstanceOfMammal() {
        Cat cat = new Cat (null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void testInstanceOAnimal() {
        Cat cat = new Cat (null, null, null);
        Assert.assertTrue(cat instanceof Animal);
    }

}









