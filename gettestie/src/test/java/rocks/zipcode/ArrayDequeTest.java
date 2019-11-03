package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    @Test
    public void dequeTest(){
        Deque<Integer> countTen = new ArrayDeque<Integer>(5);
        countTen.add(10);
        countTen.add(20);
        countTen.add(30);
        countTen.add(40);
        countTen.add(50);
        countTen.pop();
        Integer actual = countTen.peek();
        Integer expected= 20;
        Assert.assertEquals(expected, actual);


    }

}

