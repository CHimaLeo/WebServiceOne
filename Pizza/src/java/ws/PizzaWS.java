/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Pedido;
import pojos.Pedidos;
import pojos.Producto;
import pojos.Productos;
import pojos.Registra;
import pojos.Res;
import pojos.Usuario;

/**
 * REST Web Service
 *
 * @author Leobardo
 */
@Path("pizzahome")
public class PizzaWS {
    
    @Path("productos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Productos> getAllBd(){
        List<Productos> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null){
            try{
                list = conn.selectList("Producto.getAllProductos");
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                conn.close();
            }
        }
        return list;
    }
    
    @Path("detalles/{idproducto}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getProductoDetalle(@PathParam("idproducto") Integer idproducto) {
        List<Producto> list = null;
        SqlSession conn = mybatis.MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Producto.getProductoDetalle", idproducto);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    
    @Path("pedido/{idpedido}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> getPedidoDetalle(@PathParam("idpedido") Integer idpedido) {
        List<Pedido> list = null;
        SqlSession conn = mybatis.MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Producto.getPedidoDetalle", idpedido);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    
    @Path("pedidos/{idusuario}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedidos> getPedido(@PathParam("idusuario") Integer idusuario) {
        List<Pedidos> list = null;
        SqlSession conn = mybatis.MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Producto.getPedido", idusuario);
                System.out.println(list);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    
    @Path("id")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Mensaje> getID(){
        List<Mensaje>  list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null){
            try{
                list = conn.selectList("Producto.getID");
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                conn.close();
            }
        }
        return list;
    }
    
    //@Path("ultimo")
    //@GET
    //@Produces(MediaType.APPLICATION_JSON)
    public int getUltimo(){
        int  id = 0;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null){
            try{
                id = conn.selectOne("Producto.getUltimo");
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                conn.close();
            }
        }
        return id;
    }
    
    @Path("entra/{idusuario}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Res> getIngresa(@PathParam("idusuario") Integer idusuario) {
        List<Res> list = null;
        SqlSession conn = mybatis.MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Producto.getIngresa",idusuario);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    
    @POST
    @Path("registro")
    @Produces (MediaType.APPLICATION_JSON)
    public String RegistroU(
            @FormParam("contraseña") String contraseña,
            @FormParam("nombre") String nombre,
            @FormParam("apaterno") String apaterno,
            @FormParam("amaterno") String amaterno,
            @FormParam("tel") String tel,
            @FormParam("email") String email,
            @FormParam("calle") String calle,
            @FormParam("_num") Integer _num,
            @FormParam("cp") Integer cp,
            @FormParam("ciudad") String ciudad){
    
        String msj = null;
        int id = 1+getUltimo();
        Usuario u = new Usuario (contraseña,nombre,apaterno,amaterno,tel,email,calle,_num,cp,ciudad);
        SqlSession conn = MyBatisUtil.getSession();
        try{
            conn.insert("Producto.RegistroU", u);
            System.out.println(u);
            conn.commit();
            msj = "Usuario Registrado Exitosamente "+
                    "\n Bienbenido Este Es Tu Numero De Usuario\n\t\t\t "+id;
        }catch(Exception ex){
            msj = ex.getMessage();
        }finally{
                conn.close();
        }
        return msj;        
    }
    
}


