package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {


    Person person1 = new Person("Sadhana", 1950);
    Person person2 = new Person("Sushim", 1979);
    Person person3 = new Person("Shubham", 1988);

    ArrayList<Person> arraylist = new ArrayList<>();

    @Test

    public void addTest() {
        arraylist.add(person1);
        arraylist.add(person2);
        arraylist.add(person3);
        Assert.assertTrue(arraylist.contains(person1));
        Assert.assertTrue(arraylist.contains(person2));
        Assert.assertTrue(arraylist.contains(person3));

    }

    @Test
    public void getTest() {
        arraylist.add(person1);
        arraylist.add(person2);
        arraylist.add(person3);
        Person expectedPerson = person2;
        Person actualPerson = arraylist.get(1);
        Assert.assertEquals(expectedPerson, actualPerson);
    }


    @Test
    public void changeItemTest(){
        arraylist.add(person1);
        arraylist.add(person2);
        arraylist.add(person3);
        Person expectedPerson = person1;
        arraylist.set(0, person3);
        Person actualPerson = person3;
        Assert.assertNotEquals(expectedPerson, actualPerson);
    }

    @Test
    public void removeAllTest(){
        arraylist.add(person1);
        arraylist.add(person2);
        arraylist.add(person3);
        arraylist.removeAll(arraylist);
        Assert.assertTrue(arraylist.isEmpty());
    }

    @Test
    public void sizeTest(){
        arraylist.add(person1);
        arraylist.add(person2);
        arraylist.add(person3);
        arraylist.remove(person3);
        int expectedSize = 2;
        int actualSize = arraylist.size();
        Assert.assertEquals(expectedSize, actualSize);
    }


}
