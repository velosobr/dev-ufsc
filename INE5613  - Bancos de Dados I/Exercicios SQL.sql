INSERT INTO Ambulatorios (nroa, andar, capacidade)
VALUES (1, 1, 30),
       (2, 1, 50),
       (3, 2, 40),
       (4, 2, 25),
       (5, 2, 55);
INSERT INTO pacientes (codp, nome, idade, cidade, cpf, doenca)
VALUES (1, 'Ana', 20, 'Florianopolis', 2000200000, 'gripe'),
       (2, 'Paulo', 24, 'Palhoca', 20000220000, 'fratura'),
       (3, 'Lucia', 30, 'Biguacu', 22000200000, 'tendinite'),
       (4, 'Carlos', 28, 'Joinville', 11000110000, 'sarampo');

INSERT INTO Medicos (codm, nome, idade, especialidade, cpf, cidade, nroa)
VALUES (1, 'João', 40, 'ortopedia', 10000100000, 'Florianópolis', 1),
       (2, 'Maria', 42, 'traumatologia', 10000110000, 'Blumenau', 2),
       (3, 'Pedro', 51, 'pediatria', 11000100000, 'São José', 2),
       (4, 'João', 28, 'ortopedia', 11000110000, 'Joinville', NULL),
       (5, 'Carlos', 33, 'neurologia', 11000111000, 'Biguacu', 3);
CREATE TABLE Funcionarios
(
    codf   int,
    nome   varchar(40) NOT NULL,
    idade  smallint,
    CPF    numeric(11) UNIQUE,
    cidade varchar(30),
    cargo  varchar(20),
    PRIMARY KEY (codf)
);

CREATE TABLE Funcionarios
(
    codf   int,
    nome   varchar(40) NOT NULL,
    idade  smallint,
    cidade varchar(30),
    salario int,
    CPF    numeric(11) UNIQUE,
    PRIMARY KEY (codf)
);


INSERT INTO Funcionarios (codf, nome, idade, cidade, salario, CPF)
VALUES (1, 'Rita', 32, 'Sao Jose', 1200, 20000100000),
       (2, 'Vera', 55, 'Palhoca', 1220, 30000110000),
       (3, 'Caio', 45, 'Florianopolis', 1100, 41000100000),
       (4, 'Marcos', 44, 'Florianopolis', 1200, 51000110000),
       (5, 'Paula', 33, 'Florianopolis', 2500, 61000111000);

insert into Consultas
(codm, codp, data, hora)
VALUES (1, 1, '2010-10-12', '14:00:00'),
(1, 4, '2010-10-13', '10:00:00'),
(2, 1, '2010-10-13', '09:00:00'),
(2, 2, '2010-10-13', '11:00:00'),
(2, 3, '2010-10-14', '14:00:00'),
(2, 4, '2010-10-14', '17:00:00'),
(3, 1, '2010-10-19', '18:00:00'),
(3, 3, '2010-10-12', '10:00:00'),
(3, 4, '2010-10-19', '13:00:00'),
(4, 4, '2010-10-20', '13:00:00'),
(4, 4, '2010-10-22', '19:30:00');