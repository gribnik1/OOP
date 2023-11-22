import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Integer variable1 = 10;
        Cat variable2 = new Cat("Tom");
        Double variable3 = 3.14;

        ThreeParamsClass<Integer, Cat, Double> threeParamsClass = new ThreeParamsClass<>(variable1, variable2, variable3);
        threeParamsClass.printClassNames();
    }
}

class Animal {
    // Код класса Animal
}

class Cat extends Animal implements Serializable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    // Код класса Cat
}