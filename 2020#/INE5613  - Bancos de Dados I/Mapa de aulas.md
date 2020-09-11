## AULA 01 dia 01-09-20
- Apresentação do plano de aula
- a frequencia é via moodle
- 3 provas e 3 trabalhos
- p1 introdução até algebra relacional
- p2 linguagem sql
- modelagem de dados
-  as aulas não são gravadas
> NOTA FINAL = (p1 + p2 + p3 + Media(t1,t2,t3))/4

## AULA 02 dia 03-09-20
- ATRIBUTO = COLUNA
- TUPLA = LINHA
- CHAVES CANDIDATAS = CHAVE PRIMARIA + CHAVES ALTERNATIVAS
- CHAVES ALTERNATIVAS = CHAVES CANDIDATAS - CHAVE PRIMARIA

Exercicio de fixação

1 - d - 0 e 1 pk
2 - b - 0 ou mais fK
3 - a - 0 e varias cks e entre 0 e varias aks
4 - 


Aula dia 10/09/20

Produtos cartesianos

1º) realizar a produto de todas as tabelas necessárias para a consulta

1º) executar a seleção (fazer todos os filtros necessários, incluindo as condições de junção de 2 tabelas)

3º) executar a projeção dos atributos requisitados pelo usuário
parênteses são necessários, dentro dos filtros de uma seleção, somente quando quero MUDAR A PRECEDÊNCIA de AND e OR, ou quando uso o NOT

NOT(condição)

===>>> DICA: para cada produto entre 2 tabelas existe uma condição de junção entre elas a ser definida

exercicios

2) π Ambulatorios.nroa, nome, capacidade (σ Medicos.nroa = Ambulatorios.nroa ˄ andar = 5 ˄ especialidade = 'ortopedia' (Medicos X Ambulatorios))

2)
R1 ← (Medicos X Ambulatorios)
R2 ← σ Medicos.nroa = Ambulatorios.nroa ˄ andar = 5 ˄ especialidade = 'ortopedia' (R1)
RESPOSTA ← π Ambulatorios.nroa, nome, capacidade (R2)

3)π Médicos.nome, Pacientes.nome, Consultas.data
(σ Consultas.codm = Médicos.codm ^ Consultas.codp = Pacientes.codp ^
hora >= 7 ^ hora <= 12
(Médicos x Consultas x Pacientes))

π Funcionarios.nome, salário ( 
 σ (Funcionarios.cidade = 'Palhoça' v Funcionarios.cidade = 'Florianopolis') ^ (Funcionarios.CPF = Pacientes.CPF ^ Consultas.codp = Pacientes.codp ^ Consultas.codm = Medicos.codm ^ Medicos.especialidade = 'psiquiatria' (Medicos x Consultas X Pacientes x Funcionarios))