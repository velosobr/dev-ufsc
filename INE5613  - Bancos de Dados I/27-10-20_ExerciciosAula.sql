-- Questão 1
select nome, cpf from medicos where EXISTS (select cpf from pacientes where pacientes.cpf = medicos.cpf);

-- Questão 2
SELECT 
  medicos.nome, 
    medicos.cpf,
    consultas.data
FROM 
  medicos
 JOIN consultas ON medicos.codm = consultas.codm
WHERE 
  especialidade = 'ortopedia' and
    consultas.codm = medicos.codm and
    EXISTS (SELECT * FROM pacientes WHERE pacientes.codp = consultas.codp AND nome = 'Ana');

-- Questão 3
SELECT 
  nome, cpf 
FROM 
  medicos
WHERE NOT EXISTS(
  SELECT * FROM pacientes WHERE NOT EXISTS(
    SELECT * FROM consultas WHERE consultas.codp = pacientes.codp AND consultas.codm = medicos.codm
  )
);

-- Questão 4
SELECT 
  nome, cpf 
FROM 
  medicos
WHERE especialidade = 'ortopedia' AND
NOT EXISTS(
  SELECT * FROM pacientes WHERE cidade = 'florianopolis' AND NOT EXISTS(
    SELECT * FROM consultas WHERE consultas.codp = pacientes.codp AND consultas.codm = medicos.codm
  )
);

-- Questão 5
SELECT 
  c.data, c.hora 
FROM 
  (SELECT data, hora, codm FROM consultas) AS c
 JOIN (SELECT codm FROM medicos WHERE nome = 'Maria') AS ma ON c.codm = ma.codm;

-- Questão 6
SELECT 
  DISTINCT p.nome, 
  p.cidade 
FROM
  (SELECT nome, cidade, codp FROM pacientes) AS p
 JOIN (SELECT codm, codp FROM consultas) AS c ON p.codp = c.codp
 JOIN (SELECT codm FROM medicos where especialidade ='ortopedia') AS n ON n.codm = c.codm;


-- Questão 7 
SELECT 
  med.nome, med.cpf
FROM 
  (SELECT nome, cpf, nroa FROM medicos) as med
 JOIN (SELECT nroa FROM medicos WHERE nome = 'Pedro') as pe ON med.nroa = pe.nroa; 