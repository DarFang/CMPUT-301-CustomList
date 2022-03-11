import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
        }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }
    @Test
    public void testHasCity(){
        City city = new City("Regina", "SK");
        assertEquals(false, list.hasCity(city));
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }
}
