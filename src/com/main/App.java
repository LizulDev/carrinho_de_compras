package com.main;

import com.carrinho.*;

public class App {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("leite", 5.99, 5);
        carrinho.adicionarItem("carne moida", 10.60, 3);
        carrinho.adicionarItem("arroz 5Kg", 23.99, 3);
        carrinho.adicionarItem("leite", 8.99, 5);

        carrinho.exibirItens();

        carrinho.removerItem("leite");

        carrinho.exibirItens();

        System.out.println("VALOR TOTAL: R$" + carrinho.calcularValorTotal());


    }

    
}
