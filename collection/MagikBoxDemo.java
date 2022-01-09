package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MagikBoxDemo {
    public static void main(String[] args) {
        MagikBox magikBox = new MagikBox();

        magikBox.setObject(1);
        System.out.println(magikBox.getObject());

        magikBox.setObject(LocalDate.now());
        System.out.println(magikBox.getObject());

        magikBox.setObject(new ArrayList<String>(Arrays.asList("focus", "pocus", "spell")));
        System.out.println(magikBox.getObject());

        MagikBoxGeneric<MagikBoxGeneric> magikBoxInt = new MagikBoxGeneric<>();
        MagikBoxGeneric<Hare> magikBoxInt2 = new MagikBoxGeneric<>();
        magikBoxInt2.setObject(new Hare());
        magikBoxInt.setObject(magikBoxInt2);

        System.out.println(magikBoxInt.getObject().getObject());

        MagikBoxBounded boxBounded = new MagikBoxBounded();
        boxBounded.setObject(new Bird());

        MagikBoxBounded<Bird> boxBounded1 = new MagikBoxBounded<>();
        boxBounded1.setObject(new Pigeon());
        System.out.println();
    }
}

class MagikBox{
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

class MagikBoxBounded<T extends Bird>{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

