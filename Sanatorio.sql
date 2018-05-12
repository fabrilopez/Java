-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sanatorio
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sanatorio` ;

-- -----------------------------------------------------
-- Schema sanatorio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sanatorio` DEFAULT CHARACTER SET utf8 ;
USE `sanatorio` ;

-- -----------------------------------------------------
-- Table `sanatorio`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sanatorio`.`user` ;

CREATE TABLE IF NOT EXISTS `sanatorio`.`user` (
  `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `surname` VARCHAR(50) NOT NULL,
  `added_date` DATETIME NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `sanatorio`.`especialidad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sanatorio`.`especialidad` ;

CREATE TABLE IF NOT EXISTS `sanatorio`.`especialidad` (
  `especialidad_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`especialidad_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sanatorio`.`obrasocial`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sanatorio`.`obrasocial` ;

CREATE TABLE IF NOT EXISTS `sanatorio`.`obrasocial` (
  `os_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`os_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sanatorio`.`paciente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sanatorio`.`paciente` ;

CREATE TABLE IF NOT EXISTS `sanatorio`.`paciente` (
  `paciente_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `dni` BIGINT(20) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellido` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `telefono` BIGINT(20) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `os_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`paciente_id`),
  INDEX `fk_paciente_obrasocial1_idx` (`os_id` ASC),
  CONSTRAINT `fk_paciente_obrasocial1`
    FOREIGN KEY (`os_id`)
    REFERENCES `sanatorio`.`obrasocial` (`os_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sanatorio`.`profesional`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sanatorio`.`profesional` ;

CREATE TABLE IF NOT EXISTS `sanatorio`.`profesional` (
  `profesional_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `apellido` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `especialidad_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`profesional_id`),
  INDEX `fk_profesional_especialidad1_idx` (`especialidad_id` ASC),
  CONSTRAINT `fk1`
    FOREIGN KEY (`especialidad_id`)
    REFERENCES `sanatorio`.`especialidad` (`especialidad_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sanatorio`.`turno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sanatorio`.`turno` ;

CREATE TABLE IF NOT EXISTS `sanatorio`.`turno` (
  `turno_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `fecha` DATETIME NOT NULL,
  `tipo_practica` VARCHAR(50) NOT NULL,
  `indicaciones` VARCHAR(50) NOT NULL,
  `diagnostico` VARCHAR(50) NOT NULL,
  `profesional_id` BIGINT(20) NOT NULL,
  `paciente_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`turno_id`),
  INDEX `fk_turno_profesional_idx` (`profesional_id` ASC),
  INDEX `fk_turno_paciente1_idx` (`paciente_id` ASC),
  CONSTRAINT `fk_turno_profesional`
    FOREIGN KEY (`profesional_id`)
    REFERENCES `sanatorio`.`profesional` (`profesional_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_turno_paciente1`
    FOREIGN KEY (`paciente_id`)
    REFERENCES `sanatorio`.`paciente` (`paciente_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
