package SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem>{


 List<T> l=new ArrayList<>();

 public void add(T item){
     l.add(item);
 }
 public void remove(T item){
     l.remove(item);
 }

 public List<T> getItems(){
     return l;
 }

}

class WarehouseUtil{
    public static void displayItems(List<? extends WarehouseItem> l){
        for(WarehouseItem i : l){
            System.out.println(i.getName());
        }

    }
}