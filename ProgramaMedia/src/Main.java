import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            System.out.print("Digite a 1 nota ");
                float n1 = ler.nextFloat();
        System.out.print("Digite a 2 nota ");
        float n2 = ler.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("sua média foi: " + m);
        if (m >= 9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
        }
    }
