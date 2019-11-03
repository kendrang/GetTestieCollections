package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void vectorTest(){
        Vector<String> ourVector = new Vector<String>();
        ourVector.add("Marble");
        ourVector.add("Kermit");
        ourVector.add("Peach");
        ourVector.add("Bunny");
        ourVector.removeElementAt(3);
        boolean actual = ourVector.contains("Bunny");
        Assert.assertEquals(false, actual);



    }
}
