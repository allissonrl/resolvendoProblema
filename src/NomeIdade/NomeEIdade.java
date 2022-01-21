package NomeIdade;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){ //essa é estrutura de repetição
            System.out.println("Nome: ");
            nome = scan.next(); // o usuario coloca o nome
            if(nome.equals("0")) break; // comando quando o nome for colocado 0 ele para
            System.out.println("idade: ");
            idade = scan.nextInt(); // o usuario colocar o valor da idade
        }


    }
}
