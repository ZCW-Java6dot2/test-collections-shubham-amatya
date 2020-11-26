package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class TestIterator {
    @Test
        public void testIterator(){
        ArrayList<Integer> list = new ArrayList<>();

        Integer [] numList = {2, 9, 3, 4, 5};
        list.addAll(Arrays.asList(numList));

        Iterator<Integer> factory = list.iterator();

        Assert.assertTrue(factory.hasNext());

        Integer expected = 2;
        Integer actual = factory.next();
        Assert.assertEquals(expected, actual);

        Integer expected1 = 9;
        Integer actual1 = factory.next();
        Assert.assertEquals(expected1, actual1);

    }


}
