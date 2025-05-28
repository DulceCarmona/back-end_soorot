-- Lineas para actualizar la tabla usuarios
use soorotdb;
select * from usuarios;
alter table usuarios drop column id;
alter table usuarios rename column usuarioId to id;

-- Lineas para actualizar la tabla productos
select * from productos;
alter table productos rename column productoId to id;

-- Lineas para actualizar la tabla de ordenes
select * from ordenes;
alter table ordenes rename column ordenId to id;
alter table ordenes drop column productosId;

