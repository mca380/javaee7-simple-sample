package bru.rrhh.candidates;


        import java.io.Serializable;

/**
 * Created by mcanovas on 14/03/2018.
 */



public class User implements Serializable {

    private String firstname;

    private String lastname;


    private String info;

    private String email;

    private String pass;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }


}