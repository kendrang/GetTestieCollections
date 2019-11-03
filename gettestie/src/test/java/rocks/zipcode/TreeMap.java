package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.SortedMap;

public class TreeMap {

    @Test
        public void testingputTreeMap() {
        SortedMap<String, String> myPets = new java.util.TreeMap<>();
        myPets.put("Doggie", "Dog");
        myPets.put("Kitty","Cat");
        Boolean actual = myPets.isEmpty();
        Assert.assertEquals(false, actual);

    }

    @Test
    public void testingTreeMap(){
        SortedMap<String, Integer> grades = new java.util.TreeMap<>();
        grades.put("Claire", 90);
        grades.put("Chris", 100);
        grades.put("Brad", 80);
        grades.put("Emile", 95);
        String actual =grades.firstKey();
        Assert.assertEquals("Brad",actual );
        // orders in alphabetical automatically
    }
}
