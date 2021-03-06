-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema webshop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema webshop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `webshop` DEFAULT CHARACTER SET utf8 ;
USE `webshop` ;

-- -----------------------------------------------------
-- Table `webshop`.`products`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `webshop`.`products` ;

CREATE TABLE IF NOT EXISTS `webshop`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` TEXT NULL,
  `price` DECIMAL(15,2) NOT NULL DEFAULT 0.00,
  `uid` VARCHAR(36) NULL,
  `image_filename` VARCHAR(255) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
