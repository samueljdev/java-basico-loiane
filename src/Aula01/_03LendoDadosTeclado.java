package Aula01;

import java.util.Scanner;

public class _03LendoDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();

        System.out.print("Digite seu segundo nome: ");
        String segundoNome = scan.next();

		System.out.println("Seu nome completo é: " + primeiroNome +" " +segundoNome);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();
!
        System.out.println("Sua idade é: " + idade +" E sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
        String primeiroNome = scan.next();
        scan.nextLine();
        int idade = scan.nextInt();
        scan.nextLine();
        byte qtdFilhos = scan.nextByte();
        scan.nextLine();
        float altura = scan.nextFloat();
        scan.nextLine();
        boolean temPet = scan.nextBoolean();
        scan.nextLine();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);
    }
}
