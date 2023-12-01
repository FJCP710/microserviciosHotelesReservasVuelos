CREATE SCHEMA `pf` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin ;

CREATE TABLE `pf`.`vuelos` (
  `id_vuelos` INT NOT NULL AUTO_INCREMENT,
  `compania` VARCHAR(45) NULL,
  `fechaVuelo` DATE NULL,
  `precio` DOUBLE NULL,
  `plazas` INT NULL,
  PRIMARY KEY (`id_vuelos`));

insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania1", "2023-11-23", 32.1, 89);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania2", "2023-05-11", 30.2, 40);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania3", "2023-10-11", 29.4, 10);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania4", "2023-02-11", 59.2, 100);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania5", "2023-07-11", 21.4, 76);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania1", "2023-08-11", 45.5, 45);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania1", "2023-09-11", 55.7, 64);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania3", "2023-10-24", 66.6, 82);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania4", "2023-12-12", 25.3, 47);
insert into vuelos(compania,fecha_vuelo, precio, plazas) values("compania5", "2023-11-23", 41.4, 81);

