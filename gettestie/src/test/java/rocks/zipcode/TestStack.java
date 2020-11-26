package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class TestStack {

    Stack<Person> stack = new Stack<>();

    Person person1 = new Person("Sadhana", 1950);
    Person person2 = new Person("Sushim", 1979);


    @Test
    public void testPush(){
        stack.push(person1);
        Person expected = person1;
        Person actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPop(){
        stack.push(person1);
        stack.push(person2);
        stack.pop();
        Person expected = person1;
        Person actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEmpty(){
        stack.push(person1);
        stack.push(person2);
        stack.clear();
        Assert.assertTrue(stack.isEmpty());
    }

}
