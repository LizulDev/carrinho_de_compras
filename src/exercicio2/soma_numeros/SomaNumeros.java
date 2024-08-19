package exercicio2.soma_numeros;

import exercicio2.comparador.ComparadorNumeros;

import java.util.List;
import java.util.ArrayList;



public class SomaNumeros {
    List <Integer> listaNumeros;
    
    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    
    public void adicionarNumero(int numero){
        try {
            this.listaNumeros.add(numero);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro ao Adicionar Número");
        }
    };
    public int calcularSoma(){
        return this.calcularSomaRecursivo(0);
    }
    public int calcularSomaRecursivo(int indice){
        if (indice >= this.listaNumeros.size()){
            return 0;
        }
        int valorNumero = this.listaNumeros.get(indice);

        return valorNumero + calcularSomaRecursivo(indice + 1);

    }
    public int encontrarMaiorValor(){
        if (this.listaNumeros.isEmpty()){
            throw new IllegalStateException("Lista Vazia!");
        }
         
        this.listaNumeros.sort(new ComparadorNumeros());

        return this.listaNumeros.get((this.listaNumeros.size() - 1));
    }

    public int encontrarMenorValor(){
        if (this.listaNumeros.isEmpty()){
            throw new IllegalStateException("Lista Vazia!");
        }

        this.listaNumeros.sort(new ComparadorNumeros());

        return this.listaNumeros.get(0);
    
    }
    
    public void exibirNumeros(){
        System.out.println("Lista de números:");
        for (Integer num : this.listaNumeros) {
            System.out.println(num);
        }

    }


}
