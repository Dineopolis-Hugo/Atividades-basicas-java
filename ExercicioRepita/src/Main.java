import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int totval = 0;
        int totpar = 0;
        int totimpar = 0;
        int ac100 = 0;
        int soma = 0;
        int contagem = 0;
        String stop;

        do {
            System.out.print("escreva um número ");
                int n = ler.nextInt();
            totval+=1;
            soma += n;
            contagem++;

            System.out.println("quer continuar? [s/n]" );
            stop = ler.next();
                if (n %2 == 0){
                totpar++;
            }   else if (n %2 == 1) {
                totimpar++;

            } if (n >= 100) {
                ac100++;

            }

        }       while (stop.equals("s"));

        double media = (double) soma/contagem;
            System.out.println("o total de numeros foram " + totval);
            System.out.println("o total de numeros pares foram " + totpar);
            System.out.println("o total de numeros impares foram " + totimpar);
            System.out.println("o total de numeros maior que 100 foram " + ac100);
            System.out.printf("a média dos números é: %.2f ", media);


    }
}