-- -----------------------------------------------------
-- SCHEMA stageemploi
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Stagemont` ;
CREATE SCHEMA IF NOT EXISTS `Stagemont` ;
USE `Stagemont` ;

-- -----------------------------------------------------
-- CREATE
-- -----------------------------------------------------

CREATE TABLE `student` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(255) NOT NULL,
  `lastname` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `da` INT NOT NULL,
  `cv` VARCHAR(255) NOT NULL,
  `letter` VARCHAR(255) NOT NULL
);

CREATE TABLE `teacher` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(255) NOT NULL,
  `lastname` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL
);

CREATE TABLE `company` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `person_in_charge` VARCHAR(255) NOT NULL
);

CREATE TABLE `internship` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `start_date` DATE,
  `end_date` DATE,
  `company_id` INT NOT NULL
);

CREATE TABLE `job` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `start_date` DATE,
  `end_date` DATE,
  `company_id` INT NOT NULL
);

CREATE TABLE `ads` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `image` VARCHAR(255),
  `company_id` INT NOT NULL
);

CREATE TABLE `contract` (
  `id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `status` ENUM('submit','interview','employ'),
  `start_date` DATE,
  `end_date` DATE,
  `company_id` INT NOT NULL,
  `student_id` INT NOT NULL
);

ALTER TABLE `internship` ADD FOREIGN KEY (`company_id`) REFERENCES `company` (`id`);

ALTER TABLE `job` ADD FOREIGN KEY (`company_id`) REFERENCES `company` (`id`);

ALTER TABLE `ads` ADD FOREIGN KEY (`company_id`) REFERENCES `company` (`id`);

ALTER TABLE `contract` ADD FOREIGN KEY (`company_id`) REFERENCES `company` (`id`);

ALTER TABLE `contract` ADD FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

CREATE UNIQUE INDEX `da_UNIQUE` ON `student` (`da`);

CREATE UNIQUE INDEX `email_UNIQUE` ON `company` (`email`);
