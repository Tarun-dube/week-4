package SmartWarehouseManagementSystem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseManagementTest {

    @Test
    public void addItemTest(){
        Storage<Electronics>electronics = new Storage<>();
        Electronics e=new Electronics("mobile",1,10000);
        electronics.add(e);
        assertTrue(electronics.getItems().contains(e));
        assertEquals(1,electronics.getItems().size());
    }

    @Test
    public void removeItemTest(){
        Storage<Electronics>electronics = new Storage<>();
        Electronics e=new Electronics("mobile",1,10000);
        electronics.add(e);
        electronics.remove(e);
        assertFalse(electronics.getItems().contains(e));
        assertEquals(0,electronics.getItems().size());
    }

    @Test
    public void displayItemsTest(){
        Storage<Grocery>groceries = new Storage<>();
        Grocery g=new Grocery("milk",1,30);
        groceries.add(g);


        List<Grocery> groceryList = groceries.getItems();
        assertTrue(groceryList.contains(g));
        assertEquals(1,groceryList.size());
        assertEquals("milk",groceryList.get(0).getName());
        assertEquals(30,groceryList.get(0).getPrice());
        assertEquals(1,groceryList.get(0).getQuantity());




    }
}