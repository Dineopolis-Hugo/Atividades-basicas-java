import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        LocalDate dathj = LocalDate.now();
        //pegar data do sistema\\
        System.out.print("Que ano você nasceu? ");
         int nasc =  ler.nextInt();

            int ano = dathj.getYear();
            //puxar só o ano do sistema\\
            int idade = ano - nasc;

        System.out.println( "Sua idade é: " + idade);
        if (idade > 18){
            System.out.println("MAIOR DE IDADE");
        }
        else {
            System.out.println("MENOR DE IDADE");
        }
    }
}