package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable {
    @Test
    public void comparableTest() {

            Integer p1 = new Integer(2000);
            Integer p2 = new Integer(1992);
            Integer p3 = new Integer(1998);
            ArrayList<Integer> years = new ArrayList<Integer>();
            years.add(p1);
            years.add(p2);
            years.add(p3);
        Collections.sort(years);
        String result = years.toString();
        Assert.assertEquals("[1992, 1998, 2000]",years.toString());
        }
    }

