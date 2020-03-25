/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author Leobardo
 */
public class Pedidos {
    private int idpedido;
    private String fecha;
    private String total;

    public Pedidos() {}

    public Pedidos(int idpedido, String fecha, String total) {
        this.idpedido = idpedido;
        this.fecha = fecha;
        this.total = total;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
    
}
