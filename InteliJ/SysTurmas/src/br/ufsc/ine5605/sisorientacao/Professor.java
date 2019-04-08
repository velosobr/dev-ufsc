package br.ufsc.ine5605.sisorientacao;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private String codigoFuncional;
    private ArrayList<Orientacao> orientacoes;

    public Professor(String nome, String codigoFuncional) {
        super(nome);
        this.codigoFuncional = codigoFuncional;
        this.orientacoes = new ArrayList<>();
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public void addOrientacao(Orientacao orientacao) {
        if (orientacao != null && orientacao.getOrientando() != null && orientacao.getOrientador() != null) {
            if (!existeOrientacao(orientacao)) {
                if (orientacao.getOrientador().equals(this)){
                    this.orientacoes.add(orientacao);
                }
            }
        } else {
            System.out.println("#########entrou na exceção########");
        }
    }

    private boolean existeOrientacao(Orientacao orientacao) {
        for (Orientacao orientacaoLista : orientacoes) {
            if (orientacaoLista.getOrientando().equals(orientacao.getOrientando())
                    && orientacaoLista.getOrientador().equals(orientacao.getOrientador())) {
                System.out.println("#########entrou na exceção######## - entrou no if do Existe Orientação");
                return true;
            }
        }return false;
    }

    public ArrayList<Orientacao> getOrientacao() {
        return orientacoes;
    }

    public void delOrientacao(Orientacao orientacao) {
        this.orientacoes.remove(orientacao);
    }
}
