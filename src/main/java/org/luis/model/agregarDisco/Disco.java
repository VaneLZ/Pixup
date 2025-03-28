package org.luis.model.agregarDisco;

public class Disco
{
    private Integer id;
    private String titulo;
    private Double precio;
    private Integer existencia;
    private Double descuento;
    private String fecha;
    private String imagen;

    public Disco()
    {
    }

    public Disco(Integer id, String titulo, Double precio, Integer existencia, Double descuento, String fecha, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.existencia = existencia;
        this.descuento = descuento;
        this.fecha = fecha;
        this.imagen = imagen;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
