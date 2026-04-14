import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Que ano você nasceu?");
    int anonasc = ler.nextInt();

        LocalDate hoje =LocalDate.now();
            int ano = hoje.getYear();
            int idade = ano - anonasc;

        String ver1 = "Você é de maior,pois tem ";
        String ver2 = "Você é de menor,pois tem ";
            String verify = (idade>18)? ver1 + idade + " anos" : ver2 + idade + " anos";
                System.out.println(verify);

            String vote1 = "Seu voto é obrigatório pois você tem: ";
            String vote2 = "Seu voto e opcional, pois você tem: ";
            String votar = ((idade <=16 && idade <18) || (idade>70)) ? vote1 + idade + " Anos" : vote2 + idade + " Anos";
                System.out.println(votar);
        }
    }
