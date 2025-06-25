class produt {
    private String partA;
    private String partB;
    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }
    public void show() {
        System.out.println("Parts: " + partA + ", " + partB);
    }
}

interface Builder {
    void buildPartA();
    void buildPartB();
    produt getResult();
}

class ConcreteBuilder implements Builder {
    private produt produt = new produt();
    public void buildPartA() { produt.setPartA("Part A"); }
    public void buildPartB() { produt.setPartB("Part B"); }
    public produt getResult() { return produt; }
}

class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        produt produt = builder.getResult();
        produt.show();
    }
}