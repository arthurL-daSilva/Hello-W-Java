package com.aula5;

public class Carrinho {
    
    private Produto[] produtos;
    //final => atributo constante(não muda);
    //static => desacopla o atributo/instancia;
    private final static int MAX_QTD = 5;
    private int qtAtual;

    public Carrinho(){
        produtos = new Produto[MAX_QTD];
    }

    public void inserir(Produto prod) throws Exception{
        if(qtAtual >= MAX_QTD){throw new Exception("Estourou a pilha.");}
        produtos[qtAtual++] = prod;
    }

    public Produto desempilhar() throws Exception{
        if(qtAtual == 0){
            throw new Exception("Underflow");
        }
        Produto p = produtos[--qtAtual];
        produtos[qtAtual] = null;
        return p;
    }

    public void listar(){
        for(int i=0; i< qtAtual; i++){
            produtos[i].mostrar();
        }
    }

    public double caucularTotal(){
        double total = 0;
        for(int i = 0; i < qtAtual; i++){
            total = total + produtos[i].getPreco();
        }
        return total;
    }

    public double caucularTotalTipo(TipoProduto tipo){
        double total = 0;
        for(int i = 0; i < qtAtual; i++){
            if(produtos[i].verificarTipo(tipo))
                total = total + produtos[i].getPreco();
        }
        return total;
    }
    //Exercicio: implementar o metodo verificarNome
    //da mesma forma que o verificarTipo
    public void buscarPorNome(String nome){
        for(int i=0; i < qtAtual; i++){
            if(produtos[i].getNome() == nome){
                produtos[i].mostrar();
            }
        }
    }
}

