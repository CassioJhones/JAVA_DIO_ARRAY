import java.util.Random;
public class AleatoriosNumber {
    public static void main(String[] args) {
        Random random = new Random(); //-- Gera numeros aleatorios

        int[] numerosAleatorios = new int[20]; //--Vetor inteiro com 20 espaços

            for( int i = 0; i < numerosAleatorios.length; i++ ){
                int numero = random.nextInt(100); //--numero aletorios com limite maximo de 100 guardado na var numero
                numerosAleatorios[i] = numero; //--cada espaço do vetor guardando um aleatorio
            }

            System.out.print("\n--Numeros Aletorios: ");
            for (int numero : numerosAleatorios) {
                System.out.print(numero + " "); 
            }

            System.out.print("\n--Numeros Antecessores: ");
            for (int numero : numerosAleatorios) {
                System.out.print((numero-1) + " "); 
            }

            System.out.print("\n--Numeros Sucessores: ");
            for (int numero : numerosAleatorios) {
                System.out.print((numero+1) + " ");  
            }
    }
}


/*
 PROGRAMA QUE LEIA 20 NUMEROS INTEIROS ALEATORIOS E GUARDE NUM VETOR.
 AO FINAL, MOSTRE OS NUMEROS E SEUS SUCESSORES.
 */
