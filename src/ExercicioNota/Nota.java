package ExercicioNota;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt(); //comando do teclado

        while (nota < 0 | nota > 10){ //formula para que a nota seja maior que 0 e menor que 10
            System.out.println(" Nota invalida! Digite novamente: "); // se digitar errado, vai ficar pedindo sempre
            nota = scan.nextInt(); // repetiçao ate colocar um numero entre 0 e 10

        }
    }

}
