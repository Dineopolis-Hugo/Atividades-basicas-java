import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva um numero: ");
            int num = ler.nextInt();
        System.out.println("O resto da divisão de " + num + " por 2 é " + num %2);
        System.out.printf("a raiz cubica de %d é igual à: %.2f", num, Math.cbrt(num));
        /* printf usa placeholders (%d, %f, %s) para formatar a saída.
         *Usa-se , no lugar de + para concatenar.
         *Os valores são passados depois da vírgula e substituem os placeholders na ordem.
         */
        System.out.println();
        System.out.printf("a raiz quadrada de "+ num + " é igual à: " +  ("%.2f") ,Math.sqrt(num) );
        System.out.println();
        System.out.println( num + " elevado ao cubo é igual á: " + Math.pow(num,3));
        System.out.println("o valor ABS de " + num + " é igual à: " + Math.abs(num));




        }
    }
