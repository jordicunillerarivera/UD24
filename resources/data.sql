
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	puesto ENUM('RRHH', 'Administracion', 'Ventas', 'Marqueting', 'Mozo'),
	salario integer,
	direccion varchar(250),
	dni integer,
	fecha date
);

insert into empleado (nombre, apellido,puesto,salario,direccion,dni,fecha)values('Jose','Marin','RRHH', '2000','calle imaginaria 1',123456789, NOW());
insert into empleado (nombre, apellido,puesto,salario,direccion,dni,fecha)values('Juan','Lopez','Ventas', '1800','calle imaginaria 2',122222222, NOW());
insert into empleado (nombre, apellido,puesto,salario,direccion,dni,fecha)values('Pedro','Guillem','Administracion', '2100','calle imaginaria 3',123333333, NOW());
insert into empleado (nombre, apellido,puesto,salario,direccion,dni,fecha)values('Jordi','Martin','Mozo', '1500','calle imaginaria 4',123444444, NOW());
insert into empleado (nombre, apellido,puesto,salario,direccion,dni,fecha)values('Jonatan','Vicente','Marqueting', '1700','calle imaginaria 5',123455555, NOW());