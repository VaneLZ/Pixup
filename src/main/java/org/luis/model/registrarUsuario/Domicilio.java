package org.luis.model.registrarUsuario;

public class Domicilio
{
    private Integer id;
    private String calle;
    private String numero_exterior;
    private Municipio numero_interior;

    public Domicilio()
    {
    }

    public Domicilio(Integer id, String calle, String numero_exterior, Municipio numero_interior) {
        this.id = id;
        this.calle = calle;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero_exterior() {
        return numero_exterior;
    }

    public void setNumero_exterior(String numero_exterior) {
        this.numero_exterior = numero_exterior;
    }

    public Municipio getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(Municipio numero_interior) {
        this.numero_interior = numero_interior;
    }
}
