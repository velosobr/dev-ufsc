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

    public void addOrientacao(Orientacao orientacao){
        if(orientacao != null && orientacao.getOrientando() != null && orientacao.getOrientador() != null) {
            this.orientacoes.add(orientacao);
        }else{
            System.out.println("#########entrou na exceção########");
        }
    }
    public ArrayList<Orientacao> getOrientacao(){
        return orientacoes;
    }
    public void delOrientacao(Orientacao orientacao){
        this.orientacoes.remove(orientacao);
    }
}
