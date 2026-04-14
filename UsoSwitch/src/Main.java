import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantas pernas?");
            int perna = ler.nextInt();
        System.out.print("Isso é um (uma): ");
        String tipo;
        switch (perna){
            case 1:
                tipo = "Saci";
                    break;
            case 2:
                tipo = "Bípede";
                    break;
            case 3:
                tipo = "Tripé";
                    break;
            case 4:
                tipo = "Quadrúpede";
                    break;
            case 6:
                tipo = "aranha";
                    break;
            default:
                tipo = "ET";
                break;
        }
        System.out.print(tipo);



    }
}