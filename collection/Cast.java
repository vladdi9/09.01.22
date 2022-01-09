package collection;

import java.util.ArrayList;
import java.util.List;

public class Cast {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(new String("Done!"));
        list.add(new Pigeon());
        for (Object object:list){
            //System.out.println(object);
            //System.out.println((String) object);
            List<Integer> list2 = new ArrayList<>();
            list2.add(20);
            //list2.add(new String("New string"));
            list2.forEach(System.out::println);
        }
    }
}

