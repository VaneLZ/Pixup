package org.luis.model.agregarDisco;

public class GeneroMusical
{
    private Integer id;
    private String descripcion;

    public GeneroMusical() {
    }

    public GeneroMusical(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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
}
