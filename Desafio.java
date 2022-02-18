package capgemini;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQuestão 1:");
        System.out.println("Digite a quantidade de degraus: ");
        int degraus = sc.nextInt();
        String resultado = question1.montaEscada(degraus);
        System.out.println(resultado);

        System.out.println("\n-------------------------------");
        System.out.println("\nQuestão 2:");
        System.out.println("Digite uma senha: ");
        String senha = sc.next();
        System.out.println("Faltam "+Question2.testaSenha(senha)+" caracteres");


        System.out.println("\n-------------------------------");
        System.out.println("\nQuestão 3:");
        System.out.println("Digite o anagrama: ");
        String anagrama = sc.next();
        System.out.println("Existem "+Question3.imprimeAnagramas(anagrama)+" anagramas.");
    }
}