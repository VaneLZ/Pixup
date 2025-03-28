package org.luis.model.crearOrden;

public class Orden
{
    private Integer id;
    private Double costo_total;
    private String fecha;
    private Double cantidad_total;
    private String estatus_envio;
    private Double costo_envio;

    public Orden()
    {
    }

    public Orden(Integer id, Double costo_total, String fecha, Double cantidad_total, String estatus_encvio, Double costo_envio) {
        this.id = id;
        this.costo_total = costo_total;
        this.fecha = fecha;
        this.cantidad_total = cantidad_total;
        this.estatus_envio = estatus_encvio;
        this.costo_envio = costo_envio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Double costo_total) {
        this.costo_total = costo_total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(Double cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public String getEstatus_encvio() {
        return estatus_envio;
    }

    public void setEstatus_encvio(String estatus_encvio) {
        this.estatus_envio = estatus_encvio;
    }

    public Double getCosto_envio() {
        return costo_envio;
    }

    public void setCosto_envio(Double costo_envio) {
        this.costo_envio = costo_envio;
    }
}
