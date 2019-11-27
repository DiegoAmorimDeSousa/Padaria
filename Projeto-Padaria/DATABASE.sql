/*DROP DATABASE projeto_padaria;

CREATE DATABASE projeto_padaria;

USE projeto_padaria;*/

CREATE TABLE caixa(
    data TIMESTAMP,
    valores DECIMAL(10,2),
    usuario VARCHAR(100)
);

CREATE TABLE caixa_diario(
	valor DECIMAL(10,2)
);

INSERT INTO caixa_diario (valor) VALUES (0);

CREATE TABLE funcionarioscaixa(
	usuario VARCHAR(100),
    caixa DECIMAL(10,2)
);

CREATE TABLE novosfuncionarios(
	nome VARCHAR(100),
    user VARCHAR(100),
    nivel VARCHAR(40),
    email VARCHAR(100),
    cpf VARCHAR(15),
    salario DECIMAL(10,2)
);

INSERT INTO novosfuncionarios (nome, user, nivel, email, cpf, salario) VALUES ("Admin", "Admin", "Administrador", "Admin", 1,1);

CREATE TABLE pontosfuncionarios(
	usuario VARCHAR(100),
    pontuacao DECIMAL(10,2),
    salario DECIMAL(10,2)
);

CREATE TABLE produtos(
	Nome VARCHAR(100),
    Fabricante VARCHAR(100),
    Marca VARCHAR(100),
    Tipo VARCHAR(100),
    Quantidade int(11),
    CodigoBarra int(16),
    ID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Custo DECIMAL(10,2),
    Preco DECIMAL(10,2)
);
