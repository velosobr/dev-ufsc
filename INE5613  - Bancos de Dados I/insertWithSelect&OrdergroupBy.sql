insert into MedNovos 
select codm, nome, especialidade from Medicos where idade < 21;

insert into Pacientes
select p.codp + 1,
       f.nome,
       f.idade,
       f.CPF,
       'gripe',
       'Florianopolis'
from Pacientes p
         join Funcionarios f on f.codf = 1 and p.codp = (select max(codp) from Pacientes);

-- 1)
select *
from funcionarios
order by salario desc, idade;
-- 2
select nome
     , m.nroa
     , andar
from medicos m
         join ambulatorios a on m.nroa = a.nroa
order by m.nroa;

-- 3)
select x.data, COUNT(*)
from consultas x
where hora > '12:00'
group by x.data;
-- 4)
SELECT andar, SUM(capacidade) as capacidadeTotal
FROM ambulatorios
GROUP by andar;

-- 5)
SELECT andar, AVG(capacidade) AS mediaCapacidade
FROM ambulatorios
GROUP BY andar
HAVING AVG(capacidade) >= 40;

SELECT m.nome, count(*) from medicos m join consultas c on c.codm = m.codm GROUP by M.codm HAVING COUNT(*) > 1;         