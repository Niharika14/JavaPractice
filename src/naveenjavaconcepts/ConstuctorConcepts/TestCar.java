package naveenjavaconcepts.ConstuctorConcepts;

public class TestCar {
    public static void main(String[] args) {
    Cars c1 = new Cars();
    Cars c2 = new Cars("BMW");
        System.out.println(c2.name);
    Cars c3 = new Cars("Honda", 30000);
        System.out.println(c3.name+"  "+c3.price);
    }
}
