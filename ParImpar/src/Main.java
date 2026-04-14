import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("PAR OU ÍMPAR");
        System.out.print("Escreva um número: ");
            long num = ler.nextLong();
            if (num %2  == 0){
            System.out.println(num + " é par ");
        }   else{
        System.out.println(num + " é ímpar");

        }


    }
}