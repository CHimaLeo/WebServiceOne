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
public class Producto {
    //private int idproducto;
    private String nombre;
    private String precio;
    private String descripcion;
    private String restricciones;

    public Producto() {}

    public Producto(/*int idproducto,*/ String nombre, String precio, String descripcion, String restricciones) {
        //this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.restricciones = restricciones;
    }
/*
    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }
    
}
