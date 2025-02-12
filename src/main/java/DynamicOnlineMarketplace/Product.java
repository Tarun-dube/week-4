package DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class Product<T extends Category> {
    private List<T> list=new ArrayList<>();

    public void addCategory(T t) {
        list.add(t);
    }
    public void removeCategory(T t) {
        list.remove(t);
    }

    public List<T> getList() {
        return list;
    }
    public void display() {
        for (T t : list) {
            t.displayDetails();
        }
    }
}



