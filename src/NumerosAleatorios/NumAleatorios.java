package NumerosAleatorios;

import java.util.Random;

public class NumAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for (int i =0; i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }

        System.out.print("\nSucessores numeros aleatorios; ");
        for ( int numero : numerosAleatorios ) {
            System.out.println(numero);
            System.out.println((numero+1) + " ");

        }
    }
}
