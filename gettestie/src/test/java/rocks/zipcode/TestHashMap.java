package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {


    HashMap<String, Integer> hashMap = new HashMap<>();

    @Test
    public void addTest(){
        hashMap.put("Sadhana", 1950);
        hashMap.put("Sushim", 1979);
        hashMap.put("Shubham", 1988);
        Assert.assertTrue(hashMap.containsKey("Sadhana"));
    }
    @Test
        public void findByValueTest(){
        hashMap.put("Sadhana", 1950);
        hashMap.put("Sushim", 1979);
        hashMap.put("Shubham", 1988);
        Assert.assertTrue(hashMap.containsValue(1988));
    }

    @Test
    public void getTest(){
        hashMap.put("Sadhana", 1950);
        hashMap.put("Sushim", 1979);
        hashMap.put("Shubham", 1988);
        int expectedBirthYear = 1950;
        int actualBirthYear = hashMap.get("Sadhana");
        Assert.assertEquals(expectedBirthYear, actualBirthYear);
    }

    @Test
    public void removeTest(){
        hashMap.put("Sadhana", 1950);
        hashMap.put("Sushim", 1979);
        hashMap.put("Shubham", 1988);

        int expectedSize = 2;
        hashMap.remove("Shubham");
        int actualSize = 2;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void clearTest(){
        hashMap.put("Sadhana", 1950);
        hashMap.put("Sushim", 1979);
        hashMap.put("Shubham", 1988);
        hashMap.clear();
        Assert.assertTrue(hashMap.isEmpty());
    }

}
