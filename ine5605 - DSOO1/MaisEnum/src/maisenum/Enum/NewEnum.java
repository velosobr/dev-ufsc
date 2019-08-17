/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maisenum.Enum;

/**
 *
 * @author Linnety3
 */
public enum NewEnum {
    OTIMO("Aprovado com sucesso"),
    BOM("Aprovado"),
    REGULAR("Regular"),
    RUIM("Reprovado");

    private String mensagem;

    private NewEnum(String mensagem) {
        this.mensagem = mensagem;
    }

    public String calcularAprovacao() {
        return this.mensagem;
    }

}
