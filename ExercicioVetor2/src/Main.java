import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[] = new int [10];
        String stop = "s";
        Arrays.fill(v,0);
        //vaz todo o vetor ter valor ZERO\\

        while(stop.equals ("s")) {
            System.out.println("Digite o numero");
                 int num = ler.nextInt();
            System.out.println("digite a posição 0 a 9 ");
                int pos = ler.nextInt();

            if (pos >=0 && pos < v.length){
                //v.lenght mostra o tamanho do vetor\\
                v[pos] = num;}
           //Coloca o número digitado (num) dentro da posição escolhida (pos)\\
            else {
                System.out.println("Posição inválida!");}

            System.out.print("Quer continuar? [s/n]");
                stop = ler.next();
        }
        for (int val:v){
            System.out.print(val + "  ");
            //mostrar vetor\\
        }

    }
}