package lesson3.hw3;

public class Main {
    public static void main(String[] args) {
        Apple app1 = new Apple(1.0f);
        Orange orange1 = new Orange(1.5f);
        System.out.println(app1.getWeight());
        System.out.println(orange1.getWeight());


        FruitBox<Apple> appleBox = new FruitBox<Apple>(app1, 3);
        System.out.println(appleBox.getWeight());
        FruitBox<Orange> orangeBox = new FruitBox<Orange>(orange1, 2);
        System.out.println(orangeBox.getWeight());

        System.out.println();
        System.out.println(orangeBox.compare(appleBox));

    }
    public static void changeArrElements(Object[] array, int a, int b) {
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
