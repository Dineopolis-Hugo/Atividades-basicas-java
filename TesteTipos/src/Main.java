//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // int idade = 30;
       /* String valor = idade;
        *Maneira errada
        */
       /* String valor = Integer.toString(idade);
        *System.out.println("A idade é: " + idade);
        *maneira para transformar string em int
        */

        String valor = "30.5";
        /* int idade = valor
        *Maneira errada de transformar string para int
        */

        //maneira certa string to int\\

        //int idade = Integer.parseInt(valor);\\

        //parse = converter de texto par numero\\

        float idade = Float.parseFloat (valor);
        System.out.println(idade);
        //transformar de string para float/num.reais\\
        }

    }
