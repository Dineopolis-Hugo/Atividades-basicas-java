import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Que ano voce nasceu? ");
        int anonasc = ler.nextInt();

        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        int idade = ano - anonasc;

        System.out.println("Sua idade é: " + idade);
        if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Seu voto é OPCIONAL");
        }
        else if (idade<16) {
            System.out.println("Você NÃO pode votar");

        }else System.out.println("Seu voto é OBRIGATÓRIO");


        }


    }
