DROP TABLE IF EXISTS person;

CREATE TABLE person(
    id INT AUTO_INCREMENT,
    nama VARCHAR(100),
    tanggal_lahir DATE,
    PRIMARY KEY(id)
)Engine=InnoDB;