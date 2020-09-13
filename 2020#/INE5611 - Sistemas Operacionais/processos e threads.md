<h1>Processos</h1>
<header>
Uma abstração de um programa em execução. Elas mantêm a capacidade de operações pseudo concorrentes, mesmo quando há apenas uma CPU disponível.</header>

2.1.1 - o modelo de processo: todos os softwares que podem ser executadoes em um computador, são organizados em vários ***processos sequencias***. Um processo é apenas um programa em executação, um apanhado dos valores atuais do contador de programa, dos registradores e das variáveis.

Por um intervalo de tempo suficientemente longo, todos os processos avançam, mas, a cada instante, apenas um único processo está realmente executando.

<b>2.1.2</b> Criação de processos:<br>Há quatro eventos principais que fazem com que processos sejam criados: 
1 - Início do sistema.
2 - Execução de uma chamada de sistema de criação de processo por um processo em execução.
3 - Uma requisição do usuário para criar um novo processo.
4 - Início de uma tarefa em lote(batch job).


<b>2.1.3 - Término de processos </b> <br>
Um processo começa a executar e faz seu trabalho. Contudo, mais cesdo ou mais tarde o novo processo termina em razão das seguintes condições:
1 - Saída normal(voluntária)
2 - Saída pro erro (voluntária)
3 - Erro fatal (involuntária)
4 - Cancelamento por outro processo.

<b>2.1.4 - Hierárquia de processos</b> <br>
Em alguns sistemas, quando um processo cria outro, o processo pai e o processo filho continuam de certa maneira associados. O próprio processo filho pode gerar mais processo, formando um hierárquia de processos.
Basicamente vamos falar dos dois principais sistemas:
Unix: um processo, todos os seus filhos e descendentes formam um grupo de processos.<br>
Windows: Não apresenta nenhum conceito de hierarquia de processos.
