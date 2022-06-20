package naveenjavaconcepts.Encapsulation;

public class TestUser {
    public static void main(String[] args) {
        User u1= new User("Niharika", "sgif", 78929823, true);
        u1.getUserProfile();
        u1.setPassword("sgit133");
        u1.getUserProfile();

        String s="hello google";
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,10));
        System.out.println(s.indexOf("google"));

    }

}
