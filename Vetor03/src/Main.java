import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double v[] = {3.5,2.75,9,-4.5};
        Arrays.sort(v);
        //FUNÇÃO PARA ORDENAR O VETOR\\
        for (double valor: v)
        //criou a variavel VALOR que pega todos os valores de V para simplificar\\
        {
            System.out.print(valor + "  ");
        }

    }
}