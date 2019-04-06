/**
 * Classe que descreve um container.
 */
public class Container
{
    String codigo;
    int peso;

    /**
     * Cria um container a partir do seu código e do seu peso.
     *
     * @param codigo O código do container.
     * @param peso O peso do container.
     */
    public Container(String codigo, int peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    /**
     * Obtém o código do container.
     *
     * @return Retorna o código do container.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtém o peso do container.
     *
     * @return Retorna o peso do container.
     */
    public int getPeso() {
        return peso;
    }
}
