package org.luis.model.crearOrden;

public class pago
{
    private Integer id;
    private char numero_tarjeta;
    private Double monto;
    private String fecha;

    public pago()
    {
    }

    public pago(Integer id, char numero_tarjeta, Double monto, String fecha) {
        this.id = id;
        this.numero_tarjeta = numero_tarjeta;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public char getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(char numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
