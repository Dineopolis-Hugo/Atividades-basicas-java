import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[] = new int[6];
        Arrays.fill(v, 0);
        int totimpar = 0;
        int totpar = 0;
        String stop = "s";
        int maiornum = 0;
        float segundomaior = 0;
        //variaveis\\

    while (stop.equals("s"))
    //enquanto stop nao for == "s" continua o loop\\
        {
        System.out.println("Escolha um número ");
        int num = ler.nextInt();
                //INPUT NUM\\
        if (num >= maiornum) {
            segundomaior = maiornum;
            maiornum = num;
            /*se o num digitado > maior num, o segundo maior
            *recebe o maior e o maior num recebe o num digitado
            *ex maior = 3 num = 4 seg maior = 2 então
            *segundo maior = 3 maior = 4
            */
        }else if (num > segundomaior && num < maiornum){
            num = (int) segundomaior;
        }

        if (num % 2 == 0) {
            totpar++;
        }
        //SE O NUM FOR PAR = TOTAL PAR +1\\

        if (num % 2 != 0) {
            totimpar++;
            //SE O NUM FOR IMPAR = TOTAL IMPAR+1
        }

        System.out.println("Escolha a posição (0 A 6)");
        int pos = ler.nextInt();
                //IMPUT POSIÇÃO\\

        if (pos >= 0 && pos <= v.length) {
            //SE A POS >= 0 E MENOR QUE VETOR PODE COLOCAR O NUM\\

            v[pos] = num;
        }
        //NO VETOR "V" NA POSIÇÃO X COLOCA O NÚMERO X\\

        else {
            System.out.println("POSIÇÃO INVÁLIDA");
        }

        System.out.println("Voce quer continuar? [s/n]");
        stop = ler.next();


    }
    for (int val:v) {
        System.out.print("  " + val);
        //print vetor
        }
        System.out.println();
        System.out.println("total de números PARES: " + totpar);
        System.out.println("total de números IMPARES: " + totimpar);
        System.out.println("o segundo maior numero é " + (int) segundomaior);
        System.out.println("o maior número é " + maiornum);
    }
}