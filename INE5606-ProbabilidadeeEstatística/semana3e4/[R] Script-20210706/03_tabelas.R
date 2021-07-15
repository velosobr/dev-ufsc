#=== Tabela de frequências

# Carregando uma função local
source('~/Dropbox/Pessoal/UFSC/Aulas/R/tab_freq.R')

jogos <- c(rep('Dota 2', 100), rep('CS', 50), 
           rep('LOL', 10), rep('Outros', 40)) # Leitura dos dados
tab_freq(jogos) # construção da tabela de frequências

#=== Tabela de contingência
# Leitura dos dados
dados <- read.table('~/Dropbox/Pessoal/UFSC/Aulas/R/cont.txt', header=T)
tab <- table(dados$Cursinho, dados$Cidade); tab # tabela
colSums(tab) # Soma das colunas
rowSums(tab) # Soma das linhas
relativa <- prop.table(tab); relativa
round(relativa, 2)

#=== Tabela de frequência por intervalos
# Carregando uma função local
source('~/Dropbox/Pessoal/UFSC/Aulas/R/tab_intv.R')

horas <- c(10,10.3,12,15,17.4,20.2,20.4,21.3,22,22,23.5,24.9,# Leitura dos dados
           27.2,27.6,27.8,28.3,29.6,30,33.3,34.7,35.2,39.3,42.8,46) 
tab_intv(horas, max=50, regra = 'raiz') # construção da tabela por intervalos
