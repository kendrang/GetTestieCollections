package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashset {

    @Test
    public void hashSetEmtpyTest () {
        Integer arr[] = {10,28,1992,27};
        Set<Integer> coolNumbers = new HashSet<>(Arrays.asList(arr));
        coolNumbers.clear();
        Boolean actual = coolNumbers.isEmpty();
        Assert.assertEquals(true,actual);

    }

    @Test
    public void hashSetAddTest() {
        Integer birthdayStuff[] = {10,28,1992,27};
        Set<Integer> birthday = new HashSet<>(Arrays.asList(birthdayStuff));
        int beforesize = birthday.size();
        birthday.add(92);
        int actual = birthday.size();
        int expected = beforesize+1;
        Assert.assertEquals(expected,actual);



    }

}
