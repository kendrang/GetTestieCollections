package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest {

    @Test
        public void hashMapTest() {
        Map<String, String> videoGames = new HashMap<String, String>();
        videoGames.put("Mario", "Mario Odyssey");
        videoGames.put("Luigi","Luigi's Mansion");
        videoGames.put("Wario","WarioWare");
        String actual = videoGames.values().toString();
        Assert.assertEquals("[Luigi's Mansion, WarioWare, Mario Odyssey]", actual);



    }
}
