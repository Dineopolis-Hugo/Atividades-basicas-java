import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v , 0);
        //O Arrays.FILL vai preencher todos os numeros do vetor com um numero X\\
        for  (int valor: v){
            System.out.print(valor + " ");
        }
    }
}