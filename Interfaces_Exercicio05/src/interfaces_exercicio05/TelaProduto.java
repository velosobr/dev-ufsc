/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_exercicio05;

import java.util.Scanner;

/**
 *
 * @author Linnety3
 */
class TelaProduto {

    private Scanner teclado;
    private ControladorProdutos controladorProdutos;

    public TelaProduto(ControladorProdutos controladorProdutos) {

        teclado = new Scanner(System.in);
        this.controladorProdutos = controladorProdutos;
    }

    void menu() {
        int opcao;
        do {
            System.out.println("---- TELA DE CONTROLE DE PRODUTOS----");
            System.out.println("1 - incluir produto");
            System.out.println("2 - Incluir categorias de produto");
            System.out.println("3 - Selecionar produto por codigo");
            System.out.println("4 - Atualizar precos");
            System.out.println("---------------------------");

            System.out.println("opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case (1):
                    incluiProduto();
                    break;
                case (2):
                    incluiCategoria();
                    break;
                case (3):
                    getProdutoByCodigo();
                    break;
                case (4):
                    updatePrice();
                    break;
            }

        } while (opcao != 0);

    }

    private void incluiProduto() {
        System.out.println("----------Incluindo produto ------------");
     
        System.out.println("Digite o CODIGO do produto: ");
        int codigo = recebeValorInteiro();

        System.out.println("Digite o NOME do produto: ");
        String nome = recebeValorString();

        System.out.println("Digite a DESCRICAO do produto: ");
        String descricao = recebeValorString();

        System.out.println("Digite o PRECO do produto: ");
        float preco = recebeValorFloat();

        System.out.println("Digite a QUANTIDADE do produto: ");
        int quantidade = recebeValorInteiro();

        CategoriaProduto categoria = receberCategoria();

        controladorProdutos.incluiProduto(codigo, nome, descricao, preco, quantidade, categoria);

    }

    private void incluiCategoria() {
         System.out.println("Digite o codigo da categoria: ");
        int codigo = recebeValorInteiro();

        System.out.println("Digite o nome da categoria: ");
        String nome = recebeValorString();
     
       controladorProdutos.incluiCategoriaProduto(codigo, nome);
    }

    private void updatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getProdutoByCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    private int recebeValorInteiro() {
        int valor = 0;

        try {
            valor = teclado.nextInt();
            teclado.nextLine();
        } catch (Exception e) {
            System.out.println("Valor invalido! Digite um numero inteiro");
        }
        return valor;
    }

    private float recebeValorFloat() {
        float valor = 0;

        try {
            valor = teclado.nextFloat();
            teclado.nextLine();
        } catch (Exception e) {
            System.out.println("Valor invalido! Digite um numero com virgula");
        }
        return valor;
    }

    private String recebeValorString() {
        return teclado.nextLine();
    }

   /* private CategoriaProduto receberCategoria() {
        
        System.out.println("Digite o codigo da categoria: ");
        int codigo = recebeValorInteiro();

        System.out.println("Digite o nome da categoria: ");
        String nome = recebeValorString();
       
        
        CategoriaProduto catProdTemp=null;
        return catProdTemp;
    }
*/
    
    private CategoriaProduto receberCategoria() {
        System.out.println("---------- BUSCANDO UMA CATEGORIA PELO CODIGO ----------");
        System.out.println("Digite o codigo da editora: ");
        int codCateg = recebeValorInteiro();
        
        controladorProdutos.verificaCategoria(codCateg);
        CategoriaProduto cp = null;
        return cp;
    }

}
