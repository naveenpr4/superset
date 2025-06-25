interface Product {
    void produce();
}

class ConcreteProductA implements Product {
    public void produce() {
        System.out.println("Product A created");
    }
}

class ConcreteProductB implements Product {
    public void produce() {
        System.out.println("Product B created");
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMain {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.produce();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.produce();
    }
}