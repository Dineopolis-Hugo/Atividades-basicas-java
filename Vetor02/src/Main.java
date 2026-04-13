import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
        System.out.println("Em que ano estamos?");
            int ano = ler.nextInt();
                //ler ano\\


        String mes[] = {"jan", "fev", "mar","abr", "mai","jun",
                "jul","ago", "set", "out","nov", "dez",};
        int dias[] = {31,28,31,30,30,30,
                31,31, 30, 31,30,31,};
                //vetor dias e meses\\

        if (ano %4 == 0 && ano %100 !=0 ||ano %400 == 0){
                dias[1] = 29;}
        //se o ano for bissexto fevereiro tem 29 dias\\
        for (int cont= 0; cont< mes.length; cont++){
                System.out.println("O mês de " + mes[cont] + " tem " + dias[cont] + " dias");}
        //mostrar meses (vet) e quantos dias (vet) tem\\
    }
}