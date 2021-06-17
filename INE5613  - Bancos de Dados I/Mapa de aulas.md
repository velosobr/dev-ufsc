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
- ATRIBUTO = COLUNA = GRAU
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


 Aula 17/09/20

 π nroa (σ Ambulatorios.capacidade > Amb100.capacidade (π nroa,capacidade (Ambulatorios) X ρ Amb100 (π capacidade (σ nroa = 100 (Ambulatorios)))))

 2)
Fun1←π CPF,salário (σ CPF = 1001(Funcionários))
Fun2←π nome,CPF,salário (Funcionários)
Resposta←π nome,CPF (σ Fun2.salário <= Fun1.salário ˄ Fun1.CPF ≠ Fun2.CPF(Fun1 X Fun2))

π Funcionarios.CPF, Funcionarios.nome, (σ Funcionarios.salario<= Func1001.salario (π CPF, nome, salario (Funcionarios) X ρ Func1001 (π salário (σ cpf = 1001 (Funcionarios)))))

UNIÃO, DIFERENÇA E INTERSECÇÃO
1
Medicos <- π CPF, nome (Medicos)
Pacientes <- π CPF, nome (Pacientes)
Medicos U Pacientes

Med <- π CPF, nome, idade (Medicos)
Pac<- π CPF, nome (Pacientes)
Med U Pac

π nome, CPF ( Médicos) U π nome, CPF (Pacientes) Resposta do professor

2
Med <- π CPF, nome, idade(σ cidade = ‘Florianópolis’(Medicos))
Pacientes<- π CPF, nome, idade (σ cidade = ‘Florianópolis’(Pacientes))
Funcionarios<- π CPF, nome, idade (σ cidade = ‘Florianópolis’(Funcionarios))
Med U (Pacientes U  Funcionarios) RESPOSTA OK

3
func <- π nome, cpf(σ salario < 1500(funcionarios))

Func <- π nome, cpf (σ salario < 1500 (Funcionarios))
Pac <- π nome, CPF
π nome, CPF (Func - Pac)

4 
amb <- π nro (ambulatorios)
med <- π nroa(medicos) (amb - med)

5
Func←nome, cpf(σ cidade = 'Florianópolis'(Funcionários))
Pac←π nome, cpf(σ cidade = 'Florianópolis'(Pacientes))
Resposta←Func∩Pac

6 
Med <- π nome, cpf (σ especialidade = 'Pediatria' ^ nroa != 101 ^ nroa != 102 (Médicos))

Pac <- π nome, cpf (σ doença = 'gastrite' (Pacientes))

Res <- Med ∩ Pac

Aula 22/09/20
Join
1) Buscar o numero e a capacidade dos ambulatorios do quinto andar e o nome dos medicos que atendem neles
R. Med ← π nome, nroa (Medicos)
Amb5 ← π nroa, capacidade (σ andar = 5 (Ambulatorios))
RESPOSTA ← Amb5 ⊗ Med

2) 2) R1 ← π cpf, nome, salário (σ cidade = 'Florianópolis' ˅ cidade = 'Palhoça' (Funcionários))
R2 ← π cpf, codp (σ cidade = 'Florianópolis' ˅ cidade = 'Palhoça' (Pacientes))
R3 ← π codp (σ data = '20/9/2020' (Consultas))
R4 ← R1 ⋈ R2
R5 ← π nome, salário (R3 ⋈ R4)

Aula 29/09/20
1) remover os médicos que estão internados como pacientes sofrendo de cancer
Respostas possiveis -) 
Médicos ← Médicos - (Médicos ⋈ π CPF (σ doença = 'câncer'(Pacientes)))

R1 ← π cpf (σ doença = 'câncer' (Pacientes))
R2 ← π cpf (R1⊗ Médicos)
Médicos ← Médicos - σ R2.cpf=Médicos.cpf R2

2) o funcionario com CPF 1000 foi internado como paciente com código 75. Ele está com hepatite. Incluir este funcionario na tabela de pacientes, obtendo os dados em comum da tabela Funcionarios.

Respostas: DadosFunc ←
π CPF, nome, idade, cidade
(σ CPF = 1000 Funcionarios)

Pacientes ← Pacientes U (({(75)}) X DadosFunc X ({('hepatite')}))

3) o médico com código 37 transferiu todas as suas consultas do dia 29-09-20 para o dia 08-10-20
Resposta: Temp ← (σ codm = 37 ^ data = '29/09/2020' (Consultas))
Consultas ← Consultas - Temp
δ data ← ‘08/10/2020’ ( Temp)
Consultas ← Consultas U Temp

4) fazer em casa


DadosFunc ←
π CPF, nome, idade, cidade


(σ CPF = 1000 Funcionarios)


























Temp ← (σ codm = 37 ^ data = '29/09/2020' (Consultas))
Consultas ← Consultas - Temp
δ data ← ‘08/10/2020’ ( Temp)
Consultas ← Consultas U Temp






cod
titulo
1995 > e < 2015
salao = 36
(σ ano > 1995 ^ ano < 2015 ^ salao = 36 (obras))


























