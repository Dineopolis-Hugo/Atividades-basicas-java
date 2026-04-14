
public class Main {
    public static void main(String[] args) {

        float pot = (float) Math.pow(5 , 2);
            System.out.println("O resultado da potencia é " + pot);
        //potencia\\
        double valpi = Math.PI;
            System.out.printf ("O valor de PI é %.4f" ,valpi);
        //PI\\
        System.out.println();

        double raiz = Math.sqrt(25);
            System.out.println("O valor da raiz quadrada é: " + raiz );
        //raiz quadrada\\
        double raizc = Math.cbrt(125);
        System.out.println("O valor da raiz cubica é: " + raizc);
        //raiz cubica\\

        System.out.println("ARREDONDAMENTOS");
        System.out.println();

        int valtot= (-500);
        int valabs = Math.abs(valtot);
        System.out.println("O valor ABSOLUTO de " + valtot +" é " +valabs);
        //valor ABS\\
        double arb = (5.9);
                double floor = Math.floor(5.9);
        System.out.println("o arredondamento (para baixo) de " + arb + " é " + floor);
        //Arredondamento para baixo = floor\\
        double arc = (5.3);
                double ceil = Math.ceil(5.3);
        System.out.println("O arredondamento (para cima) de " + arc + " é " + ceil);
        //Arredondamento para cima = ceil\\
        double aar = (5.5);
                double round = Math.round(5.5);
        System.out.println("O arredondamento aritmedico de " + aar + " é " + round);
        //Arredondamento aritmedico = round\\
        double ale = Math.random();
        System.out.println("seu numero aleatorio entre 0 e 1 é: " + ale);
        //para mudar o numero  aleatorio usar (numero minimo + Math.random() * (numero limite - numero minimo))\\
        double AleDez = Math.random();
                int valor1a10 = (int) (1 + AleDez * (10-1));
        System.out.println("seu mumero aleatorio de 1 a 10 é " + valor1a10);











    }
}