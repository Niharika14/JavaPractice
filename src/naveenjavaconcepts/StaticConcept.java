package naveenjavaconcepts;

public class StaticConcept {
    String name;
    int price;
    String color;
    static final int wheel = 4;

    public static void start(){
        System.out.println("Start---");
    }

    public void stop(){
        System.out.println("Stop---");
    }

    public static void main(String[] args) {
        StaticConcept sc = new StaticConcept();
        sc.name = "Toyota";
        sc.price = 30000;
        sc.color = "Black";
        System.out.println(sc.name+" "+sc.price+" "+sc.color+" "+wheel);
        sc.stop();
        start();

        StaticConcept sc1 = new StaticConcept();
        sc1.name = "Honda";
        sc1.price = 20000;
        sc1.color = "White";
        System.out.println(sc1.name+" "+sc1.price+" "+sc1.color+" "+StaticConcept.wheel);
        sc1.stop();
        StaticConcept.start();
    }
}
