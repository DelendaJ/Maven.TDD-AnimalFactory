package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        // Given
        String givenName = "Killer Bitch";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setBirthDate() {
        //Given
        Dog dog = new Dog(null, null, null);

        //When
        Date date = new Date(100L);
        dog.setBirthDate(date);


        //Then
        Date actual = dog.getBirthDate();
        Date expected = new Date(100L);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void eat() {
        //Given
        Dog dog = new Dog(null, null, null);

        //When
        dog.eat(new Food());

        //Then
        Integer actual = dog.getNumberOfMealsEaten();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        //Given
        Dog dog = new Dog(null, null, 482);

        //When
        int actual = dog.getId();

        //Then
        int expected = 482;
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void speak() {
        //Given
        Dog dog = new Dog(null, null, null);
        String expectedSpeak = "bark!";

        //When
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }

    @Test
    public void testInstanceOfMammal() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testInstanceOAnimal() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
    }

}




