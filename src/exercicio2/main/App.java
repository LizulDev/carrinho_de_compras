package exercicio2.main;

import java.util.Scanner;
import exercicio2.soma_numeros.SomaNumeros;

public class App {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        SomaNumeros somaNumeros = new SomaNumeros();
        boolean sair = false;

        while (!sair) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Número");
            System.out.println("2. Calcular Soma");
            System.out.println("3. Encontrar Maior Valor");
            System.out.println("4. Encontrar Menor Valor");
            System.out.println("5. Exibir Números");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um número para adicionar: ");
                    int numero = scan.nextInt();
                    somaNumeros.adicionarNumero(numero);
                    System.out.println("Número adicionado.");
                    break;
                case 2:
                    int soma = somaNumeros.calcularSoma();
                    System.out.println("A soma dos números é: " + soma);
                    break;
                case 3:
                    try {
                        int maiorValor = somaNumeros.encontrarMaiorValor();
                        System.out.println("O maior valor é: " + maiorValor);
                    } catch (IllegalStateException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        int menorValor = somaNumeros.encontrarMenorValor();
                        System.out.println("O menor valor é: " + menorValor);
                    } catch (IllegalStateException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    somaNumeros.exibirNumeros();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scan.close();
    }
}

