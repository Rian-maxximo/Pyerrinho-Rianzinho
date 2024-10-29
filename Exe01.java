package Exe01;

import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = { 100, 50, 20, 10, 2 }; // Removido o valor 5 para permitir saques exatos
        int valor;

        System.out.print("Digite o valor que gostaria de sacar: ");
        valor = scanner.nextInt();

        for (int nota : notas) {
            int quantidadeNotas = valor / nota; // Calcula a quantidade de notas do valor atual
            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$ " + nota);
                valor %= nota; // Atualiza o valor restante a ser sacado
            }
        }

        if (valor > 0) {
            System.out.println("Não é possível sacar o valor exato com as notas disponíveis.");
        }

        scanner.close();
    }
}