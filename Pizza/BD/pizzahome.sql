create database if not exists pizzahome;
use pizzahome;

drop table if exists usuario;
create table usuario (
	idusuario int primary key,
    contraseña varchar (5) not null,
    nombre varchar (20) not null,
    apaterno varchar (20) not null,
    amaterno varchar (20) not null,
    tel varchar (10) null,
    email varchar (45) not null,
    calle varchar (20) not null,
    _num int not null,
	cp int (5) not null,
    ciudad varchar (20) not null
    )engine = innodb;

drop table if exists producto;
create table producto (
	idproducto int primary key,
    nombre varchar (45) not null,
    precio varchar (45) not null,
    descripcion varchar (255) not null,
    restricciones varchar (45) null
    )engine = innodb;

drop table if exists pedido;
create table pedido (
	idpedido int primary key,
    fecha varchar (45) not null,
    cantidad int not null,
    total varchar (45) not null,
    idproducto int not null,
    idusuario int not null,
    index (idproducto),
    index (idusuario),
    foreign key (idproducto) references producto(idproducto),
    foreign key (idusuario) references usuario(idusuario)
    )engine = innodb;
    
     -- drop database pizzahome;
/*
-- detalle de pedido
select fecha, cantidad, total, nombre 
from pedido
INNER JOIN producto
ON pedido.idproducto = producto.idproducto and pedido.idpedido = 1; 

-- historial de pedidos
SELECT idpedido,fecha,total
FROM pedido
where idusuario = 1;
SELECT idpedido,fecha,total
FROM pedido
LEFT JOIN usuario
ON pedido.idusuario = usuario.idusuario and pedido.idusuario = 1;

select idusuario from usuario where idusuario = 1 and contraseña = '12345';

insert into producto (nombre,precio,descripcion,restricciones) 
values ('Normal','$ 100','Pastor','No Aplica');

insert into pedido (fecha,cantidad,total,idproducto,idusuario) 
    values ('14-06-2017','1','$ 200',1,1);
    
    SELECT MAX(usuario.idusuario) AS idusuario FROM usuario;
    
    select * from usuario;

insert into usuario (contraseña,nombre,apaterno,amaterno,tel,email,calle,_num,cp,ciudad) 
values ('12345','Rodrigo','Perez','Perez','2282156709','Rodrigo@gmail.com','Juarez',65,47478,'Xalapa');
*/

/*    
    insert into usuario (contraseña,nombre,apaterno,amaterno,tel,email,calle,num,cp,ciudad) 
    values ('hola','Juan','Perez','Perez','0123456789','johoo@gmail.com','Nose',65,47478,'Xalapa');

    insert into producto (nombre,precio,descripcion,restricciones) 
    values ('Famili','$200','PIña, Queso y Peperoni','50% Descuento');
    
    insert into pedido (fecha,cantidad,total,idproducto,idusuario) 
    values ('4-06-2017','2','400',1,1);
    
    SELECT MAX(idusuario) AS idusuario FROM usuario;
    SELECT @@identity AS idusuario;
    
    Select * from producto where  descripcion is not null; 
	select * from usuario where contraseña = 'hola' and email = 'johoo@gmail.com';
   select nombre,apaterno,amaterno from usuario where email = 'j@gmail.com'and contraseña = 'hola';
   select * from producto where idproducto = 3;     
--   select fecha, cantidad, total from pedido where idpedido = 1;
-- drop database pizzahome;
*/