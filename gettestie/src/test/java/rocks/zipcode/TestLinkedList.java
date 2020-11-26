package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    LinkedList<Person> linkedList = new LinkedList<>();
    Person person1 = new Person("Sadhana", 1950);
    Person person2 = new Person("Sushim", 1979);
    Person person3 = new Person("Shubham", 1988);
    Person person4 = new Person("Sambridh", 2013);


    public void add() {
        linkedList.add(person1);
        linkedList.add(person2);
        linkedList.add(person3);
    }

    @Test
    public void addTest() {
        linkedList.add(person1);
        linkedList.add(person2);
        linkedList.add(person3);
        Assert.assertTrue(linkedList.contains(person1));
        Assert.assertTrue(linkedList.contains(person2));
        Assert.assertTrue(linkedList.contains(person3));
    }

    @Test
    public void addFirstTest() {
        add();
        linkedList.addFirst(person4);
        Person expectedPerson = person4;
        Assert.assertEquals(linkedList.get(0), expectedPerson);
    }

    @Test
    public void addLastTest(){
        add();
        linkedList.addLast(person4);
        Person expectedPerson = person4;
        Assert.assertEquals(linkedList.get(linkedList.size()-1), expectedPerson);
    }

}

