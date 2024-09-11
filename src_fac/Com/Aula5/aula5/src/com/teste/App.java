package com.teste;

import com.aula5.Carrinho;
import com.aula5.Produto;
import com.aula5.Sapo;
import com.aula5.TipoProduto;

public class App {
    public static void main(String[] args) throws Exception {
        Sapo s1 = new Sapo();
        Sapo s2 = new Sapo();
        Sapo s3 = new Sapo();

        System.out.println(s1.getQtPulo());
        System.out.println(s2.getQtPulo());
        System.out.println(s3.getQtPulo());

        System.out.println(Sapo.getQtSapo());
    }
}
