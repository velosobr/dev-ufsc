
-- 1) código e nome dos pacientes com consulta marcada para horários após às 14 horas
select codp, nome
from pacientes
where codp in (SELECT codp FROM consultas WHERE hora > '14:00');

-- 2) nome e idade dos médicos que possuem consulta com a paciente Ana
select nome, idade
from medicos
where codm in (select codm from consultas where codp = (select codp from pacientes where nome = 'Ana'));
-- 3) número e andar dos ambulatórios onde nenhum médico dá atendimento
select nroa, andar
from ambulatorios
where nroa not in (select nroa from medicos);
select nroa, andar
from Ambulatorios
where nroa not in (SELECT nroa from Medicos WHERE nroa IS NOT NULL);

-- 1) nome e CPF dos médicos que atendem em ambulatórios do primeiro andar

select nome, cpf
from medicos
where nroa = ANY (select nroa from ambulatorios where andar = 1);
-- 2) nome e CPF de todos os funcionários, exceto o de maior salário

select nome, cpf
from Funcionarios
where salario < ANY (SELECT salario from Funcionarios);
-- 3) nome e CPF dos pacientes com consultas marcadas para horários
-- anteriores a todos os horários de consultas marcadas para o dia
-- 14/10/2020
select nome, cpf
from pacientes
where codp = any (select codp from consultas where hora < ALL (select hora from consultas where data = '2020/10/14'));

-- 4) número e andar dos ambulatórios com capacidade superior à capacidade
-- de todos os ambulatórios do primeiro andar
SELECT nroa, andar
FROM ambulatorios
WHERE capacidade > ALL (
    SELECT capacidade
    FROM ambulatorios
    WHERe andar = 1
);