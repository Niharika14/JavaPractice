package naveenjavaconcepts.Encapsulation;

public class LoginPage {

    private String username;
    private String password;

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void doLogin(String un, String pass){
        System.out.println("Logged in with username: "+un+" and password: "+pass);
    }
}
