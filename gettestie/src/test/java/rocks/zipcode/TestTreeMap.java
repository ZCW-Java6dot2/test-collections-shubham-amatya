package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.TreeMap;

public class TestTreeMap {

//    Person person1 = new Person();
//    Person person2 = new Person("Sushim", 1979);
//    Person person3 = new Person("Shubham", 1988);
//    Person person4 = new Person("Sambridh", 2013);

    TreeMap<String, Integer> treeMap = new TreeMap<>();

    @Test
    public void testAdd(){
      treeMap.put("Sadhana", 1950);
      int expected = 1950;
      int actual = treeMap.get("Sadhana");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFloorKey(){
        treeMap.put("I", 1);
        treeMap.put("II", 2);
        treeMap.put("III", 3);
        treeMap.put("IV", 4);

       String expected = "III";
        String actual = treeMap.floorKey("III");
        Assert.assertEquals(expected, actual);

    }

}
