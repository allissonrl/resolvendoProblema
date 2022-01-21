package ParEImpar;

import java.util.Scanner;

public class ExParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantos numeros: ");
        quantNumeros = scan.nextInt(); // pede quantos numeros quer que calcula

        int count = 0;
        do{
            System.out.println(" numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; //calcula se os numeros são pares ou impares
            else  quantImpares++;

            count++;
        }while (count < quantNumeros);
        System.out.println("Quantidades Impares: " + quantImpares);
        System.out.println("Quantidades Pares: " + quantPares);

    }
}
