package naveenjavaconcepts;

public class Users {
    String name;
    int age;

    public static void main(String[] args) {
        Users u1 = new Users();
        u1.name = "Niharika";
        u1.age = 30;
        System.out.println("u1 : "+u1.name+"  "+u1.age);

        Users u2 = new Users();
        u2.name = "Neha";
        u2.age = 25;
        System.out.println("u2 : "+u2.name+"  "+u2.age);

        Users u3 = new Users();
        u3.name = "Neeha";
        u3.age = 20;
        System.out.println("u3 : "+u3.name+"  "+u3.age);

        System.out.println("---------u1=u2-----------");
        u1 = u2;
        System.out.println("u1 : "+u1.name+"  "+u1.age);
        System.out.println("u2 : "+u2.name+"  "+u2.age);
        System.out.println("u3 : "+u3.name+"  "+u3.age);

        System.out.println("---------u2=u3-----------");
        u2 = u3;
        System.out.println("u1 : "+u1.name+"  "+u1.age);
        System.out.println("u2 : "+u2.name+"  "+u2.age);
        System.out.println("u3 : "+u3.name+"  "+u3.age);

        System.out.println("---------u3=u1-----------");
        u3 = u1;
        System.out.println("u1 : "+u1.name+"  "+u1.age);
        System.out.println("u2 : "+u2.name+"  "+u2.age);
        System.out.println("u3 : "+u3.name+"  "+u3.age);
    }
}
