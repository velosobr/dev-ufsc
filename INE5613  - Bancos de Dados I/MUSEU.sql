CREATE TABLE Autores
(
    codigo        int,
    nome          varchar(40) NOT NULL,
    nacionalidade varchar(15) NOT NULL,
    PRIMARY KEY (codigo)
);


CREATE TABLE Obras
(
    codigo int,
    titulo varchar(40) NOT NULL,
    ano    int         NOT NULL,
    autor  int         NOT NULL,
    salao  int,
    PRIMARY KEY (codigo),
    FOREIGN KEY (autor) REFERENCES Autores,
    FOREIGN KEY (salao) REFERENCES Saloes
);
CREATE TABLE Saloes
(
    numero int,
    andar  numeric(3) NOT NULL,
    area   decimal,
    PRIMARY KEY (numero)
);
CREATE TABLE Funcionarios
(
    CPF     numeric(11),
    nome    varchar(40) NOT NULL,
    salario decimal,
    turno   char(1) check ( turno in ('M', 'T', 'N')),
    funcao  varchar check ( funcao in ('faxineiro', 'seguranca')),
    PRIMARY KEY (CPF)
);
CREATE TABLE Lotacoes
(
    CPF         numeric(11),
    numero      int,
    horaEntrada time,
    horaSaida   time,
    PRIMARY KEY (CPF, numero, horaEntrada),
    FOREIGN KEY (CPF) references Funcionarios,
    FOREIGN KEY (numero) references Saloes
);

CREATE TABLE Pinturas
(
    codigo int,
    estilo varchar(20),
    area   decimal,
    PRIMARY KEY (codigo),
    FOREIGN KEY (codigo) references Obras
);

CREATE TABLE Esculturas
(
    codigo   int,
    altura   numeric(3),
    peso     float,
    material varchar(15),
    PRIMARY KEY (codigo),
    FOREIGN KEY (codigo) references Obras
);

insert into Funcionarios(cpf, nome, salario, turno, funcao)
VALUES (77472670022, 'Mirella Alícia Pires', 9879.00, 'M', 'seguranca'),
       (06342194130, 'Marcos Diogo Fernandes', 954.00, 'N', 'seguranca'),
       (69555554560, 'Aline Emilly Peixoto', 1654.00, 'T', 'seguranca'),
       (53354702834, 'Jaqueline Maria Nogueira', 1354.00, 'M', 'seguranca'),
       (40844516309, 'Nathan Hugo da Conceição', 9856.00, 'T', 'faxineiro'),
       (26489952777, 'Otávio Theo Lima', 123.00, 'T', 'faxineiro'),
       (42952571503, 'Benedito Matheus Baptista', 875.00, 'N', 'faxineiro'),
       (15909598848, 'Marcela Evelyn Juliana das Neves', 798.00, 'M', 'faxineiro');
-- Artistas plasticos
insert into Autores(codigo, nome, nacionalidade)
VALUES (1, 'Tomie Ohtake', 'Japonesa'),
       (2, 'Hideko Honma', 'Japonesa'),
       (3, 'Adriana Varejão', 'Brasileira'),
       (4, 'Victor Brecheret', 'Italiana'),
       (5, 'Vik Muniz', 'Brasileira'),
       (6, 'Beatriz Milhazes', 'Brasileira'),
       (7, 'Hélio Oiticica', 'Brasileira');

-- Artistas escultures https://www.ebiografia.com/escultores_famosos_suas_obras_incriveis/
insert into Autores(codigo, nome, nacionalidade)
VALUES (8, 'Abelardo da Hora', 'Brasileira'),
       (9, 'Aleijadinho', 'Brasileira'),
       (10, 'Ernesto Neto', 'Brasileira'),
       (11, 'Francisco Brennand', 'Brasileira'),
       (12, 'Sonia Ebling', 'Brasileira');
;
insert into Obras(codigo, titulo, ano, autor, salao)
VALUES (1, 'corpo feminino desnudo', 1956, 8, 1),
       (2, 'Monte das Oliveiras', 1796, 9, 1),
       (3, 'Flagelacao', 1796, 9, 1),
       (4, 'Cristo é Aprisionado', 1796, 9, 1),
       (5, 'Profeta Jeremias', 1800, 9, 1),
       (6, 'O Corpo da Janela', 2001, 10, 1),
       (7, 'Kuantico: A Odisséia Continua Navedante', 1994, 10, 1),
       (8, 'Vênus', 2020, 11, 1),
       (9, 'Halia', 2019, 11, 1),
       (10, 'Recorte da Forma', 1999, 1, 1),
       (11, 'Abstração', 1987, 1, 1),
       (12, 'Obvious', 1985, 1, 1),
       (13, 'toki Chuva', 2018, 2, 1),
       (14, 'Toki Algodão', 2019, 2, 1),
       (15, 'Atlas', 1987, 3, 1),
       (16, 'Ícone', 1987, 3, 1),
       (17, 'Abóbada', 1987, 3, 1),
       (18, 'Liliana', 1950, 12, 1),
       (19, 'Silvana', 1940, 12, 1),
       (20, 'Natividade', 1987, 3, 1);

insert into Obras(codigo, titulo, ano, autor, salao)
VALUES (21, 'Cristo', 1949, 4, 2),
       (22, 'Casal', 1987, 4, 2),
       (23, 'Figura Feminina com Cavalo', 1987, 4, 2),
       (24, 'The Card Players, after Cézanne', 2012, 5, 2),
       (25, 'Pictures of Garbage', 2008, 5, 2),
       (26, 'Mulatinho', 2008, 6, 2),
       (27, 'Mariposa', 2008, 6, 2),
       (28, 'O mágico', 2008, 6, 2),
       (29, 'Metaesquema', 1958, 7, 2),
       (30, 'Seja Marginal, Seja Herói', 1968, 7, 2),
       (31, 'Relevo espacial', 1959, 7, 2);


insert into Pinturas(codigo, estilo, area)
VALUES (13, 'impressionista', 200),
       (14, 'surrealista', 200),
       (15, 'arte barroca', 216),
       (16, 'surrealista', 263.25),
       (17, 'expressionista', 323.75),
       (20, 'arte barroca', 234),
       (21, 'arte barroca', 60.0),
       (22, 'impressionista', 67.1),
       (23, 'impressionista', 67.1),
       (24, 'Conceptual Art', 312),
       (25, 'Conceptual Art', 198),
       (26, 'Arte abstrata', 615.04),
       (27, 'Arte abstrata', 620.01),
       (29, 'expressionista', 610),
       (30, 'Arte abstrata', 610);

insert into Esculturas(codigo, altura, peso, material)
VALUES (18, 23, 5.40, 'bronze'),
       (19, 49, 25, 'marmore');

insert into saloes(numero, andar, area)
VALUES (1, 1, 10000),
       (2, 1, 5000),
       (3, 1, 8000);

INSERT INTO Lotacoes (cpf, numero, horaentrada, horasaida)
VALUES (69555554560, 16, '12:00:00', '22:00:00'),
       (42952571503, 16, '19:00:00', '07:00:00'),
       (53354702834, 26, '08:00:00', '18:00:00'),
       (15909598848, 26, '12:00:00', '22:00:00'),
       (06342194130, 36, '08:00:00', '18:00:00'),
       (40844516309, 36, '12:00:00', '22:00:00'),
       (26489952777, 36, '19:00:00', '07:00:00');

INSERT INTO Autores (codigo, nome, nacionalidade)
VALUES (14, 'Salvador Dali', 'Espanhola');

INSERT INTO Obras (codigo, titulo, ano, autor, salao)
VALUES (38, 'A Persistência da Memória', 1931, 14, 66),
       (39, 'Girafa em Chamas', 1937, 14, 66),
       (40, 'Crucificacao', 1954, 14, 13),
       (41, 'Os Elefantes', 1948, 14, 13);
