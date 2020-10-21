CREATE TABLE Ambulatorios (
nroa int,
andar numeric(3) NOT NULL,
capacidade smallint,
PRIMARY KEY(nroa)
)


CREATE TABLE Medicos (
codm int,
nome varchar(40) NOT NULL,
idade smallint NOT NULL,
especialidade char(20),
CPF numeric(11) UNIQUE,
cidade varchar(30),
nroa int,
PRIMARY KEY(codm),
FOREIGN KEY(nroa) REFERENCES Ambulatorios
)

CREATE TABLE Pacientes (
  codp INT, 
  nome VARCHAR(40) NOTNULL, 
  idade SMALLINT NOTNULL, 
  cidade VARCHAR(30), 
  CPF NUMERIC(11) UNIQUE, 
  doenca VARCHAR(40) NOTNULL, 
  PRIMARY KEY(codp));

CREATE TABLE Funcionarios (
  codf int, 
  nome VARCHAR(40) NOT NULL, 
  idade SMALLINT, 
  CPF NUMERIC(11) UNIQUE, 
  cidade VARCHAR(30), 
  salario NUMERIC(10), 
  cargo VARCHAR(20),
  PRIMARY KEY(codf)
)

CREATE TABLE Consultas (
  codm int, 
  codp int, 
  data DATE, 
  hora TIME, 
  PRIMARY KEY(codm, data, hora), 
  FOREIGN KEY(codm) REFERENCES medicos, 
  FOREIGN KEY(codp) REFERENCES pacientes)

  