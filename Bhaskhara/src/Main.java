import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de A (A tem que ser diferente de ZERO) ");
            int A = ler.nextInt();
        System.out.print("Digite o valor B ");
            int B = ler.nextInt();
        System.out.print("Digite o valor C ");
            int C = ler.nextInt();

        float delta = (B*B)-(4* A* C);
            System.out.println("Δ é igual à " + delta);

        if (delta < 0){
            System.out.println("não existem raízes reais (raízes complexas)");
        }
        else if (delta== 0) {
            System.out.println("uma raiz real (raiz dupla)");
              float xx1 = (-B + (float) Math.sqrt(delta) / (2 * A));
                System.out.println("X1 é igual à " + xx1);

        }
        else {
            System.out.println("duas raízes reais diferentess");
                float x1 = (-B + (float) Math.sqrt(delta) / (2 * A));
                float x2 =(-B - (float) Math.sqrt(delta) / (2 * A));
                    System.out.println("X1 é igual à " + x1);
                    System.out.println("X2 é igual à " + x2);

            //x1 = (−B + √Δ) / (2·A)
           // x2 = (−B − √Δ) / (2·A)
        }

    }
}