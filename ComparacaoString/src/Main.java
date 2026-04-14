
public class Main {
    public static void main(String[] args) {
    String nome1 =  "Gustavo";
    String nome2 = "Gustavo";
    String nome3 = new String("Gustavo");

    String res = (nome1==nome3)?"Igual":"Diferente";
        System.out.println(res);

        String res2 = (nome1.equals(nome3))?"Igual":"Diferente";
        //Pra identificar se o conteúdo do objeto é igual a classe usa-se a função .equals
        System.out.println(res2);


    }
}