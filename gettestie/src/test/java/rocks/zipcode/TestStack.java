package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void popStackTest() {
        Stack<String> strings = new Stack<>();
        strings.push("Hello World");
        strings.push("Goodbye Sun");
        strings.pop();
        strings.pop();
        assertEquals(true, strings.isEmpty());
    }

   @Test
    public void peekStackTest() {
       Stack<String> strings = new Stack<>();
       strings.push("Hello World");
       strings.push("Goodbye Sun");
       strings.peek();
       assertEquals("Goodbye Sun", strings.peek());

   }
}
