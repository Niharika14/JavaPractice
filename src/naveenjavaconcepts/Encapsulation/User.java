package naveenjavaconcepts.Encapsulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class User {
    private String username;
    private String password;
    private long phoneNo;
    private boolean isPrime;

    public User(String username, String password, long phoneNo, boolean isPrime) {
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
        this.isPrime = isPrime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public void getUserProfile(){
        System.out.println(username+" "+password+" "+phoneNo+" "+isPrime);
    }
}
