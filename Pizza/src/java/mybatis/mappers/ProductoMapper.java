/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

import java.util.List;
import pojos.Mensaje;
import pojos.Pedido;
import pojos.Producto;
import pojos.Registra;
import pojos.Res;

/**
 *
 * @author Leobardo
 */
public interface ProductoMapper {
    public List<Producto> getAllProductos();
    public List<Producto> getProductoDetalle(Integer id);
    public List<Pedido> getPedidoDetalle(Integer id);
    public List<Pedido> getPedido(Integer id);
    public List<Mensaje> getID();
    public int getUltimo();
    public List<Res> getIngresa(Integer id);
    public void RegistroU(
            String contraseña,
            String nombre,
            String apaterno,
            String amaterno,
            String tel,
            String email,
            String calle,
            Integer _num,
            Integer cp,
            String ciudad);
}
