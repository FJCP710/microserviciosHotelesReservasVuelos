CREATE SCHEMA `pf` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin ;

  CREATE TABLE `pf`.`reservas` (
  `id_reservas` INT NOT NULL AUTO_INCREMENT,
  `nombre_cliente` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NULL,
  `id_hotel` INT NULL,
  `id_vuelo` INT NULL,
  PRIMARY KEY (`id_reservas`));

  insert into reservas(nombre, dni, id_hotel, id_vuelo) values("cliente1", "DNI1", 1, 1);
  insert into reservas(nombre, dni, id_hotel, id_vuelo) values("cliente2", "DNI2", 2, 5);
  insert into reservas(nombre, dni, id_hotel, id_vuelo) values("cliente3", "DNI3", 3, 7);
  insert into reservas(nombre, dni, id_hotel, id_vuelo) values("cliente4", "DNI4", 4, 4);
  insert into reservas(nombre, dni, id_hotel, id_vuelo) values("cliente5", "DNI5", 5, 9);