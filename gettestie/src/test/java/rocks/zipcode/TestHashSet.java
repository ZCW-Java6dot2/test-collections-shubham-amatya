package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Person;

import java.util.HashSet;


public class TestHashSet {
    HashSet<Person> hashSet = new HashSet<>();

    Person person1 = new Person ("Prajwal", 1984);
    Person person2 = new Person("Pragya", 1986);
    Person person3 = new Person("Bindu", 1966);



    @Test
    public void hashSetAddTest(){

        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        int expectedElementCount = 3;
        int actualElementCount = hashSet.size();
        Assert.assertEquals(actualElementCount, expectedElementCount);

    }

    @Test
    public void hashSetRemoveTest(){

        hashSet.removeAll(hashSet);
        Assert.assertTrue(hashSet.isEmpty());
    }

    @Test
    public void containsTest(){
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        Assert.assertTrue(hashSet.contains(person1));
        Assert.assertTrue(hashSet.contains(person2));
        Assert.assertTrue(hashSet.contains(person3));
    }

}
