package bru.rrhh.candidates;

/**
 * Created by mcanovas on 15/03/2018.
 */


        import javax.faces.application.FacesMessage;
        import javax.faces.bean.ManagedBean;
        import javax.faces.context.FacesContext;

@ManagedBean
public class SpotlightView {

    private String clave;

    private String email;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void save() {
        clave = null;
        email = null;



            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Bienvenido"));


    }
}





