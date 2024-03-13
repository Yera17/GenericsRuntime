public class Main {
    public static void main(String a[]) {
//        // параметризируем класс типом String
//        Box<String> sample1 = new Box<>("Runtime");
//        System.out.println(sample1);
//        // параметризируем класс типом Integer
//        // ошибка была в том, что в скобках был неправильно указан тип
//        Box<Integer> sample2 = new Box<>(1);
//        System.out.println(sample2);
//        // параметризируем класс типом Boolean
//        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
//        System.out.println(sample3);

//        // параметризируем класс типом String для ключа и значения
//        Item<String, String> sample1 = new Item<>("имя", "Runtime");
//        System.out.println(sample1);
//        // параметризируем класс типом Integer для ключа и Boolean для значения
//        Item<Integer, Boolean> sample2 = new Item<>(1, Boolean.TRUE);
//        System.out.println(sample2);

        FruitBox<String, Banana> bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitBox<String, Apple> appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}