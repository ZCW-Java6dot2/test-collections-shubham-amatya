package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

public class TestTreeSet {

    Integer[] list = {9, 4, 99, 1, 72};
    TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(list));

    @Test
    public void testTreeSet() {
        Integer expectedSize = 5;
        Integer actualSize = treeSet.size();
        Assert.assertEquals(expectedSize, actualSize);


        Integer expectedPollFirst = 1;
        Integer actualPollFirst = treeSet.pollFirst();
        Assert.assertEquals(expectedPollFirst, actualPollFirst);



        Integer expectedFirst = 4;
        Integer actualFirst = treeSet.first();
        Assert.assertEquals(expectedFirst, actualFirst);
    }
}
