
SELECT nome, CPF
FROM Funcionarios
WHERE CPF IN (SELECT CPF
              FROM Lotacoes
              WHERE número < > 101
                AND número < > 102)


SELECT f1.CPF, f1.nome
FROM Funcionarios f1
WHERE f1.funcao = 'faxineiro'
  AND f1.salario > ALL (SELECT f2.salario
                        FROM Funcionarios f2
                        WHERE f2.funcao = 'segurança')

SELECT f1.CPF, f1.nome
FROM Funcionarios f1,
     f2
WHERE f1.funcao = 'faxineiro'
  AND f2.func = 'segurança'
  AND f1.salario > f2.salário

SELECT f1.CPF, f1.nome
FROM Funcionarios f1
WHERE f1.funcao = 'faxineiro'
  AND f1.salario > (SELECT MAX(f2.salario)
                    FROM Funcionarios f2
                    WHERE f2.funcao = 'segurança')


SELECT numero, AVG(a.código)
FROM Obras o
         JOIN Autores a ON o.autor = a.código
WHERE a.nacionalidade = 'brasileira'
GROUP BY número;

ALTER TABLE Pinturas
    ADD CONSTRAINT manutenções Int, cor_predominante VARCHAR(30);

DELETE
FROM Funcionarios
WHERE salario < 1000 AND funcao = 'faxineiro'
    AND turno = 'M'
   OR turno = 'T'

DELETE
FROM Funcionarios
WHERE salario < 1000 AND funcao = 'faxineiro'
   OR (turno = 'M' OR turno = 'T')

SELECT s.numero, s.andar
FROM Saloes s
         JOIN Obras o
              ON s.numero = o.salao
                  AND ano = 2020;

SELECT numero, andar
FROM Saloes
         NATURAL JOIN Obras
    ON numero = salao
WHERE ano = 2020;

SELECT numero, andar
FROM Saloes
         NATURAL JOIN Obras
WHERE ano = 2020

SELECT s.numero, s.andar
FROM Saloes s
         JOIN Obras o
              ON s.sal = o.numero
                  AND ano = 2020


SELECT s.salao, s.andar
FROM (SELECT numero AS salao, andar FROM Saloes) AS s
         NATURAL JOIN (SELECT salao FROM Obras WHERE ano = 2020) AS o

SELECT numero, AVG(a.codigo)
FROM Obras o JOIN Autores a ON o.autor = a.codigo
WHERE a.nacionalidade = 'brasileira'
GROUP BY numero;

UPDATE andar = 2
SET Saloes
WHERE NOT(número <= 10)

CREATE VIEW LotaçõesFunc
AS SELECT CPF, nome, numero
FROM Lotacoes NATURAL JOIN Funcionarios

GRANT SELECT ON Obras TO User1 CASCADE

UPDATE andar = 2
SET Salões

    WHERE NOT(número <= 10)

