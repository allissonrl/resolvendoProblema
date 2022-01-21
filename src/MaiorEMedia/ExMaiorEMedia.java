package MaiorEMedia;

import java.util.Scanner;

public class ExMaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0; //contador
        do{
            System.out.println("qual é o numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero; //verifica qual o numero é maior



            count = count +1; // no contador vai adicionar mais 1 sempre que passar aqui
        }while (count < 5); // limite do contador menor que 5
        System.out.println("maior: " + maior);
        System.out.println("media: " + (soma/5));
    }
}
