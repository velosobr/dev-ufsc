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
