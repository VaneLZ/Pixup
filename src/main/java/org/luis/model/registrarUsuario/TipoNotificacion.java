package org.luis.model.registrarUsuario;

public class TipoNotificacion
{
    private Integer id;
    private String descripcion;
    private String ruta;

    public TipoNotificacion()
    {
    }

    public TipoNotificacion(Integer id, String descripcion, String ruta) {
        this.id = id;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
