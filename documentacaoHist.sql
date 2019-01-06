DROP DATABASE IF EXISTS documentacaoHist;
CREATE DATABASE documentacaoHist;

USE documentacaoHist;

CREATE TABLE documento (
	id INT PRIMARY KEY AUTO_INCREMENT,
	tipoDoc INT,
    governoCap VARCHAR(10),
    autoridade VARCHAR(150),
    provido VARCHAR(150),
    condicoes varchar(500),
    observacoes VARCHAR(500),
    dia INT,
    mes INT, 
    ano INT,
    fonte VARCHAR(200)
);