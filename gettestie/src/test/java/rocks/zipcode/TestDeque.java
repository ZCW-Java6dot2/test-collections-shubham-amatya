package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

    ArrayDeque<Person> deque = new ArrayDeque<Person>();
        Person person1 = new Person("Sadhana", 1950);
        Person person2 = new Person("Sushim", 1979);
        Person person3 = new Person("Shubham", 1988);
        Person person4 = new Person("Sambridh", 2013);

        @Test
        public void testAddDeque(){
            deque.add(person2);
            deque.add(person3);
            deque.addFirst(person1);
            deque.addLast(person4);

            Person expectedFirst = person1;
            Person actualFirst = deque.peekFirst();
            Assert.assertEquals(expectedFirst, actualFirst);

            Person expectedLast = person4;
            Person actualLast = deque.peekLast();
            Assert.assertEquals(expectedLast, actualLast);

        }

    @Test
    public void testRemoveDeque(){
        deque.add(person2);
        deque.add(person3);
        deque.addFirst(person1);
        deque.addLast(person4);

        deque.removeFirst();
        Person expectedFirst = person2;
        Person actualFirst = deque.getFirst();
        Assert.assertEquals(expectedFirst, actualFirst);
    }

    }

