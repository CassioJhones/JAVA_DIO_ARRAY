import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;
        
        do{
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") | 
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) ){
                    consoantes[count] = letra;
                    quantidadeConsoantes ++;
                }
                count++;
        } while(count < consoantes.length);
    }
}
// leia um vetor de 6 caracteres
// e diga quantas consoantes foram lidas
// imprima as consoantes
