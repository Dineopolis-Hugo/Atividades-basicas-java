import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
            String nome = ler.nextLine();
        System.out.print("Digite sua nota: ");
            float nota = ler.nextFloat();
        System.out.println();

        System.out.printf("A nota de %s é %.1f ",nome,nota);
            /* O %f E PARA COLOCAR O NUMERO EM FLOAT/REAL
             * O %s E PARA REPRESENTAR STRING/CARACTERE
            * E O .2 PARA USAR DUAS CASAS DECIMAIS
            */

    }
}