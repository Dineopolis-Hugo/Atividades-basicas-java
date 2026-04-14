import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número (1 - 20) para fatoriar ");
        int num = ler.nextInt();
        long fat = 1;
        String sequencia = "";
        int cont = num;

        while (cont >= 1){
            fat *= cont;
            sequencia += cont + "*" ;
            //mostrar a sequencia da multiplicação\\
           cont--;
        }
        System.out.println(num + " fatorial, que é igual à: " + sequencia + " =" + fat);


    }



}