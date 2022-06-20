package naveenjavaconcepts.javabasicconcepts;
public class ReferenceConcept {
    String name;
    int age;
    String city;
    double salary;
    boolean isActive;

    public static void main(String[] args) {
        ReferenceConcept rc = new ReferenceConcept();
        rc.name="testing";
        rc.age=30;
        rc.city="pune";
        rc.salary=34.223;
        rc.isActive=true;
        System.out.println(rc.name+" "+rc.age+" "+rc.city+" "+rc.salary+" "+rc.isActive);

        ReferenceConcept rc1 = new ReferenceConcept(); // With Default Value
        System.out.println(rc1.name+" "+rc1.age+" "+rc1.city+" "+rc1.salary+" "+rc1.isActive);

        rc1 = null;
        //System.out.println(rc1.name+" "+rc1.age+" "+rc1.city+" "+rc1.salary+" "+rc1.isActive); //NullPointerException

        new ReferenceConcept().name = "Niharika";

    }

}
