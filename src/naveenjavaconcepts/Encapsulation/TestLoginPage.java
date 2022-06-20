package naveenjavaconcepts.Encapsulation;

public class TestLoginPage {
    public static void main(String[] args) {
        LoginPage lp1 = new LoginPage();
        lp1.setUsername("niharikajain");
        lp1.setPassword("Sgi131");

        lp1.doLogin(lp1.getUsername(),lp1.getPassword());
    }
}
