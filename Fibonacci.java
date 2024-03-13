package desafio;


import java.util.Scanner;

public class Fibonacci {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);


    System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
    int numeroDesejado = scanner.nextInt();

    if (isFibonacci(numeroDesejado)) {
        System.out.println("O número " + numeroDesejado + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("O número " + numeroDesejado + " não pertence à sequência de Fibonacci.");
    }

    scanner.close();
}

public static boolean isFibonacci(int numero) {
    int a = 0;
    int b = 1;

    while (b < numero) {
        int temp = a + b;
        a = b;
        b = temp;
    }

    return b == numero;
}



}