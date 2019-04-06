/**
 * Classe que representa um relógio capaz de marcar hora, minuto e segundo.
 */
public class Relogio
{
    int hora;       // hora marcada pelo relógio. Valor entre 0 e 23.
    int minuto;     // minuto marcado pelo relógio. Valor entre 0 e 59.
    int segundo;    // segundo marcado pelo relógio. Valore entre 0 e 59.

    /**
     * Inicializa o relógio de modo que marque zero horas, zero minutos e zero segundos.
     *
     */
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    /**
     * Inicializa o relógio de modo a marcar uma hora, um minuto e um segundo específicos.
     *
     * @param hora A hora inicial do relógio.
     * @param minuto O minuto inicial do relógio.
     * @param segundo O segundo inicial do relógio.
     */
    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * Inicializa o relógio de modo a marcar uma hora e um segundo específicos. O segundo inicial será zero.
     *
     * @param hora A hora inicial do relógio.
     * @param minuto O minuto inicial do relógio.
     */
    public Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    /**
     * Inicializa o relógio de modo a marcar uma hora específica. O minuto e o segundo inicial serão zero.
     *
     * @param hora A hora inicial do relógio.
     */
    public Relogio(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    /**
     * Altera a hora marcada pelo relógio.
     *
     * @param hora A nova hora que o relógio deve marcar.
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Descobre a hora que o relógio está marcando.
     *
     * @return Retorna a hora que o relógio está marcando.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Altera o minuto marcado pelo relógio.
     *
     * @param minuto O novo minuto que o relógio deve marcar.
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * Descobre o minuto marcado pelo relógio.
     *
     * @return Retorna o minuto que o relógio está marcando.
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Altera o segundo marcado pelo relógio.
     *
     * @param segundo O novo segundo que o relógio deve marcar.
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /**
     * Descobre o segundo marcado pelo relógio.
     *
     * @return Retorna o segundo que o relógio está marcando.
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Faz com que o horáro marcado pelo relógio seja atualizado em 1 segundo.
     *
     */
    public void tic() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24)
                    hora = 0;
            }
        }
    }

    /**
     * Verifica se o relógio está adiantado, atrasado ou marca o mesmo horário marcado por outro relógio.
     *
     * @param outro O outro relógio.
     * @return Retorna um número que representa a situação do relógio em relação ao outro relógio. Se retornar zero então
     * os dois relógios estão marcando exatamente o mesmo horário. Se retornar -1 então o relógio está atrasado em relação ao outro relógio.
     * Se retornar +1 então o relógio está adiantado em relação ao outro relógio.
     */
    public int compareCom(Relogio outro) {
        //Obs: Uma variável final não pode ter o seu valor modificado.
        final int ATRASADO = -1;
        final int MESMO_TEMPO = 0;
        final int ADIANTADO = 1;

        int situacao;
        int tempoThis = segundo + minuto * 60 + hora * 3600;
        int tempoOutro = outro.segundo + outro.minuto * 60 + outro.hora * 3600;

        if (tempoThis < tempoOutro)
            situacao = ATRASADO;
        else
        if (tempoThis == tempoOutro)
            situacao = MESMO_TEMPO;
        else
            situacao = ADIANTADO;

        return situacao;
    }
}
