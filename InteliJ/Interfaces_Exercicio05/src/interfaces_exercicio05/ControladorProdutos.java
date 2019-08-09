/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_exercicio05;

import java.util.ArrayList;

/**
 *
 * @author Linnety3
 */
public class ControladorProdutos implements IControladorProdutos{

    private ArrayList<Produto> produtos;
    private ArrayList<CategoriaProduto> categorias;
    private TelaProduto telaProduto;
    
    public ControladorProdutos() {
        this.produtos = new ArrayList<>();
        telaProduto = new TelaProduto(this);
    }
    public void inicia() {
        //simplificando para ir direto para a tela de inclusão de produtos
        telaProduto.menu();
    }

    @Override
    public void atualizaPrecos(float inflacao) {
        for(Produto prodIn: produtos)
            prodIn.setPreco( prodIn.getPreco()*(1+inflacao/100f));
        
    }

    @Override
    public IProduto getProdutoPeloCodigo(int codigo) {
        for(Produto prodIn: produtos)
            if(prodIn.getCodigo() == codigo)
                return (IProduto) prodIn;
        return null;
    }

    @Override
    public ICategoriaProduto incluiCategoriaProduto(int codigo, String nome) {
       CategoriaProduto catProd = new CategoriaProduto(codigo, nome);
       categorias.add(catProd);
       return catProd;
    }

    @Override
    public IProduto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria) {
        Produto produto = new Produto(codigo, nome, descricao, preco, quantidade, categoria);
        produtos.add(produto);
        return (IProduto) produto;
    }

    public CategoriaProduto verificaCategoriaByCodigo(int codCateg) {
      for (CategoriaProduto cpIn : categorias)
            if (codCateg != 0)
                if (cpIn.getCodito() == codCateg) 
                    return cpIn;
        return null;
    }
    
      
   
    
}
