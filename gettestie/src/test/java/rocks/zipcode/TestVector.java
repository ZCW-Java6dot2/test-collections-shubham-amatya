package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    Vector<Person> vector = new Vector<>();
    Person person1 = new Person("Sadhana", 1950);
    Person person2 = new Person("Sushim", 1979);
    Person person3 = new Person("Shubham", 1988);
    Person person4 = new Person("Sambridh", 2013);

    @Test
    public void testVectorAdd(){
        vector.add(person1);
        Person expectedPerson = person1;
        Person actualPerson = vector.firstElement();
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void testVectorRemove(){
        vector.add(person1);
        vector.add(person2);
        vector.remove(person1);
        int sizeExpected = 1;
        int sizeActual = vector.size();
        Assert.assertEquals(sizeExpected, sizeActual);
    }

    @Test
    public void testVectorSet(){
        vector.add(person1);
        vector.add(person2);
        vector.set(1, person4);
        Person expectedPerson = person4;
        Person actualPerson = vector.lastElement();
        Assert.assertEquals(expectedPerson, actualPerson);
    }

}
