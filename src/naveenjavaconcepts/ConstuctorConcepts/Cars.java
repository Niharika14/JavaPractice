package naveenjavaconcepts.ConstuctorConcepts;

public class Cars {
    String name;
    int price;
    String color;
    String model;
    static final int wheels =4;

    public Cars() {
    }

    public Cars(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Cars(String name, int price, String color, String model) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    public Cars(String name){
        this.name = name;
    }
}
