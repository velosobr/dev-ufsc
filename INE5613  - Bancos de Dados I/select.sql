Exercicios
1) select * from ambulatorios where capacidade > 30
2) select * from medicos where idade < 40 or especialidade = 'traumatologia'
3) select codm, codp from consultas where hora > '13:00:00' and data > '2010/10/15';
8) SELECT CAST(avg(idade) AS numeric(4,2)) as mediaIdade, COUNT(DISTINCT nroa) as totalAmb
9) select codf,nome,salario - (salario * 0.2) as liquido from Funcionarios
10) SELECT nome FROM Funcionarios WHERE nome LIKE '%a'
11) select nome, especialidade from Medicos where nome like '_o%o'
12) select codp,nome from Pacientes where idade > 25 and doenca in ('tendinite','fratura','gripe','sarampo')
13) select cpf, nome, idade from medicos WHERE cidade = 'florianopolis' UNION SELECT cpf, nome, idade from pacientes WHERE cidade = 'florianopolis' UNION SELECT cpf, nome, idade from funcionarios WHERE cidade = 'florianopolis';