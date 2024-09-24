-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema examen
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema examen
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `examen` DEFAULT CHARACTER SET utf8 ;
USE `examen` ;

-- -----------------------------------------------------
-- Table `examen`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `examen`.`administrador` (
  `id_admin` INT(10) NOT NULL AUTO_INCREMENT,
  `password_admin` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id_admin`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `examen`.`profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `examen`.`profesor` (
  `id_prof` INT(10) NOT NULL AUTO_INCREMENT,
  `rfc_prof` VARCHAR(13) NOT NULL,
  `nombre_prof` VARCHAR(30) NOT NULL,
  `apellido_p_prof` VARCHAR(30) NOT NULL,
  `apellido_m_prof` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id_prof`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `examen`.`unidad_aprendizaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `examen`.`unidad_aprendizaje` (
  `id_ua` INT(10) NOT NULL AUTO_INCREMENT,
  `nombre_ua` VARCHAR(45) NOT NULL,
  `hra_inicio_lab` TIME(0) NOT NULL,
  `hra_fin_lab` TIME(0) NOT NULL,
  `hra_inicio_clase` TIME(0) NOT NULL,
  `hra_fin_clase` TIME(0) NOT NULL,
  `hra_inicio_taller` TIME(0) NOT NULL,
  `hra_fin_taller` TIME(0) NOT NULL,
  PRIMARY KEY (`id_ua`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `examen`.`imparte' -- tabla puente --
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `examen`.`imparte` (
  `id_UA` INT(10) NOT NULL,
  `id_PROF` INT(10) NOT NULL,
  PRIMARY KEY (`id_UA`,`id_PROF`), 
  FOREIGN KEY (`id_UA`)
    REFERENCES `examen`.`unidad_aprendizaje` (`id_ua`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`id_PROF`)
    REFERENCES `examen`.`profesor` (`id_prof`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
  )
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
