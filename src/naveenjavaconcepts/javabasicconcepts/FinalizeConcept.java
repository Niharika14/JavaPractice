package naveenjavaconcepts.javabasicconcepts;

public class FinalizeConcept {
    String name;

    public static void main(String[] args) {
        FinalizeConcept c = new FinalizeConcept();
        c = null;
        System.gc();

    }

    @Override
    public void finalize()
    {
        System.out.println("Compar----");
    }
}
