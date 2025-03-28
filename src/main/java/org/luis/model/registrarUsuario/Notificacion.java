package org.luis.model.registrarUsuario;

public class Notificacion
{
    private String id;
    private String fecha;

    public Notificacion()
    {
    }

    public Notificacion(String id, String fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

