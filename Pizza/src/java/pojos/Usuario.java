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
public class Usuario {
    //private int idusuario;
    private String contraseña;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String tel;
    private String email;
    private String calle;
    private int _num;
    private int cp;
    private String ciudad;

    public Usuario() {}

    public Usuario(String contraseña, String nombre, String apaterno, String amaterno, String tel, String email, String calle, int _num, int cp, String ciudad) {
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tel = tel;
        this.email = email;
        this.calle = calle;
        this._num = _num;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int get_Num() {
        return _num;
    }

    public void set_Num(int _num) {
        this._num = _num;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
