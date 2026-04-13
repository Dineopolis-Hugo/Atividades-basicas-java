import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String stop = "s";
        int maiornum= 0;
        int menornum= 999999999;

        int v[] = new int[6];
        //cria um novo vetor como objeto\\
        Arrays.fill(v, 0);
        //preenche todo o vetor de um valor X\\

        while (stop.equals("s")){
            System.out.print("Escolha um número ");
                    int num = ler.nextInt();
                        //input número\\
                    if (maiornum<= num){
                        maiornum = num;
                        /*se o maior numero registrado for menor que o numero digitado, o maior se torna
                         * o número digitado*/


                    }if (menornum>= num){
                        menornum = num;
                        /*Se o menor numero registrado for maior que o número digitado, o menor
                         * número se torna o número digitado
                         */
            }
            System.out.print("Escolha a posição no VETOR (0 A 5) ");
                    int pos = ler.nextInt();
                             //input posição\\
                    if (pos >= 0 && pos < v.length  ){
                       //se a posiçao do num for >=0 e do tamanho max do vetor ele salva o numero\\

                        v[pos] = num;}
                    //coloca o número digitado na posição digitada\\

                    else System.out.println("POSIÇÃO INVÁLIDA!");
                    //se a posição < 0 ou > o tamanho do vetor da erro\\

            System.out.println("Deseja continuar? [s/n] ");
                    stop= ler.next();
            //enquanto eu digitar "s" ele continua selecionando os números\\

        }
            ;
            System.out.println();
        System.out.println("o  MENOR número selecionado do vetor é: " + menornum);
                            //output menor número\\
        System.out.println("O MAIOR número selecionado do vetor é: " + maiornum);
                            //output maior numero\\
        System.out.println();

        System.out.println("_____________VETOR_______________");
            for (int val: v){
                System.out.print("    " + val);
                //PRINT VETOR\\
            }
    }
}