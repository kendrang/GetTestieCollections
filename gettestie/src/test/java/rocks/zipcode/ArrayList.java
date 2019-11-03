package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;


public class ArrayList {

    @Test
    public void arrayListSizeTest() {
        java.util.ArrayList<String> pets = new java.util.ArrayList<String>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Bird");
        pets.add("Hamster");
        int actual = pets.size();
        Assert.assertEquals(4, actual);
    }
    @Test
    public void arrayListremoveTest(){
        java.util.ArrayList<String> people = new java.util.ArrayList<String>();
        people.add("Brad");
        people.add("Claire");
        people.add("Chris");
        people.add("Emile");
        people.add("Gabbi");
        people.remove("Emile");
        Boolean actual = people.contains("Emile");
        Assert.assertEquals(false, actual);






    }

}
