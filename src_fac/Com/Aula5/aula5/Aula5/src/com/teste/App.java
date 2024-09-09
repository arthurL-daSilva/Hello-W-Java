package com.teste;

import com.aula5.Carrinho;
import com.aula5.Produto;
import com.aula5.TipoProduto;
import com.aula5.CarrinhoD;

public class App {
    public static void main(String[] args) throws Exception{
        Produto p1 = new Produto("Caneta", 14, TipoProduto.ESCRITORIO);
        Produto p2 = new Produto("Bala", 2.2, TipoProduto.ALIMENTO);
        Produto p3 = new Produto("Capinha", 10, TipoProduto.TECNOLOGIA);
        Produto p4 = new Produto("Borracha", 5, TipoProduto.ESCRITORIO);
        Carrinho k = new Carrinho();
        CarrinhoD kd = new CarrinhoD();

        kd.inserir(p1);
        kd.inserir(p2);
        kd.inserir(p3);
        kd.inserir(p4);

        kd.listar();
        System.out.println("Total de items: "+kd.calcularTotal());

    }
}
