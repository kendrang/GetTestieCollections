package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class IteratorTest {
    @Test
    public void iteratortest1() {
        java.util.ArrayList<String> dogs = new java.util.ArrayList<String>();
        dogs.add("Kermit");
        dogs.add("Peach");
        dogs.add("Marble");
        dogs.add("Bunny");
        Iterator myIterator = dogs.iterator();
        myIterator.next();
        myIterator.next();
        String actual = (String) myIterator.next();
        Assert.assertEquals("Marble",actual);


    }
}
