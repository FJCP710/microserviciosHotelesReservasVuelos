CREATE SCHEMA `pf` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin ;

  CREATE TABLE `pf`.`hoteles` (
  `id_hoteles` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `categoria` INT NULL,
  `precio` DOUBLE NULL,
  `disponible` BOOLEAN NULL,
  PRIMARY KEY (`id_hoteles`));

    insert into hoteles(nombre, categoria, precio, disponible) values("hotel1", 2, 22.5, 1);
    insert into hoteles(nombre, categoria, precio, disponible) values("hotel2", 3, 20.2, 1);
    insert into hoteles(nombre, categoria, precio, disponible) values("hotel3", 3, 17.8, 0);
    insert into hoteles(nombre, categoria, precio, disponible) values("hotel4", 4, 32.7, 1);
    insert into hoteles(nombre, categoria, precio, disponible) values("hotel5", 5, 65.8, 0);
