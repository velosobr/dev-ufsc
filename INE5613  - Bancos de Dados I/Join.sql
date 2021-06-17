-- 1) nome e CPF dos médicos que também são pacientes do hospital
Select nome, cpf
From medicos
         natural join pacientes;
SELECT medicos.nome,
       medicos.CPF
FROM Medicos,
     Pacientes
WHERE Medicos.CPF = Pacientes.CPF;

SELECT medicos.nome, medicos.cpf
FROM medicos
         JOIN pacientes on medicos.cpf = pacientes.cpf;

-- 2) nomes de funcionários e de médicos (exibir pares de nomes) que residem na mesma cidade.
-- não dá para usar natural join

-- Produto
select Funcionarios.nome, Medicos.nome
from Funcionarios
         Inner join Medicos on Funcionarios.cidade = Medicos.cidade;

select Funcionarios.nome, Medicos.nome
from Funcionarios,
     Medicos
WHERE Funcionarios.cidade = Medicos.cidade;

-- 3) código e nome dos pacientes com consulta marcada para horários após às 14 horas
SELECT consultas.codp, nome
FROM consultas
         natural join pacientes
where hora > '14:00:00';

-- 4) número e andar dos ambulatórios utilizados por médicos ortopedistas
select ambulatorios.nroa, andar
FROM ambulatorios
         Join medicos on ambulatorios.nroa = medicos.nroa
where especialidade = 'ortopedia';

select ambulatorios.nroa, andar
from ambulatorios
         Join medicos on ambulatorios.nroa = medicos.nroa
where especialidade = 'ortopedia';

-- 5) código e nome dos médicos que atendem no mesmo ambulatório do médico Pedro.

select Medicos.codm, Medicos.nome
from medicos
         join Ambulatorios on Medicos.nroa = Ambulatorios.nroa
where Medicos.nroa = (select nroa from Medicos where nome = 'Pedro');

-- 6) nome e idade dos médicos que têm consulta com a paciente Ana

SELECT medicos.nome, medicos.idade
FROM medicos
         JOIN consultas ON consultas.codm = medicos.codm
         JOIN pacientes ON consultas.codp = pacientes.codp
WHERE pacientes.nome = 'Ana';


-- 7) nome e salário dos funcionários que moram na mesma cidade do funcionário Carlos e possuem salário superior ao dele

Select Func2.salario, Func2.nome From Funcionarios as Func1, Funcionarios as Func2 Where Func1.nome = 'Caio' and Func2.salario > Func1.salario and Func1.cidade = Func2.cidade;

