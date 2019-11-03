package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class PriorityQueue {
    @Test
    public void priorityQueueTest() {
        java.util.PriorityQueue<String> meals = new java.util.PriorityQueue<String>();
        meals.add("Breakfast");
        meals.add("Lunch");
        meals.add("Dinner");
        meals.add("Dessert");
        String actual = meals.peek();
        Assert.assertEquals("Breakfast",actual);
    }
}
