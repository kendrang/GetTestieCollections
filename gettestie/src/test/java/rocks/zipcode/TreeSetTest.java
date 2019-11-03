package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void treeSetTest(){
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Oak");
        tree.add("Birch");
        tree.add("Pine");
        tree.add("Maple");
        String actual = tree.last();
        Assert.assertEquals("Pine",actual);
    }
}
