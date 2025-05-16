-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema soorotDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema soorotDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `soorotDB` DEFAULT CHARACTER SET utf8 ;
USE `soorotDB` ;

-- -----------------------------------------------------
-- Table `soorotDB`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soorotDB`.`usuarios` (
  `usuarioId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(25) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`usuarioId`),
  UNIQUE INDEX `usuariosId_UNIQUE` (`usuarioId` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `soorotDB`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soorotDB`.`productos` (
  `productoId` INT ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `precio` DOUBLE UNSIGNED NOT NULL,
  `descripcion` VARCHAR(100) NOT NULL,
  `categoria` VARCHAR(15) NOT NULL,
  `imagen` MEDIUMTEXT NOT NULL,
  PRIMARY KEY (`productoId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `soorotDB`.`ordenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soorotDB`.`ordenes` (
  `ordenId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `fechaOrden` DATE NOT NULL,
  `importe` INT UNSIGNED NOT NULL,
  `productosId` VARCHAR(45) NOT NULL,
  `usuarioId` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`ordenId`, `usuarioId`),
  UNIQUE INDEX `ordenId_UNIQUE` (`ordenId` ASC) VISIBLE,
  INDEX `fk_ordenes_usuarios1_idx` (`usuarioId` ASC) VISIBLE,
  CONSTRAINT `fk_ordenes_usuarios1`
    FOREIGN KEY (`usuarioId`)
    REFERENCES `soorotDB`.`usuarios` (`usuarioId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `soorotDB`.`ordenes_has_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soorotDB`.`ordenes_has_productos` (
  `ordenId` INT UNSIGNED NOT NULL,
  `productoId` INT ZEROFILL UNSIGNED NOT NULL,
  PRIMARY KEY (`ordenId`, `productoId`),
  INDEX `fk_ordenes_has_productos_productos1_idx` (`productoId` ASC) VISIBLE,
  INDEX `fk_ordenes_has_productos_ordenes1_idx` (`ordenId` ASC) VISIBLE,
  CONSTRAINT `fk_ordenes_has_productos_ordenes1`
    FOREIGN KEY (`ordenId`)
    REFERENCES `soorotDB`.`ordenes` (`ordenId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordenes_has_productos_productos1`
    FOREIGN KEY (`productoId`)
    REFERENCES `soorotDB`.`productos` (`productoId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
