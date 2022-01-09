package collection;

public class MagikBoxPaire {
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>(1, "Line");
        System.out.printf("First: %d, Second: %s", box.getFirst(), box.getSecond());
        System.out.println();
        MagikBoxGeneric<Bird> magikBox1 = new MagikBoxGeneric<>();
        Bird bird = new Bird();
        magikBox1.setObject(bird);

        MagikBoxGeneric<Bird> magikBox2 = new MagikBoxGeneric<>();
        Bird bird2 = new Bird();
        magikBox1.setObject(bird2);
        System.out.println(Magician.Compare(magikBox1,magikBox2));

        Hare hare = new Hare();
        MagikBoxGeneric<Hare> magikBox3 = new MagikBoxGeneric<>();
        magikBox3.setObject(hare);
        Magician.print(magikBox2);
    }
}
class Box<S,T>{
    private S first;
    private T second;

    public Box(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
class Magician{
   public static <T> boolean Compare(MagikBoxGeneric<T> box1, MagikBoxGeneric<T> box2){
       return box1.getObject().equals(box2.getObject());
   }
    public static void print(MagikBoxGeneric<? extends Bird> box){
        System.out.println(box.getObject().toString());
   }
    public static void print2(MagikBoxGeneric<? super Bird> box){
        System.out.println(box.getObject().toString());
    }
}