
public class Main {
    public static void main(String[] args) {
        int maiordez = 0;
        int v[] = {10, 5, 12, 14, 9, 8, 16};
        //vetor\\
        //for ( int c=0; c<= v.length -1; c++) {
        //System.out.println("na posição " + c + " temos " + v[c]);
        //MOSTRA OS NUMEROS E AS POSIÇÕES DO VETOR\\

        for (int c = 0; c <= v.length - 1; c++) {
            if (v[c] > 10) {
                maiordez++;
                //loop para contar os números >10\\
            }
        }
            for (int valor : v) {
                System.out.print(valor + "  ");
                    //print vetor\\
            }
            System.out.println();
            System.out.println(maiordez + " Números foram >10");

    }
}





