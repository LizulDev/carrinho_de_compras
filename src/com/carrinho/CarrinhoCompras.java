package com.carrinho;

import java.util.List;
import java.util.ArrayList;

import com.item.Item;

public class CarrinhoCompras {
    private List<Item> listaItens;
    
    public CarrinhoCompras(){
        this.listaItens = new ArrayList<>();
    }

    public boolean adicionarItem(String nome, double preco, int quantidade){
        Item novoItem = new Item(nome, preco, quantidade);
        boolean itemAdicionado = false;

        if (!(this.listaItens.contains(novoItem))){
            this.listaItens.add(novoItem);
            itemAdicionado = true;
            System.out.println("Item adicionado com sucesso!");
        }
        return itemAdicionado;
    }
    public boolean removerItem(String nome){
        List<Item> listaAux = new ArrayList<>();
        boolean removido = false;

        for (Item item : this.listaItens) {
            if (item.getNome().equalsIgnoreCase(nome)){
                listaAux.add(item);
            }
        }
        try {
            this.listaItens.removeAll(listaAux);
            removido = true;
            System.out.println("Item(s) removidos com sucesso!");
        } catch (Exception e) {
            System.err.println("ERRO AO EXCLUIR DADOS!");
        }
        return removido;
    }
    
    //metodo auxiliar
    public double calcularValorRecursivo(int index){
        if (index >= listaItens.size()){
            return 0;
        }

        Item item = this.listaItens.get(index);
        double valorTotal = item.getPreco() * item.getQuantidade();
        
        return valorTotal + calcularValorRecursivo(index + 1);
    }

    //metodo principal
    public double calcularValorTotal(){
        return calcularValorRecursivo(0);
    }

    public void exibirItens(){
        if (this.listaItens.isEmpty()){
            System.out.println("Lista vazia!");
        }
        
        for (Item item : listaItens) {
            System.out.println(item);
        }
    }



}