#install.packages('ggplot2')
library(ggplot2) # biblioteca para construção de gráficos

# Gráfico de barras
filhos <- c(rep(0,5), rep(1,4), rep(2,6), rep(3,3), rep(4,3), 5, 5, 7)
sexo <- c('M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 
          'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M')
dados <- data.frame(filhos, sexo)

ggplot() # Primeira camada

# geom_bar() -> gráfico de barras
ggplot() +
  geom_bar(data=dados, # data frame utilizado (dados)
           aes(x = filhos)) # estética (x: variável)

# cor das bordas
ggplot() + 
  geom_bar(data=dados, 
           aes(x = filhos),
           colour = 'black') 

# preenchimento das barras
ggplot() + 
  geom_bar(data=dados,
           aes(x = filhos),
           colour = 'black', 
           fill = 'lightgrey')

# preenchimento a partir de uma variável
ggplot() + 
  geom_bar(data=dados,
           aes(x = filhos, 
               fill = sexo),
           colour = 'black')

# nomeação dos eixos
ggplot() + 
  geom_bar(data=dados,
           aes(x = filhos),
           colour = 'black',
           fill = 'lightgrey') +
  labs(x = 'Número de filhos', 
       y = 'Frequência absoluta') 

# escala dos eixos 
ggplot() + 
  geom_bar(data=dados,
           aes(x = filhos),
           colour = 'black',
           fill = 'lightgrey') +
  labs(x = 'Número de filhos', 
       y = 'Frequência absoluta') + 
  scale_x_continuous(breaks = 0:7) +
  scale_y_continuous(breaks = 0:6)   

# temas
ggplot() + 
  geom_bar(data=dados,
           aes(x = filhos),
           colour = 'black',
           fill = 'lightgrey') +
  labs(x = 'Número de filhos', 
       y = 'Frequência absoluta') + 
  scale_x_continuous(breaks = 0:7) + 
  scale_y_continuous(breaks = 0:6) +
  theme_classic() 

?theme

#==== Histograma e gráfico de dispersão (com extensões)
# install.packages('gapminder')
library(gapminder) # pacote com banco de dados

# recorte dos dados
dados <- subset(gapminder, year == 2007, select = -year)
# nome das variáveis
names(dados) <- c('Pais', 'Continente', 'ExpVida', 'Populacao', 'PIB')
# nome das categorias da variável Continente
levels(dados$Continente) <- c('Africa', 'America', "Asia", "Europa", 'Oceania')

#= Histograma
# Pelo pacote base
hist(dados$ExpVida, 
     xlab='Expectativa de vida (anos)', 
     ylab='Frequência absoluta')

# geom_histogram() -> histograma
ggplot() + 
  geom_histogram(data = dados, # data frame
                 aes(x = ExpVida), # variável
                 bins = 10, # quantidade de barras
                 colour = 'black', # cor da borda
                 fill = 'lightgrey') + # preenchimento
  labs(x = 'Expectativa de vida (anos)', # nome dos eixos
       y = 'Frequência')

# preenchimento a partir de uma variável
ggplot() + 
  geom_histogram(data = dados,
                 aes(x = ExpVida,
                     fill = Continente),
                 bins = 10,
                 colour = 'lightgrey') +
  labs(x = 'Expectativa de vida (anos)', 
       y = 'Frequência')

#= Gráfico de dispersão 
# Pelo pacote base
plot(ExpVida ~ PIB, data=dados,
     xlab = 'PIB per capita (US$)', 
     ylab = 'Expectativa de vida (anos)')
plot(ExpVida~PIB, data=dados, pch=20, cex=.3)

# geom_point() -> diagrama de dispersão
ggplot() + 
  geom_point(data = dados,
             aes(x = PIB, 
                 y = ExpVida))+ # variáveis X e Y
  labs(x = 'PIB per capita (US$)', # nome dos eixos
       y = 'Expectativa de vida (anos)')

# Modificando o tamanho dos pontos
ggplot() +
  geom_point(data = dados, 
             aes(x = PIB, 
                 y = ExpVida, 
                 size = Populacao), #tamanho dos pontos
             alpha = .5) +    # transparência
  scale_size(range = c(.1, 10), # Escala do tamanho
             name = 'População')+ # Título da legenda
  labs(x = 'PIB per capita (US$)',
       y = 'Expectativa de vida (anos)') + 
  theme_minimal()
             
# Modificando a cor dos pontos
ggplot() +
  geom_point(data = dados, 
             aes(x = PIB, 
                 y = ExpVida, 
                 size = Populacao,
                 colour = Continente), # Cor dos pontos
             alpha = .5) + 
  scale_size(range = c(.1, 10),
             name = 'População')+ 
  scale_colour_brewer(palette = 'Set1') +  # Paleta de cores
  labs(x = 'PIB per capita (US$)',
       y = 'Expectativa de vida (anos)') + 
  theme_minimal()

# Alterando a escala do gráfico
ggplot() +
  geom_point(data = dados, 
             aes(x = PIB, 
                 y = ExpVida, 
                 size = Populacao,
                 colour = Continente),
             alpha = .5) + 
  scale_size(range = c(.1, 10),
             name = 'População')+ 
  scale_colour_brewer(palette = 'Set1') + 
  labs(x = 'PIB per capita (US$)',
       y = 'Expectativa de vida (anos)') + 
  scale_x_continuous(trans = 'log10') + # Escala logaritmica 
  theme_minimal()

#== GIF
# install.packages('gganimate')
library(gganimate)

dados2 <- gapminder
names(dados2) <- c('Pais', 'Continente', 'Ano', 'ExpVida', 'Populacao', 'PIB')
ggplot() +
  geom_point(data = dados2, 
             aes(x = PIB, 
                 y = ExpVida, 
                 size=Populacao, 
                 colour=Continente),
             alpha=0.6) +
  scale_colour_brewer(palette = 'Set1') +
  scale_size(range = c(.1, 24), 
             name="População") +
  labs(x = 'PIB per capita (US$)',
       y = 'Expectativa de vida (anos)') +
  scale_x_continuous(trans = 'log10') +
  ggtitle('Situação no ano de {closest_state}') + # Título a ser modificado
  transition_states(factor(Ano)) # Variável para animação

#===============
#== ver: http://www.cookbook-r.com/Graphs/
#===============