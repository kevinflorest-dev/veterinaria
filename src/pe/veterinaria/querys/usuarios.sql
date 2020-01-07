/* Creación de tabla */

create table usuarios(
usuario varchar2(50) not null,
clave varchar2(50) not null,
primer_nombre varchar2(50) not null,
segundo_nombre varchar2(50) not null,
apellido_paterno varchar2(50) not null,
apellido_materno varchar2(50) not null,
estado varchar2(1) not null,
fecha_registro DATE,
fecha_modificacion DATE
)

insert into usuarios values ('prueba','123','KEVIN','','FLORES','TARMEÑO','A',sysdate,'')

select * from usuarios