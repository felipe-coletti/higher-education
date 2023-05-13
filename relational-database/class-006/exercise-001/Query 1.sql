CREATE TABLE `college`.`student`(
    `id` INT NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `age` INT NOT NULL,
    `gender` VARCHAR(255) NOT NULL
) ENGINE = InnoDB;

ALTER TABLE `student` ADD `average` INT NOT NULL;
