
public class Main {
    public static void main(String[] args) {

        /*int n [] = new int[4];
        *n[1] = 1;
        *n[2] = 2;
        *n[3] = 3;
        *System.out.println(n [1]);
        *outra forma de escrever vetor */

        int n[] = {3,2,8,7,5,4};
        System.out.println("O comprimento de N é: " + n.length);
        for (int cc=0; cc<=n.length - 1; cc++)
        //Contador <= n.length -1 funciona com vetor de qualquer tamanho\\
        //Pode ser contador < vet[].length vet++\\
        {
            System.out.println("  na posição  " + cc + "  temos " + n[cc]);
        }
    }
}