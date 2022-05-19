SELECT * FROM proyectos.proyecto;DROP DATABASE IF EXISTS investigadores;
CREATE DATABASE investigadores;
USE investigadores;


DROP TABLE IF EXISTS facultad;
CREATE TABLE facultad(
id int AUTO_INCREMENT PRIMARY KEY,
nombre nvarchar(100)  not null
);
DROP TABLE IF EXISTS investigadores;
CREATE TABLE investigadores(
id int AUTO_INCREMENT PRIMARY KEY,
nomapels nvarchar(255)  not null,
facultad int,
CONSTRAINT FK_facultad FOREIGN KEY (facultad)
REFERENCES facultad(id)
ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS equipos;
CREATE TABLE equipos(
id int AUTO_INCREMENT PRIMARY KEY,
nombre nvarchar(100)  not null,
facultad int,
CONSTRAINT FK_facultadd FOREIGN KEY (facultad)
REFERENCES facultad(id)
ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS reserva;
CREATE TABLE reserva(id INT AUTO_INCREMENT primary key,
dni int,
numserie int,
comienzo datetime,
fin datetime,
CONSTRAINT FK_dni FOREIGN KEY (dni)
REFERENCES investigadores(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_numserie FOREIGN KEY (numserie)
REFERENCES equipos(id)
ON DELETE CASCADE ON UPDATE CASCADE



);