package ListInterface.RotateElement;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.rotate;

public class RotateElement {

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        rotate(list,2);
        System.out.println("After rotating element:");
        System.out.println(list);

    }
}
