DROP DATABASE IF EXISTS investigadores_marc;
CREATE DATABASE investigadores_marc;
USE investigadores_marc;


DROP TABLE IF EXISTS facultad;
CREATE TABLE facultad(
codigo int AUTO_INCREMENT PRIMARY KEY,
nombre nvarchar(100)  not null
);
DROP TABLE IF EXISTS investigadores;
CREATE TABLE investigadores(
dni varchar(8) PRIMARY KEY,
nomapels nvarchar(255)  not null,
facultad int,
CONSTRAINT FK_facultad FOREIGN KEY (facultad)
REFERENCES facultad(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS equipos;
CREATE TABLE equipos(
numserie varchar(4) PRIMARY KEY,
nombre nvarchar(100)  not null,
facultad int,
CONSTRAINT FK_facultadd FOREIGN KEY (facultad)
REFERENCES facultad(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS reserva;
CREATE TABLE reserva(id INT AUTO_INCREMENT primary key,
dni varchar(8),
numserie char(4),
comienzo datetime,
fin datetime,
CONSTRAINT FK_dni FOREIGN KEY (dni)
REFERENCES investigadores(dni)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_numserie FOREIGN KEY (numserie)
REFERENCES equipos(numserie)
ON DELETE CASCADE ON UPDATE CASCADE


);