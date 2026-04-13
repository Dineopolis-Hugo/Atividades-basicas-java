import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        int ate = 0;
        int passo = 0;
        System.out.print("A contagem começa do número: ");
            cont = ler.nextInt();
        System.out.print("A contagem vai até: ");
            ate = ler.nextInt();
        System.out.print("a contagem vai pular quantos números? ");
            passo = ler.nextInt();

            for (cont = cont ;cont <= ate; cont += passo ){

                System.out.printf("%3d" , cont);
            }

    }
}