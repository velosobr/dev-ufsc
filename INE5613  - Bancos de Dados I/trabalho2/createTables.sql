CREATE TABLE Autores
(
    codigo        int,
    nome          varchar(40) NOT NULL,
    nacionalidade varchar(15) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Saloes
(
    numero int,
    andar  numeric(3) NOT NULL,
    area   decimal,
    PRIMARY KEY (numero)
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


-- Artistas plasticos
INSERT INTO Autores(codigo, nome, nacionalidade)
VALUES (1, 'Tomie Ohtake', 'Japonesa'),
       (2, 'Hideko Honma', 'Japonesa'),
       (3, 'Adriana Varejão', 'Brasileira'),
       (4, 'Victor Brecheret', 'Italiana'),
       (5, 'Vik Muniz', 'Brasileira'),
       (6, 'Beatriz Milhazes', 'Brasileira'),
       (7, 'Hélio Oiticica', 'Brasileira'),
       (8, 'Abelardo da Hora', 'Brasileira'),
       (9, 'Aleijadinho', 'Brasileira'),
       (10, 'Ernesto Neto', 'Brasileira'),
       (11, 'Francisco Brennand', 'Brasileira'),
       (12, 'Sonia Ebling', 'Brasileira'),
       (13, 'Pablo Picasso', 'Espanhola'),
       (14, 'Salvador Dali', 'Espanhola');

INSERT INTO Funcionarios (cpf, nome, salario, turno, funcao)
VALUES (77472670022, 'Mirella Alícia Pires', 9879, 'M', 'seguranca'),
       (40844516309, 'Nathan Hugo da Conceição', 9856, 'T', 'faxineiro'),
       (42952571503, 'Benedito Matheus Baptista', 875, 'N', 'faxineiro'),
       (15909598848, 'Marcela Juliana de Souza', 798, 'M', 'faxineiro'),
       (6342194130, 'Marcos Diogo Fernandes', 9879, 'N', 'seguranca'),
       (53354702834, 'Jaqueline Maria de Souza', 9879, 'M', 'seguranca'),
       (69555554560, 'Aline Emilly Peixoto', 9879, 'T', 'seguranca'),
       (44781999301, 'Bernardo Otávio Moraes', 9879, 'M', 'seguranca'),
       (14028356806, 'Augusto Nathan Felipe Assis', 9879, 'N', 'seguranca'),
       (26489952777, 'Otávio Theo Lima', 875, 'T', 'faxineiro'),
       (70025800000, 'Aline de Souza Oliveira', 1200, 'T', 'faxineiro'),
       (20220220220, 'Camila Clarice Caroline da Cruz', 875, 'M', 'faxineiro');

INSERT INTO Saloes (numero, andar, area)
VALUES (16, 1, 10000),
       (13, 1, 8000),
       (26, 2, 15000),
       (36, 3, 5000),
       (45, 4, 7000),
       (46, 4, 8000),
       (44, 4, 6000),
       (54, 5, 12000),
       (66, 6, 8000);

INSERT INTO Obras (codigo, titulo, ano, autor, salao)
VALUES (1, 'corpo feminino desnudo', 1956, 8, 16),
       (2, 'Monte das Oliveiras', 1796, 9, 16),
       (3, 'Flagelacao', 1796, 9, 16),
       (4, 'Cristo é Aprisionado', 1796, 9, 36),
       (5, 'Profeta Jeremias', 1800, 9, 36),
       (6, 'O Corpo da Janela', 2001, 10, 36),
       (7, 'Kuantico: A Odisséia Continua Navedante', 1994, 10, 36),
       (8, 'Vênus', 2020, 11, 16),
       (9, 'Halia', 2019, 11, 16),
       (10, 'Recorte da Forma', 1999, 1, 16),
       (11, 'Abstração', 1987, 1, 16),
       (12, 'Obvious', 1985, 1, 16),
       (13, 'toki Chuva', 2018, 2, 36),
       (14, 'Toki Algodão', 2019, 2, 36),
       (15, 'Atlas', 1987, 3, 36),
       (16, 'Ícone', 1987, 3, 16),
       (17, 'Abóbada', 1987, 3, 16),
       (18, 'Liliana', 1950, 12, 46),
       (19, 'Silvana', 1970, 12, 36),
       (20, 'Natividade', 1987, 3, 16),
       (21, 'Cristo', 1949, 4, 26),
       (22, 'Casal', 1987, 4, 26),
       (23, 'Figura Feminina com Cavalo', 1987, 4, 16),
       (24, 'The Card Players, after Cézanne', 2012, 5, 36),
       (25, 'Pictures of Garbage', 2008, 5, 26),
       (26, 'Mulatinho', 2008, 6, 26),
       (27, 'Mariposa', 2008, 6, 26),
       (28, 'O mágico', 2008, 6, 26),
       (29, 'Metaesquema', 1958, 7, 26),
       (30, 'Seja Marginal, Seja Herói', 1968, 7, 26),
       (31, 'Relevo espacial', 1959, 7, 46),
       (32, 'Guernica', 1937, 13, 36),
       (33, 'Les demoiselles d''Avignon', 1907, 13, 36),
       (34, 'A Mulher que Chora', 1937, 13, 26),
       (35, 'Bust of a Woman', 1930, 13, 26),
       (36, 'Glass of Absinthe', 1914, 13, 26),
       (37, 'Guitar', 1924, 13, 36),
       (38, 'A Persistência da Memória', 1931, 14, 66),
       (39, 'Girafa em Chamas', 1937, 14, 66),
       (40, 'Crucificacao', 1954, 14, 13),
       (41, 'Os Elefantes', 1948, 14, 13);

INSERT INTO Esculturas (codigo, altura, peso, material)
VALUES (1, 45, 13, 'argila'),
       (5, 48, 27, 'marmore'),
       (8, 23, 15, 'marmore'),
       (9, 25, 18, 'bronze'),
       (18, 23, 5.4, 'bronze'),
       (19, 49, 25, 'marmore'),
       (31, 47, 12, 'madeira'),
       (35, 55, 36, 'argila'),
       (36, 21, 31, 'bronze'),
       (37, 14, 7, 'folha de metal');

INSERT INTO Pinturas (codigo, estilo, area)
VALUES (2, 'arte barroca', 500),
       (3, 'impressionista', 180),
       (4, 'arte barroca', 149),
       (6, 'Conceptual Art', 196),
       (7, 'Conceptual Art', 98),
       (10, 'Conceptual Art', 300),
       (11, 'impressionista', 285),
       (12, 'impressionista', 746),
       (13, 'impressionista', 200),
       (14, 'surrealista', 200),
       (15, 'arte barroca', 216),
       (16, 'surrealista', 263.25),
       (17, 'expressionista', 323.75),
       (20, 'arte barroca', 234),
       (21, 'arte barroca', 60),
       (22, 'impressionista', 67.1),
       (23, 'impressionista', 67.1),
       (24, 'Conceptual Art', 312),
       (25, 'Conceptual Art', 198),
       (26, 'Arte abstrata', 615.04),
       (27, 'Arte abstrata', 620.01),
       (29, 'expressionista', 610),
       (30, 'Arte abstrata', 610),
       (32, 'Arte abstrata', 2744.82),
       (33, 'Cubismo', 566.19),
       (34, 'expressionista', 304),
       (38, 'surrealista', 792),
       (39, 'surrealista', 945),
       (40, 'surrealista', 1760),
       (41, 'surrealista', 892);



INSERT INTO Lotacoes (cpf, numero, horaentrada, horasaida)
values (77472670022, 16, '06:00:00', '12:00:00'),
       (44781999301, 16, '06:00:00', '12:00:00'),
       (42952571503, 16, '18:00:00', '06:00:00'),
       (69555554560, 16, '12:00:00', '18:00:00'),
       (15909598848, 26, '06:00:00', '12:00:00'),
       (53354702834, 26, '06:00:00', '12:00:00'),
       (26489952777, 36, '12:00:00', '18:00:00'),
       (40844516309, 36, '12:00:00', '18:00:00'),
       (6342194130, 36, '18:00:00', '06:00:00'),
       (14028356806, 36, '18:00:00', '06:00:00'),
       (20220220220, 44, '12:00:00', '14:00:00'),
       (20220220220, 45, '10:00:00', '12:00:00'),
       (70025800000, 46, '12:00:00', '20:00:00'),
       (20220220220, 46, '08:00:00', '10:00:00');


