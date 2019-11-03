package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class linkedListTest {

    @Test
    public void linkedListTest(){
        LinkedList<String> heightList = new LinkedList<>();
        heightList.add("son");
        heightList.add("daughter");
        heightList.add("dog");
        heightList.addFirst("Mom");
        heightList.addLast("Goldfish");
        int actual = heightList.indexOf("son");
        Assert.assertEquals(1,actual);

    }


}
