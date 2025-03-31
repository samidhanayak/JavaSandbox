package mar29.GenericDemo;

public class Box<T,U> {
    T item1;
    U item2;

    public Box(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }

    public static void main(String[] args) {
         Box box1 = new Box("item1",12.12);

        System.out.println(box1);
        System.out.println(box1.item1);
        System.out.println(box1.item2);

        Box box2 = new Box(true,10);

        System.out.println(box2.toString());
    }
}
