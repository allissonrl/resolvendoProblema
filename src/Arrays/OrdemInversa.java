package Arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {8, -5, 25, 11, 31, 65}; // vetor de uma linha com seis elementos

        int count =0;
        while (count < vetor.length) {
            System.out.println(vetor[count]);
            count++;
        }

        for (int i = vetor.length -1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
