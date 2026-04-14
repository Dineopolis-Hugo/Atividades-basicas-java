public class main {

   /* static void soma (int a , int b){
    * int s = a + b;
    * System.out.println("a soma é " + s);}
    * MÉTODO SOMA
    */



    static int soma (int a,int b){
        int s = a+b;
        return s;
        /*FUNÇÃO SOMA: A FUNÇAO NO LUGAR DE VOID
         *COLOCA O TIPO DO RETORNO E NO FINAL USA "RETURN"
         */
    }
//o metodo pode estar fora do METODO MAIN mas nao pode estar fora da CLASSE

    public static void main(String[] args) {
        System.out.println("começou o programa");
       int sm = soma(5,2);
       //NA FUNÇÃO COLOCA ELA NUMA VARIÁVEL\\
        System.out.println("a soma vale: " + sm);

    }
}
