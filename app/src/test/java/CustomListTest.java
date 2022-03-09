

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }
    @Test
    public void addCityTest(){
        createList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }
}
