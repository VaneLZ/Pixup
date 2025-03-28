package org.luis.model.agregarDisco;

public class Cancion
{
    private Integer id;
    private String titulo;
    private String duracion;

    public Cancion() {
    }

    public Cancion(Integer id, String titulo, String direccion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return duracion;
    }

    public void setDireccion(String direccion) {
        this.duracion = direccion;
    }
}
